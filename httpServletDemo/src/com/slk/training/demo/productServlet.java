package com.slk.training.demo;


import java.io.*;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.slk.training.dao.ProductDaoImpl;
import com.slk.training.model.loginBean;
import com.slk.training.model.productBean;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/product")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ProductDaoImpl pdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		PrintWriter out=response.getWriter();
		try{
			
			/*HttpSession session=request.getSession(false);
			loginBean name=(loginBean)session.getAttribute("sname");
			response.sendRedirect("product.jsp");
			pdao=new ProductDaoImpl();
			List<productBean> products=pdao.getAllProducts();
			HttpSession session1=request.getSession();
			session1.setAttribute("products", products);*/
			response.sendRedirect("product.jsp");
			//out.print("<h3>Logged in as "+name.getName()+"</h3>");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			out.println("login again ");
			request.getRequestDispatcher("home.html").include(request, response);
		}
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
