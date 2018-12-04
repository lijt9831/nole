<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>极限运动管理后台</title>
<link href="${baseUrl}/resources/login/css/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript">
  $(function(){
	// session 失效时,iframe 嵌套问题 
	if(top!=self){  
        if(top.location != self.location)  
             top.location=self.location;   
    }
    BUI.use([ 'bui/form','bui/mask' ], 
     function(Form, Mask){
      var loadMask = new Mask.LoadMask({
            el : 'body',
            msg : '登录中...'
      });
      var successMask = new Mask.LoadMask({
          el : 'body',
          msg : '登录成功...'
      });
      var failureMask = new Mask.LoadMask({
          el : 'body',
          msg : '登录失败...'
      });
      var redirectMask = new Mask.LoadMask({
          el : 'body',
          msg : '重定向...'
      });
      
      function gotoSuccess(){
    	  loadMask.hide();
    	  successMask.show();
    	  setTimeout(function(){
    		  successMask.hide();
        	  redirectMask.show();
        	  setTimeout("window.location.href='main'",1000);
    	  },1000);
      }
      
      function gotoFailure(msg){
    	  loadMask.hide();
    	  failureMask.show();
    	  setTimeout(function(){
        	  alert(msg);
      		  loadMask.hide();
      		  $("#captcha").show();
      		  $("#captcha").val("");
      		  $("#captchaImage").show();
      		  $("#captchaImage").attr("src","img/getCaptcha?v=" + Math.random());
    	  },200);

      }

      var form = new Form.Form({
        action:'logining',
        method:'post',
        srcNode:'#J_Form',
        submitType:'ajax',
        submitMask:{
          el:'null'
        },
        callback:function(result){
        	if (result.code == 'success'){
        		setTimeout(function(){
        			gotoSuccess();
        		},500);
        	}else{
        		setTimeout(function(){
        			gotoFailure(result.content);
        		},500);
        	}
        }
      });//form
      form.on('beforesubmit',function(ev) {
    	  if(!$.trim($("#username").val())){
    		  $("#username").focus();
    		  return false;
    	  }
    	  if(!$.trim($("#password").val())){
    		  $("#password").focus();
    		  return false;
    	  }
    	  if($("#captcha").css("display") != "none" && !$.trim($("#captcha").val())){
    		  $("#captcha").focus();
    		  return false;
    	  }
    	  loadMask.show();
      });
      form.render();
    });
  });
  
  function getCaptcha(){
	  $("#captchaImage").attr("src","img/getCaptcha?v=" + Math.random());
  }
</script>
</head>
<body>
	
	<div style="margin-top:30px">&nbsp;</div>
	<form id="J_Form" name="login-form" class="login-form form-horizontal">
		<div class="header-1">
			<h1>登录</h1>
		</div>
		<div class="content">
			<input id="username" name="username" type="text" class="input username" placeholder="Username" />
			<input id="password" name="password" type="password" class="input password" placeholder="Password" />
			<input id="captcha" name="captcha" type="text" style="width:45px;height:25px;display: none;" class="input captcha" placeholder="验证码" />
			<img id="captchaImage" title="验证码" width="47%" style="display: none;" onclick="getCaptcha()">
		</div>
		<div class="footer">
			<input type="submit" name="submit" value="登录" class="button" />
		</div>
	</form>
	<div class="gradient"></div>
</body>
</html>
