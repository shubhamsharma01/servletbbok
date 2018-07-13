package com.nucleus.model;

public class Book 
{
    private String bid;
    private String bname;
    private String price;
    private String category;
    private String publication;  
    private String bdesc;
	public Book(String bid, String bname, String price, String category,
			String publication, String bdesc) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.category = category;
		this.publication = publication;
		this.bdesc = bdesc;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getBdesc() {
		return bdesc;
	}
	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price
				+ ", category=" + category + ", publication=" + publication
				+ ", bdesc=" + bdesc + "]";
	}
}