<%@ page contentType="text/html; charset=GBK" import="java.util.*,bean.easybooks.bookstore.User"%>
<html>
  <head>
    <title>�û���Ϣ�б�</title>
  </head>  
  <body>
  <center>
  <h2>�û���Ϣ�б�</h2>
  <table border bordercolor="blue">
  <tr><th>���</th>�û���</tr>
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
