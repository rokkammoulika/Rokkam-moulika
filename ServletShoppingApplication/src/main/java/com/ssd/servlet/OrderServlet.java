package com.ssd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dto.CartDto;
import com.ssd.Dto.ecomDto;
import com.ssd.service.OrderService;


/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ecomDto ecomdto=(ecomDto) request.getSession().getAttribute("user");
		String action=request.getParameter("action");
		
		Integer productId=Integer.valueOf(request.getParameter("id"));
		
	   
		OrderService service =new OrderService();
		
		
		if(action!=null && action.equalsIgnoreCase("landing")) {
			
			service.insertData(productId, 1,ecomdto.getUserId());
			request.getRequestDispatcher("orderList").forward(request, response);
			return;
		}else {
			 Integer quantity=Integer.valueOf(request.getParameter("quantity"));
			service.insertData(productId, quantity,ecomdto.getUserId());
			
			List<CartDto> oldCartlist = (List<CartDto>) request.getSession().getAttribute("oldCartList");
			int index=0;
			for(CartDto dto:oldCartlist) {
				if(dto.getId()==productId) {
				index=oldCartlist.indexOf(dto);
				}
				
			}
			oldCartlist.remove(index);
			request.getSession().setAttribute("oldCartlist", oldCartlist);
			request.getRequestDispatcher("Cartlist").forward(request, response);
			return;
			
		}
	}

}
