package com.runoob.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class MemberInformation {//会员信息类
	private String memberNumber;//会员编号
	private String memberName;//会员姓名
	private String telephone;//电话
	private int memberAmount;//会员数量
	private MemberInformation[] memberInfor;
	//
	public int getMemberAmount() {
		return memberAmount;
	}
	public void setMemberAmount(int memberAmount) {
		this.memberAmount = memberAmount;
	}
	
	//
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getMemberInfor() {
		return memberInfor.length;
	}
	public void setMemberInfor(int memberAmount) {
		memberInfor = new MemberInformation[memberAmount];
	}
	//新增会员
	public void saveMemberInfor() {
		MemberInformation m = new MemberInformation();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新增的会员的编号：");
		m.setMemberNumber(sc.next());
		System.out.println("会员的姓名：");
		m.setMemberName(sc.next());
		System.out.println("会员的电话");
		m.setTelephone(sc.next());
		
		//memberInfor[memberAmount] = m;
		try {		
			Writer writer = new FileWriter(new File("E:\\member.txt"));	
			writer.write(m.toString() + "\r\n");
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		memberAmount++;
		System.out.println("成功添加会员信息！");
	}
	//修改会员姓名
	public void modifyNameByNumber(String memberNumber,String a,MemberInformation[] memberInfor) {
		for(int i = 0;i<memberAmount;i++) {
			if(memberInfor[i].memberNumber.equals(memberNumber)) {
				memberInfor[i].memberName = a;
			}
		}
	}
	//修改会员电话
	public void modifyPhoneByNumber(String memberNumber,String b,MemberInformation[] memberInfor) {
		for(int i = 0;i<memberAmount;i++) {
			if(memberInfor[i].memberNumber.equals(memberNumber)) {
				memberInfor[i].telephone = b;
			}
		}
	}
	//
	public String toString() {
		return "会员编号："+memberNumber+" 会员姓名："+memberName
				+" 电话："+telephone;
	}
}
