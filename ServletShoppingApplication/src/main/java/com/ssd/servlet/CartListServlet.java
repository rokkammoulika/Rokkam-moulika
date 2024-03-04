package com.ssd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dao.ProductDao;
import com.ssd.Dto.CartDto;
import com.ssd.service.ProductService;


/**
 * Servlet implementation class CartListServlet
 */
public class CartListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductService service;

	public void init() {
		ProductDao dao = new ProductDao();
		service = new ProductService(dao);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("iuxgdhwgyucbydksc");

		List<CartDto> cartlist = (List<CartDto>) request.getSession().getAttribute("oldCartList");
		

		cartlist = service.getAllCartProduct(cartlist);
		
		double totalprice = 0.0;

		for (CartDto dto : cartlist) {

			System.out.println("forrrrrrrrrrrrrrrrrrrrrrrrrrr");

			totalprice = totalprice + dto.getQuantity() * dto.getPrice();

			
		}

		request.setAttribute("totalprice", totalprice);
		request.setAttribute("Cartlist", cartlist);
		request.getRequestDispatcher("cartList.jsp").forward(request, response);

		
	}

}
