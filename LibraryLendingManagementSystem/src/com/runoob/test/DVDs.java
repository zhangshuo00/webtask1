package com.runoob.test;

public class DVDs extends Commodity{//DVD��
	private String ISRC;
	//
	public DVDs() {}
	public DVDs(String number,String name,int amount,String ISRC) {
		super(number,name,amount);
		this.ISRC = ISRC;
	}
	//
	public String getISRC() {
		return ISRC;
	}
	public void setISRC(String ISRC) {
		this.ISRC = ISRC;
	}
	//
	public String toString() {
		return "DVD��ţ�"+getNumber()+" DVD���ƣ�"+getName()+" DVD������"
				+getAmount()+" ISRC�ţ�"+ISRC;
	}
}
