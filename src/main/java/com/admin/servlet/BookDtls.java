package com.admin.servlet;


public class BookDtls {
	
	private int bookId;
	private String bookName;
	private String author;
	private String price;
	private String bookCategory;
	private String ststus;
	private String photoName;
	private String email;
	public BookDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDtls(String bookName, String author, String price, String bookCategory, String ststus, String photoName,
			String email) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.bookCategory = bookCategory;
		this.ststus = ststus;
		this.photoName = photoName;
		this.email = email;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
public void setPrice(String price) {
		this.price = price;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getStstus() {
		return ststus;
	}
	public void setStstus(String ststus) {
		this.ststus = ststus;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

