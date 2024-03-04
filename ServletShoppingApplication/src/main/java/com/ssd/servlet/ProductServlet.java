package com.ssd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.Dao.ProductDao;
import com.ssd.Dto.ProductDto;
import com.ssd.service.ProductService;


/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService service;
	public void init() {
		ProductDao dao=new ProductDao();
		service=new ProductService(dao);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productName=request.getParameter("ProductName");
		String category=request.getParameter("Category");
		Double price=Double.parseDouble(request.getParameter("Price"));
		String productImage=request.getParameter("ProductImage");
		
		ProductDto dto= new ProductDto();
		dto.setProductName(productName);
		dto.setCategory(category);
		dto.setPrice(price);
		dto.setProductImage(productImage);
		
		service.insertData(dto);
      response.sendRedirect("./ProductList");
		
		
	}

}
