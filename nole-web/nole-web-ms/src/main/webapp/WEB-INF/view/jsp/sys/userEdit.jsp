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
    function(Form,Data,Mask){
      var form = new Form.Form({
        action:'updateUser',
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
      form.on('beforesubmit',function(ev) {
     	 var roleIdArray = [];
          $.each($("input:checkbox[name=roleId]:checked"),function(i,n){
         	 roleIdArray.push($(n).val());
          });
          $("#roleIds").val(roleIdArray.join(","));
      });
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
          <h3>账户信息：</h3>
          <div class="control-group">
            <label class="control-label"><del>*</del>用户名：</label>
            <div class="controls">
              <input type="text" name="username" class="input" value="${user.username }" data-rules="{required:true}" data-tip="{text:'请输入用户名'}">
            </div>
          </div>
          <h3>基本信息：</h3>
          <div class="control-group">
            <label class="control-label">昵称：</label>
            <div class="controls">
              <input type="text" name="nickname" class="input" value="${user.nickname }" data-tip="{text:'请输入昵称'}">
            </div>
          </div>
          <h3>角色分配：</h3>
          <div class="control-group">
            <label class="control-label">角色：</label>
            <div class="bui-form-group controls">
                <c:forEach items="${roleArray}" var="item">
                  <c:if test="${item.checked == 1}">
		              <label class="checkbox"><input type="checkbox" name="roleId" value="${item.id}" checked="checked"/>${item.role }</label>
                  </c:if>
                  <c:if test="${item.checked == 0}">
		              <label class="checkbox"><input type="checkbox" name="roleId" value="${item.id}" />${item.role }</label>
                  </c:if>
           		</c:forEach>
            </div>
          </div>
          <input type="hidden" name="roleIds" id="roleIds">
          <input type="hidden" name="id" value="${user.id }">
          <div class="form-actions">
          	<shiro:hasPermission name="sys/updateUser">
            <button id="btnSubmit" type="submit" class="button button-primary">提交</button>
            </shiro:hasPermission>
          </div>
        </form>
      </div>
    </div>
  </div>
</body>
</html>