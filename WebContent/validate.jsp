<%@ page language = "java" contentType="text/html; charset=gb2312" 
	pageEncoding="gb2312"%>
<%@ page import = "java.sql.*,bean.easybooks.bookstore.User" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("UTF-8");
	String usr = request.getParameter("username");
	String pwd = request.getParameter("password");
	User ui = new User();
	ui.setUsername(usr);
	ui.setPassword(pwd);
	boolean validated = false;
	validated = ui.isValidated();
	if(validated){
		%>
		<jsp:forward page="welcome1.jsp"/>
		<% 
	}
	else{
		%>
		<jsp:forward page="error.jsp"/>
		<% 
	}
	%>
</body>
</html>
