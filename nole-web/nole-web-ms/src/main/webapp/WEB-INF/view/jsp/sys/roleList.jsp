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
              title:'角色',
              dataIndex:'role',
              width:150
            },
            {
              title:'状态',
              dataIndex:'isAvailable',
              width:100,
              renderer:function(value,obj) {
                return value == 1 ? '已启用':'已冻结';
              }
            },
            {
              title:'权限总数',
              dataIndex:'permissionCnt',
              width:100
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
            	editStr += '<shiro:hasPermission name="sys/roleEdit">';
                editStr += '<span onclick="roleEdit('+obj.id+')" class="grid-command btn-edit" title="编辑角色">编辑</span>';
                editStr += '</shiro:hasPermission>';
                delStr += '<shiro:hasPermission name="sys/deleteRole">';
                delStr += '<span class="grid-command btn-del" onclick="show('+obj.id+')" title="删除角色">删除</span>';
                delStr += '</shiro:hasPermission>';
                return editStr+delStr;
              }
            } ];

        var store = new Data.Store({
          url:'getRoleConfig',
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
  
  function show (roleId) {
      BUI.Message.Confirm('确认要删除选中的数据么？',function(){
        setTimeout(function(){
        	var idArray = [];
        	if(roleId){
        		idArray.push(roleId);
        	}else{
        		// 批量 
	        	$.each(grid.getSelection(),function(i,n){
	        		idArray.push(n.id);
	        	});
        	}
        	loadMask.show();
        	var data={deletedKeyArray:JSON.stringify(idArray)};
            $.post("deleteRole", data, function(result) {
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
  function roleEdit(id) {
    top.topManager.openPage({
      // 这个id是用来确定 tab页面唯一的 ，不设置id会打开多个 
      id:'roleEdit',
      href:'sys/roleEdit?id='+id,
      title:'角色编辑'
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
              <label class="control-label">角色：</label>
              <div class="controls"><input type="text" name="role" class="control-text"></div>
            </div>
            <div class="control-group span5">&nbsp;&nbsp;&nbsp;
              <shiro:hasPermission name="sys/getRoleConfig">
              <button id="btnSearch" type="submit" class="button button-primary">搜 索</button>&nbsp;
              </shiro:hasPermission>
              <shiro:hasPermission name="sys/deleteRole">
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