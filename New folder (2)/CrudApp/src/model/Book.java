package model;



public class Book {
	private String bookId;
	private String bookName;
	private String price;
	private String description;
	private String publication;
	private String catagory;
	
	public Book(String bookId, String bookName, String price, 
			 String catagory,String publication,String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.description = description;
		this.publication = publication;
		this.catagory = catagory;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "bookId=" + bookId + ", bookName=" + bookName + ", price="
				+ price + ", description=" + description + ", publication="
				+ publication + ", catagory=" + catagory + "";
	}
	
	
	

}
