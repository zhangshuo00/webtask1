package com.runoob.test;

public class Books extends Commodity{//����
	private String author;//����
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
		return "ͼ���ţ�"+getNumber()+" ͼ�����ƣ�"+getName()+" ͼ��������"+getAmount()
			+" ͼ�����ߣ�"+author+" ISBN�ţ�"+ISBN;
	}
}
