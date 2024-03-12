package com.ssd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Entity.EmployeeEntity;
import com.ssd.Service.EmployeeService;



/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id = Integer.parseInt(request.getParameter("empno"));
		String name = request.getParameter("ename");
		String job = request.getParameter("job");
		Integer mgr =Integer.valueOf(request.getParameter("mgr"));
		String hiredate = request.getParameter("hiredate");
		Double sal =Double.valueOf(request.getParameter("sal"));
		Double comm =Double.valueOf(request.getParameter("comm"));
		Integer deptno =Integer.valueOf(request.getParameter("deptno"));
		
		EmployeeEntity user=new EmployeeEntity(id,name,job,mgr,hiredate,sal,comm,deptno);
		EmployeeService service=new EmployeeService();
		service.saveOrUpdateStudent(user, id);
		response.sendRedirect("./EmployeeServlet");
		
	}

}
