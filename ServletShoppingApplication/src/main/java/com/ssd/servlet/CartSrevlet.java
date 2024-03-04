package com.ssd.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssd.Dto.CartDto;



/**
 * Servlet implementation class CartSrevlet
 */
public class CartSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartSrevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		List<CartDto> oldCartList=(List<CartDto>) session.getAttribute("oldCartList");
		List<CartDto> newCartlist=new ArrayList<CartDto>();
		String id=request.getParameter("id");
		Integer productId=Integer.valueOf(id);
		CartDto cdto=new CartDto();
		if(oldCartList!=null && !oldCartList.isEmpty()&& oldCartList.size()>0) {
			newCartlist=oldCartList;
			for(CartDto cart:newCartlist) {
				if(cart.getId()==productId) {
					request.getRequestDispatcher("CartExist.jsp").forward(request, response);
					return;
					
				}
			}
			
			cdto.setId(productId);
			cdto.setQuantity(1);
			oldCartList.add(cdto);
			session.setAttribute("oldCartList", newCartlist);
			request.getRequestDispatcher("ProductList").forward(request, response);
			
		}else {
		cdto.setId(productId);
		cdto.setQuantity(1);
		newCartlist.add(cdto);
	
		session.setAttribute("oldCartList", newCartlist);
		request.getRequestDispatcher("ProductList").forward(request, response);
		}
		
	}

}
