package dao;

import model.Book;

public interface BookDAO {
	public void saveBook(Book book);
	public Book getBookByBookId(String bookId);
	public void deleteBookByBookId(String bookId);
	public Book update(String bookid);

}
