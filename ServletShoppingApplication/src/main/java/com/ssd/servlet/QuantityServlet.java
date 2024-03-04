package com.ssd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dto.CartDto;



/**
 * Servlet implementation class QuantityServlet
 */
public class QuantityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuantityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
List<CartDto> oldCartlist = (List<CartDto>) request.getSession().getAttribute("oldCartList");
		
		String action=request.getParameter("action");
		String id=request.getParameter("id");
		Integer productId=Integer.valueOf(id);
		for(CartDto dto:oldCartlist) {
			if(dto.getId()==productId) {
				if(action.equalsIgnoreCase("inc")) {
					dto.setQuantity(dto.getQuantity()+1);	
				}else {
					dto.setQuantity(dto.getQuantity()-1);
				}	
			}
		}
		request.getRequestDispatcher("Cartlist").forward(request, response);
	}

}
