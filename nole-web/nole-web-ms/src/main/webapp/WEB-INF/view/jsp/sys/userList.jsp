<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  var grid;
  var loadMask;
  $(function() {
    BUI.use(['bui/form','bui/grid','bui/data','bui/toolbar','bui/mask'],
      function(Form,Grid,Data,Toolbar,Mask) {
        var columns = [
            {
              title:'用户名',
              dataIndex:'username',
              width:150
            },
            {
              title:'昵称',
              dataIndex:'nickname',
              width:150
            },
            {
              title:'创建时间',
              dataIndex:'createTime',
              width:150,
              renderer:function(value,obj) {
                return BUI.Grid.Format.datetimeRenderer(value.time);
              }
            },
            {
              title:'操作',
              dataIndex:'id',
              width:100,
              renderer:function(value,obj) {
              	var editStr = '';
            	var delStr = '';
            	editStr += '<shiro:hasPermission name="sys/userEdit">';
                editStr += '<span onclick="userEdit('+obj.id+')" class="grid-command btn-edit" title="编辑用户">编辑</span>';
                editStr += '</shiro:hasPermission>';
                delStr += '<shiro:hasPermission name="sys/deleteUser">';
                delStr += '<span class="grid-command btn-del" onclick="show('+obj.id+')" title="删除用户">删除</span>';
                delStr += '</shiro:hasPermission>';
                return editStr+delStr;
              }
            } ];

        var store = new Data.Store({
          url:'getUserConfig',
          autoLoad:true,
          proxy:{//设置请求相关的参数
            method:'post',
            dataType:'json',//返回数据的类型
            limitParam:'pageSize',//一页多少条记录
            startParam:'pageNum'
          },
          pageSize:10,
          root:'records',
          totalProperty:'totalCount'
        });

        grid = new Grid.Grid({
          render:'#grid',
          columns:columns,
          loadMask:true,
          store:store,
          plugins:[ Grid.Plugins.CheckSelection ],
          // 底部工具栏
          bbar:{
            // pagingBar:表明包含分页栏
            pagingBar:true
          },
          store:store
        });

        grid.render();
        var form = new Form.Form({
          srcNode:'#searchForm'
        }).render();
        form.on('beforesubmit',function(ev) {
          //序列化成对象
          var obj = form.serializeToObject();
          obj.start = 0;
          store.load(obj);
          return false;
        });
        loadMask=new Mask.LoadMask({
            el:'body',
            msg:'loading ....'
        });
      });//BUI
      $('#btnDelete').click(function(){
    	  show();
      });

  });//ready
  
  function show (userId) {
      BUI.Message.Confirm('确认要删除选中的数据么？',function(){
        setTimeout(function(){
        	var idArray = [];
        	if(userId){
        		idArray.push(userId);
        	}else{
        		// 批量 
	        	$.each(grid.getSelection(),function(i,n){
	        		idArray.push(n.id);
	        	});
        	}
        	loadMask.show();
        	var data={deletedKeyArray:JSON.stringify(idArray)};
            $.post("deleteUser", data, function(result) {
                loadMask.hide();
                BUI.Message.Show({
                  msg:result.content,
                  icon:result.code,
                  closeable:false,
                  cancel:function() {
                    return false;
                  },
                  buttons:[{
                    text:'确定',
                    elCls:'button button-primary',
                    handler:function() {
                      this.hide();
                      if (top.topManager && result.code=='success') {
                        top.topManager.reloadPage();
                      }
                    }
                  }]
                })
              });// post 
        });
        
      },'warning');
  }
  function userEdit(id) {
    top.topManager.openPage({
      // 这个id是用来确定 tab页面唯一的 ，不设置id会打开多个 
      id:'userEdit',
      href:'sys/userEdit?id='+id,
      title:'用户编辑'
    });
  }
</script>
</head>
<body>
  <div class="container">
    <div class="span18">
      <hr />
      <!-- 搜索页 ================================================== -->
      <div class="span24">
        <form id="searchForm" class="form-horizontal" tabindex="0" style="outline: none;">
          <div class="row">
            <div class="control-group span13">
              <label class="control-label">用户名：</label>
              <div class="controls"><input type="text" name="username" class="control-text"></div>
            </div>
            <div class="control-group span5">&nbsp;&nbsp;&nbsp;
              <shiro:hasPermission name="sys/getUserConfig">
              <button id="btnSearch" type="submit" class="button button-primary">搜 索</button>&nbsp;
              </shiro:hasPermission>
              <shiro:hasPermission name="sys/deleteUser">
              <button id="btnDelete" type="button" class="button button-danger"><i class="icon-white icon-trash"></i>删 除</button>
              </shiro:hasPermission>
            </div>
          </div>
        </form>
      </div>
      <hr />
      <div id="grid"></div>
    </div>
  </div>
</body>
</html>