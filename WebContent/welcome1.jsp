<%@ page language="java" contentType="text/html; charset=utf-8"
    %>
<html>
    <head>
		<title>成功页面</title>
	</head>
	
<body leftmargin=0 topmargin=0 background="D:\Users\范博奇\workspace\TicketSystem\WebContent\WEB-INF\lib\欢迎.jpg">
<table  border=0  cellpadding=0  cellspacing=0  width=100%  height=100%>  
	<tr><td  width=100% align=center  valign=center>  
       <font size ="9"; color="gray"> <br><%out.print(request.getParameter("username"));%>,您好！欢迎光临!</br>
        <input type="button" button style="width:150px;height:50px;"onclick="window.location.href('welcome.jsp')" value="登录"/>
        <input type="button" button style="width:150px;height:50px;"onclick="window.location.href('login.jsp')" value="返回"/>
	</font>
			
	</td></tr>  
</table> 
</body>
</html>



