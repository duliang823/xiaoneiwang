<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'test.jsp' starting page</title>
  
  </head> 	
  <body>
    <h1>显示国家信息</h1>
  	<a href="/xiaoneinew/test.do?flag=test">测试一下</a>
  </body>
</html>



