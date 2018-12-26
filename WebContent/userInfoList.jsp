<%@ page contentType="text/html; charset=GBK" import="java.util.*,bean.easybooks.bookstore.User"%>
<html>
  <head>
    <title>用户信息列表</title>
  </head>  
  <body>
  <center>
  <h2>用户信息列表</h2>
  <table border bordercolor="blue">
  <tr><th>序号</th>用户名</tr>
    <%        ArrayList<User>     list=(ArrayList<User>)request.getAttribute("list");
        int i=1;
        for(User ui:list){
    %>

   <tr>
         <td align="center"><%=i%>
         <td align="center"><%=ui.getUsername()%>
    </tr>
    <%       
         i++;
        }
    %>
  </table>
  </center>
  </body>
</html>
