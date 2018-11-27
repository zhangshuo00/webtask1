package com.runoob.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommoditySystem cs = new CommoditySystem();
		MemberInformation mi = new MemberInformation();
		MemberInformation[] memberInfor = new MemberInformation[100];
		BorrowingSystem bs = new BorrowingSystem();
		System.out.println("请输入存储的最大数量：");
		Scanner sc = new Scanner(System.in);
		cs.setMaxAmount(sc.nextInt());		
		
		System.out.println("1.新增会员\n"
				+ "2.新增商品\n"
				+ "3.借书或DVD\n"
				+ "4.还书或DVD\n"
				+ "5.显示所有会员信息\n"
				+ "6.显示所有商品信息\n"
				+ "7.退出程序\n");	
		System.out.println("请输入您想进行的操作的编号：");
		int a1 = sc.nextInt();
		
		switch(a1) {
		case 1:
			mi.saveMemberInfor();
			break;
		case 2:
			System.out.println("1.新增图书"
					+ "2.新增DVD");
			int a2 = sc.nextInt();
			if(a2 == 1)
				cs.addBooks();
			else
				cs.addDVDs();
			break;
		case 3:
			System.out.println("1.借书"
					+ "2.借DVD");
			int a3 = sc.nextInt();
			if(a3 == 1)
				bs.borrowingBook();
			else
				bs.borrowingDVD();
			break;
		case 4:
			System.out.println("1.还书"
					+ "2.还DVD");
			int a4 = sc.nextInt();
			if(a4 == 1)
				bs.returnBook();
			else
				bs.returnDVD();
			break;
		case 5:
			for(int i=0;i<mi.getMemberInfor();i++) {
				System.out.println(memberInfor[i].toString());
			}
			break;
		case 6:
			System.out.println(cs.toString());
			break;
		case 7:
			System.out.println("退出成功！");
			break;
		}
		
	}	

}
