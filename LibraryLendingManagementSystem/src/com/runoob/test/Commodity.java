package com.runoob.test;

public class Commodity {//��Ʒ����
	protected String number;//���
	protected String name;//����
	public int amount;//����
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
		return "��Ʒ��ţ�"+number+" ��Ʒ���ƣ�"+name+" ��Ʒ������"+amount;
	}
}
