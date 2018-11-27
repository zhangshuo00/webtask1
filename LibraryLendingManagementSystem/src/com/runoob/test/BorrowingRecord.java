package com.runoob.test;

public class BorrowingRecord {//借阅记录类
	//属性：会员、商品
	private Books book;
	private DVDs dvd;
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public DVDs getDvd() {
		return dvd;
	}
	public void setDvd(DVDs dvd) {
		this.dvd = dvd;
	}
	
	
}
