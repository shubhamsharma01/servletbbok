package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionSetup;
import model.Book;

public class BookDAOImp implements BookDAO {
	Book book;
	ConnectionSetup connectionsetup=new ConnectionSetup();
	Connection con=connectionsetup.connectionsetup();
	PreparedStatement pstmt=null;
	

	@Override
	public void saveBook(Book book) {
		
		String publication=book.getPublication();
		
		
				try {
			pstmt=con.prepareStatement("insert into book123 values(?,?,?,?,?,?)");
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getBookName());
			pstmt.setString(3, book.getPrice());
			pstmt.setString(4, book.getCatagory());
			pstmt.setString(5, book.getPublication());
			pstmt.setString(6, book.getDescription());
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public Book getBookByBookId(String bookId) {
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from book123 where bookId=?");
			pstmt.setString(1, bookId);
			ResultSet resultSet=pstmt.executeQuery();
			while(resultSet.next())
			{
				String bookid=resultSet.getString(1);
				String bookname=resultSet.getString(2);
				String price=resultSet.getString(3);
				String catagory=resultSet.getString(4);
				String publication=resultSet.getString(5);
				String description=resultSet.getString(6);
				book=new Book(bookid,bookname,price,catagory,publication,description);
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBookByBookId(String bookId) {
           try {
               PreparedStatement pstmt=con.prepareStatement("delete from book123 where bookId=?");
			pstmt.setString(1, bookId);
			pstmt.executeQuery();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public Book update(String bookid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
