package com.runoob.test;

public class Books extends Commodity{//书类
	private String author;//作者
	private String ISBN;	
	//
	public Books() {}
	public Books(String number,String name,int amount,String author,String ISBN) {
		super(number,name,amount);
		this.author = author;
		this.ISBN = ISBN;
	}
	//
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	//
	public String toString() {
		return "图书编号："+getNumber()+" 图书名称："+getName()+" 图书数量："+getAmount()
			+" 图书作者："+author+" ISBN号："+ISBN;
	}
}
