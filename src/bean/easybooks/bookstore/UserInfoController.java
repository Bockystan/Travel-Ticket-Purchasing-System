package bean.easybooks.bookstore;
import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import compsg.ele.entity.User;

/**
 * Servlet implementation class UserInfoController
 */
public class UserInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		
		request.setCharacterEncoding("UTF-8");
		String actionUrl = request.getServletPath();
		if(actionUrl.equals("/register.action")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User ui = new User();
			ui.setUsername(username);
			if(ui.checkName()){
				request.getRequestDispatcher("userExist.html").forward(request, response);
				
			}
			else{
				ui.setPassword(password);
				int result = ui.registerUser();
				if(result == 1)
				request.getRequestDispatcher("regSuccess.html").forward(request, response);
				else
				request.getRequestDispatcher("regFailure.html").forward(request, response);
			}
			
		}
		else if(actionUrl.equals("/checkName.action")){
			String username = request.getParameter("username");
			User ui = new User();
			ui.setUsername(username);
			boolean exist = ui.checkName();
			if(exist)
				request.getRequestDispatcher("userExist.html").forward(request, response);
				
			
			else
				request.getRequestDispatcher("userNoExist.html").forward(request, response);
		}	
			else if(actionUrl.equals("/userList.action")){
				ArrayList<User> list = User.getUserList();
				request.setAttribute("list",list);
				request.getRequestDispatcher("userInfoList.jsp").forward(request, response);
				
			}
			
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}





