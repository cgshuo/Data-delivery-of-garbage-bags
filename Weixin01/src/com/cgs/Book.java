/**
 * 
 */
package com.cgs;

/**
 * @author caoguangshuo
 *
 */
public class Book {
	private String phoneId;
	private String bookName;
	private String bookAuthor;
	public Book(){}
	public String getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
}
