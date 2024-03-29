package com.ssd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Entity.EmployeeEntity;
import com.ssd.Service.EmployeeService;


/**
 * Servlet implementation class updateServlet
 */
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Id=request.getParameter("id");
		Integer userId=Integer.valueOf(Id);
		EmployeeService service=new EmployeeService();
	EmployeeEntity user=service.getUserById(userId);
		request.setAttribute("user", user);
        request.getRequestDispatcher("Signup.jsp").forward(request, response);
	}

}
