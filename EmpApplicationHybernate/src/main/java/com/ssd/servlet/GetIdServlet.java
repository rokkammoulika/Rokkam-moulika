package com.ssd.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Entity.EmployeeEntity;
import com.ssd.Service.EmployeeService;



/**
 * Servlet implementation class GetIdServlet
 */
public class GetIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empid=request.getParameter("empno");
		Integer empNo=Integer.valueOf(empid);
		EmployeeService service=new EmployeeService();
	EmployeeEntity user=service.getUserById(empNo);
	List<EmployeeEntity> emplist=new ArrayList<EmployeeEntity>();
	emplist.add(user);
	request.setAttribute("emplist", emplist);
	request.getRequestDispatcher("userList.jsp").forward(request, response);
	}

}
