package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javafx.scene.control.Button;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import dao.BookDAOImp;

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
    protected void doGet_post(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			String catagory=request.getParameter("catagory");
			
			String pub="";
				for(String a:publication)
			{
				pub=pub+a+" ";
			}
			Book book=new Book(bookid,bookname,price,catagory,pub,description);
			BookDAOImp bookDAOImp=new BookDAOImp();
			bookDAOImp.saveBook(book);	
			
		}
		else if(request.getParameter("view")!=null)
		{
			response.sendRedirect("view.html");
		}
		else if(request.getParameter("view1")!=null)
		{
			String bookid1=request.getParameter("bookid1");
			BookDAOImp bookDAOImp=new BookDAOImp();
			out.println(bookDAOImp.getBookByBookId(bookid1));
		}
		else if(request.getParameter("delete")!=null)
		{
			response.sendRedirect("view.html");
		}
		else if(request.getParameter("delete1")!=null)
		{
			String bookid1=request.getParameter("bookid1");
			BookDAOImp bookDAOImp=new BookDAOImp();
			bookDAOImp.deleteBookByBookId(bookid1);
			out.println("<h3>Record is deleted</h3>");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("home.html");
			requestDispatcher.include(request, response);
			//response.sendRedirect("home.html");
		}
		
		
		
		
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet_post(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet_post(request, response);
	}
	public void newbook(){
		
		
	}
public void view(){
		
		
	}
public void delete(){
	
	
}
public void update(){
	
	
}

}
