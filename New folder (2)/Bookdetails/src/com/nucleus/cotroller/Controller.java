package com.nucleus.cotroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.dao.BookDAOImpl;
import com.nucleus.model.Book;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	PrintWriter out=response.getWriter();
		out.println("fasdj");
		String bid=request.getParameter("bid");
		String bname=request.getParameter("bname");
		String category=request.getParameter("category");
		String bdesc=request.getParameter("bdesc");
		String price=request.getParameter("price");
		String pdate=request.getParameter("pdate");
		String publication=request.getParameter("publication");
		
		out.println(bid);
		System.out.println(bid);
        Book book = new Book(bid,bname,category,bdesc,price,pdate,publication);		
		BookDAOImpl bookDAO=new BookDAOImpl();
		bookDAO.addbook(book);*/
		
		
		PrintWriter out =response.getWriter();
		
		if(request.getParameter("new")!=null)
		{
			response.sendRedirect("registration.html");
		}
		else if(request.getParameter("submit")!=null){
			String bookid=request.getParameter("bookid");
			String bookname=request.getParameter("bookname");
			String price=request.getParameter("bookprice");
			String description=request.getParameter("description");
			String[] publication=request.getParameterValues("publication");
			String catagory=request.getParameter("category");
			
			String pub="";
				for(String a:publication)
			{
				pub=pub+a+" ";
			}
			Book book=new Book(bookid,bookname,price,category,pub,description);
			BookDAOImpl bookDAOImpl=new BookDAOImpl();
			bookDAOImpl.saveBook(book);	
			
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
