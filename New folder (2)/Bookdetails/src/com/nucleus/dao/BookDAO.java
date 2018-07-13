package com.nucleus.dao;

import model.Book;
//import dao.String;

public interface BookDAO 
{
	public void saveBook(Book book);
	public Book getBookByBookId(String bookId);
	public void deleteBookByBookId(String bookId);
	public Book update(String bookid);


}
