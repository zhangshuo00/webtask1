package com.runoob.test;

public class DVDs extends Commodity{//DVD类
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
		return "DVD编号："+getNumber()+" DVD名称："+getName()+" DVD数量："
				+getAmount()+" ISRC号："+ISRC;
	}
}
