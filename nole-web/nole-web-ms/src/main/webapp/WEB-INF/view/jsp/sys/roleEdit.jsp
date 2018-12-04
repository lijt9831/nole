<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色编辑</title>
<script type="text/javascript">
  $(function(){
    BUI.use(['bui/form','bui/tree','bui/data','bui/mask'],
    function(Form,Tree,Data,Mask){
      //树节点数据，
      //text:文本，
      //id:节点的id,
      //leaf ：标示是否叶子节点，可以不提供，根据childern,是否为空判断
      //expanded ： 是否默认展开
      //checked:节点是否默认选中
      var store = new Data.TreeStore({
        url:'getPermissionConfig?roleId=${id}'
      });
      //由于这个树，不显示根节点，所以可以不指定根节点
      var tree = new Tree.TreeList({
        heigth:'400px',
        width:'400px',
        render:'#t1',
        store:store,
        checkType:'all',//checkType:勾选模式，提供了4中，all,onlyLeaf,none,custom
        showLine:true
      //显示连接线
      });
      tree.render();
      store.load();
      tree.on('checkedchange',function(ev){
        var checkedNodes = tree.getCheckedNodes();
        var str = '';
        BUI.each(checkedNodes,function(node){
          str += node.id + ',';
        });
        $('#permissionIds').val(str);
      });
      var form = new Form.Form({
        action:'updateRole',
        method:'post',
        srcNode:'#J_Form',
        submitType:'ajax',
        submitMask:{
          el:'body',
          msg:'loading ....'
        },
        callback:function(result){
          BUI.Message.Show({
            msg:result.content,
            icon:result.code,
            closeable:false,
            cancel:function(){
              return false;
            },
            buttons:[{
              text:'确定',
              elCls:'button button-primary',
              handler:function(){
                this.hide();
                if (top.topManager && result.code == 'success'){
                  top.topManager.reloadPage();
                }
              }
            }]
          });// end msg show
        }
      });// end form
      form.render();
    });// end BUI function
  });
</script>
</head>
<body>
  <div class="container">
    <!-- 表单页 ================================================== -->
    <div class="row">
      <div class="span24">
        <hr>
        <form id="J_Form" class="form-horizontal">
          <h3>基本信息：</h3>
          <div class="control-group">
            <label class="control-label"><del>*</del>角色：</label>
            <div class="controls">
              <input type="text" name="role" value="${role}" class="input" data-rules="{required:true}" data-tip="{text:'请输入角色名称'}">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label"><del>*</del>状态：</label>
            <div class="controls">
              <c:if test="${isAvailable == 1}">
                <input type="radio" name="isAvailable" value="1" checked="checked"> 启用
                <input type="radio" name="isAvailable" value="0"> 冻结
              </c:if>
              <c:if test="${isAvailable == 0}">
                <input type="radio" name="isAvailable" value="1"> 启用
                <input type="radio" name="isAvailable" value="0" checked="checked"> 冻结
              </c:if>
            </div>
          </div>
          <h3>绑定权限：</h3>
          <div class="control-group">
            <label class="control-label">权限：</label>
            <div class="controls control-row4">
              <div id="t1" style="height:300px;overflow:auto"></div>
            </div>
          </div>
          <div class="form-actions">
          	<shiro:hasPermission name="sys/updateRole">
            <button id="btnSubmit" type="submit" class="button button-primary">提交</button>
          	</shiro:hasPermission>
          </div>
          <input id="permissionIds" name="permissionIds" type="hidden">
          <input id="roleId" name="id" value="${id}" type="hidden">
        </form>
      </div>
    </div>
  </div>
</body>
</html>