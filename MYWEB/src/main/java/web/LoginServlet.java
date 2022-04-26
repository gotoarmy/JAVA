package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException{
		
		String id =request.getParameter("id");
		String pwd =request.getParameter("pwd");
		
		if(id !=null&&pwd !=null)
		{
		     HttpSession session =request.getSession();
		     session.setAttribute("idKey", id); //id¸¦ ¼¼¼ÇÀÌ¶û ¹­´Â´Ù.
		}
		response.sendRedirect("login.jsp");
	}
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() ½ÇÇàµÊ!");
	}
	
	
	

}
