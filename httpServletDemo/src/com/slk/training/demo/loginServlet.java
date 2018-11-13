package com.slk.training.demo;


import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.slk.training.model.loginBean;
/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("userName");
		String pass=request.getParameter("password");
		
		loginBean lBean=new loginBean();
		lBean.setName(name);
		lBean.setPass(pass);
		boolean status=lBean.validate();
		
		if(status){
			
			out.print("<h3>Logged in as "+name+"</h3>");
			HttpSession session=request.getSession();
			session.setAttribute("sname", lBean);
			
			request.getRequestDispatcher("menu.html").include(request, response);
		}
		else{
			out.print("Invalid login credentials");
			request.getRequestDispatcher("home.html").include(request, response);
		}
		out.close();
		
			
	}
}
