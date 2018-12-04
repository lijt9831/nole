<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="scheme" value="${pageContext.request.scheme}" />
<c:set var="serverName" value="${pageContext.request.serverName}" />
<c:set var="serverPort" value="${pageContext.request.serverPort}" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<c:set var="baseUrl" value="${scheme}://${serverName}:${serverPort}${contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${baseUrl}/resources/bui/css/dpl.css" rel="stylesheet" type="text/css" />
<link href="${baseUrl}/resources/bui/css/bui.css" rel="stylesheet" type="text/css" />
<link href="${baseUrl}/resources/main/css/main-min.css" rel="stylesheet" type="text/css" />

<!-- http://api.jquery.com/category/version/3.1/ -->
<script type="text/javascript" src="${baseUrl}/resources/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="${baseUrl}/resources/bui/seed.js?v=1"></script>
<script type="text/javascript" src="${baseUrl}/resources/main/js/main.js"></script>

<script type="text/javascript">
$(document).on('keydown', function(e) {
	// F5 刷新当前子页面 
	if (116 == e.keyCode) {
		if (top.topManager) {
			e.preventDefault();
			top.topManager.reloadPage();
		}
	}
});
</script>
</head>
</html>