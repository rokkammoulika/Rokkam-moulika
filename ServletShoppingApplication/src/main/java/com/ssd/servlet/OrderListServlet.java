package com.ssd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dto.OrderDto;
import com.ssd.Dto.ecomDto;
import com.ssd.service.OrderService;



/**
 * Servlet implementation class OrderListServlet
 */
public class OrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("jafdj,xhbvjxgdjkfn");
		ecomDto ecomdto=(ecomDto) request.getSession().getAttribute("user");
		OrderService service=new OrderService();
		List<OrderDto> oderslist=  service.getAllOrders(ecomdto.getUserId());
		request.setAttribute("oderslist", oderslist);
		request.getRequestDispatcher("OrderList.jsp").forward(request, response);
		
	}

}
