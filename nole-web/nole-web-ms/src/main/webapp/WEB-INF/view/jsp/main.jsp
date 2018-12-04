<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>新星管理后台</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript">
// Handler for .ready() called.
$(function() {
	$.get("sys/getMainPageConfig",function(config) {
		// 设置tab
		$.each(config,function(i, n) {
			if (n.icon && n.text) {
				$('#J_Nav').append('<li class="nav-item dl-selected"><div class="nav-item-inner nav-' + n.icon + '">' + n.text + '</div></li>');
			}
		});
		// 设置 tree
		new PageUtil.MainPage({
			modulesConfig : config
		});
	});
});

function logout(){
	if(confirm('确定要退出吗？')){
		window.location.href = "logout";
	}
}
</script>
</head>
<body>
	<div class="header">
		<div class="dl-title">
			时间是一切财富中最宝贵的财富。 —— 德奥弗拉斯多
		</div>
		<div class="dl-log">
			欢迎您，<span class="dl-log-user"><shiro:principal/></span><a href="#" title="退出系统" onclick="logout()" class="dl-log-quit">[退出]</a>
		</div>
	</div>
	<div class="content">
		<div class="dl-main-nav">
			<ul id="J_Nav" class="nav-list ks-clear">
				<!-- tabs -->
			</ul>
		</div>
		<ul id="J_NavContent" class="dl-tab-conten">
			<!-- trees -->
		</ul>
	</div>
</body>
</html>
