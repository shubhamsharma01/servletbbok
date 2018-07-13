package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Studentform
 */
@WebServlet("/Studentform")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	    out.println("Reportcard......");	   
	    String name=request.getParameter("name");
	    String roll_no=request.getParameter("rollno.");
	    float marks=Float.parseFloat(request.getParameter("marks"));
	    float max_marks=100;
	    Student stu=new Student();
	    
	    out.println("Rollno "+roll_no+"\n"+"Name "+name+"\n"+"Marks "+marks+"\n"+"Mazimum marks "+
	    max_marks+"\n");
	    out.println(stu.Calculation(marks, max_marks));
		
		/*out.println(name+"<br>");
		out.println(marks+"<br>");*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
