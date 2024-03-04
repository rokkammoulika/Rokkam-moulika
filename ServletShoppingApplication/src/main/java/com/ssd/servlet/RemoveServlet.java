package com.ssd.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dto.CartDto;



/**
 * Servlet implementation class RemoveServlet
 */
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<CartDto> oldCartlist = (List<CartDto>) request.getSession().getAttribute("oldCartList");
		Integer productId=Integer.valueOf(request.getParameter("id"));
		int index=0;
		for(CartDto dto:oldCartlist) {
			if(dto.getId()==productId) {
				index=oldCartlist.indexOf(dto);
				
			}
		}
		oldCartlist.remove(index);
		request.getSession().setAttribute("oldCartlist", oldCartlist);
		request.getRequestDispatcher("Cartlist").forward(request, response);
	}

}
