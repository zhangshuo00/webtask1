package com.runoob.test;

public class Commodity {//商品基类
	protected String number;//编号
	protected String name;//名称
	public int amount;//数量
	//
	public Commodity() {}
	public Commodity(String number,String name,int amount) {
		this.number = number;
		this.name = name;
		this.amount = amount;
	}
	//
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	//
	public String toString() {
		return "商品编号："+number+" 商品名称："+name+" 商品数量："+amount;
	}
}
