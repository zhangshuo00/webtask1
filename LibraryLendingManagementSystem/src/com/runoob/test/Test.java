package com.runoob.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommoditySystem cs = new CommoditySystem();
		MemberInformation mi = new MemberInformation();
		MemberInformation[] memberInfor = new MemberInformation[100];
		BorrowingSystem bs = new BorrowingSystem();
		System.out.println("������洢�����������");
		Scanner sc = new Scanner(System.in);
		cs.setMaxAmount(sc.nextInt());		
		
		System.out.println("1.������Ա\n"
				+ "2.������Ʒ\n"
				+ "3.�����DVD\n"
				+ "4.�����DVD\n"
				+ "5.��ʾ���л�Ա��Ϣ\n"
				+ "6.��ʾ������Ʒ��Ϣ\n"
				+ "7.�˳�����\n");	
		System.out.println("������������еĲ����ı�ţ�");
		int a1 = sc.nextInt();
		
		switch(a1) {
		case 1:
			mi.saveMemberInfor();
			break;
		case 2:
			System.out.println("1.����ͼ��"
					+ "2.����DVD");
			int a2 = sc.nextInt();
			if(a2 == 1)
				cs.addBooks();
			else
				cs.addDVDs();
			break;
		case 3:
			System.out.println("1.����"
					+ "2.��DVD");
			int a3 = sc.nextInt();
			if(a3 == 1)
				bs.borrowingBook();
			else
				bs.borrowingDVD();
			break;
		case 4:
			System.out.println("1.����"
					+ "2.��DVD");
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
			System.out.println("�˳��ɹ���");
			break;
		}
		
	}	

}
