<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'showCountry.jsp' starting page</title>	
  </head>
  
  <body>
    <h1>信息列表</h1>
    <c:forEach var="bean" items="${list}" >
		${bean.name} | ${bean.id} | ${bean.country.name}<br/>    	
    </c:forEach>
  </body>
</html>

