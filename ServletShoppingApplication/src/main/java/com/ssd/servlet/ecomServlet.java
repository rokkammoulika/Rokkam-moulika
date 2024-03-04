package com.ssd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dao.ecomDao;
import com.ssd.Dto.ecomDto;
import com.ssd.service.ecomService;
import com.ssd.util.Validation;




/**
 * Servlet implementation class ecomServlet
 */
public class ecomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ecomService Service;
	public void init() {
		ecomDao dao=new ecomDao();
		Service=new ecomService(dao);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ecomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getServletPath();
		System.out.println("................."+action);
		try {
			switch(action) {
		case "/login":
		loginpage(request, response);
		break;
		case "/signup":
		signuppage(request, response);
		break;
		case "/userlogin":
			loginform(request, response);
			break;
		case "/usersignup":
			insert(request, response);
			break;
		default:
			listUser(request, response);
			System.out.println("monika.....................................");
			break;
			}
			} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private void signuppage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getServletPath());
		response.sendRedirect("signup.jsp");
	}
	private void loginpage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getServletPath());
		response.sendRedirect("login.jsp");
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.sendRedirect("index.jsp");
	}
	private void insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getServletPath());
		ecomDto dto=new ecomDto();
		String name=request.getParameter("Name");
		String email=request.getParameter("Email");
		String phoneNo=request.getParameter("PhoneNo");
		String adhaar=request.getParameter("Adhaar");
		String password=request.getParameter("Password");
		String errorMsg="Please enter valid";
		boolean isValidation=true;
		if(name!=null && !name.isEmpty() && name.length()>2 && name.length()<45 && Validation.validateLetters(name)) {
			dto.setName(name);
		}else {
			isValidation=true;
			errorMsg=errorMsg+   "Name";
			request.setAttribute("isValidation", isValidation);
			request.setAttribute("errorMsg", errorMsg);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		if(email!=null && !email.isEmpty() &&  email.length()>2 && email.length()<45 && Validation.validate(email)) {
			dto.setEmail(email);
		}
		else {
			isValidation=true;
			errorMsg=errorMsg+  "Email";
			request.setAttribute("isValidation", isValidation);
			request.setAttribute("errorMsg", errorMsg);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		if(phoneNo!=null && !phoneNo.isEmpty() &&  Validation.validatePhoneNo(phoneNo)) {
			dto.setPhoneNo(phoneNo);
		}else {
			isValidation=true;
			errorMsg=errorMsg+  "PhoneNo";
			request.setAttribute("isValidation", isValidation);
			request.setAttribute("errorMsg", errorMsg);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		if(adhaar!=name && !adhaar.isEmpty() &&  Validation.isValidAadhaarNumber(adhaar)) {
			dto.setAdharNo(adhaar);
		}else {
			isValidation=true;
			errorMsg=errorMsg+  "adhaar";
			request.setAttribute("isValidation", isValidation);
			request.setAttribute("errorMsg", errorMsg);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
		if(isValidation) {
		    dto.setPassword(password);
			Service.insertUserData(dto);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	private void loginform(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String email=request.getParameter("Email");
		String password=request.getParameter("Password");
		
		ecomDto user=Service.IsLogin(email, password);
		if(user!=null) {
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("./ProductList").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
		
	
		
	}

}
