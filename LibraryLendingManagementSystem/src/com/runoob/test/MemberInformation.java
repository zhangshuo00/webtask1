package com.runoob.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class MemberInformation {//��Ա��Ϣ��
	private String memberNumber;//��Ա���
	private String memberName;//��Ա����
	private String telephone;//�绰
	private int memberAmount;//��Ա����
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
	//������Ա
	public void saveMemberInfor() {
		MemberInformation m = new MemberInformation();
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������Ļ�Ա�ı�ţ�");
		m.setMemberNumber(sc.next());
		System.out.println("��Ա��������");
		m.setMemberName(sc.next());
		System.out.println("��Ա�ĵ绰");
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
		System.out.println("�ɹ���ӻ�Ա��Ϣ��");
	}
	//�޸Ļ�Ա����
	public void modifyNameByNumber(String memberNumber,String a,MemberInformation[] memberInfor) {
		for(int i = 0;i<memberAmount;i++) {
			if(memberInfor[i].memberNumber.equals(memberNumber)) {
				memberInfor[i].memberName = a;
			}
		}
	}
	//�޸Ļ�Ա�绰
	public void modifyPhoneByNumber(String memberNumber,String b,MemberInformation[] memberInfor) {
		for(int i = 0;i<memberAmount;i++) {
			if(memberInfor[i].memberNumber.equals(memberNumber)) {
				memberInfor[i].telephone = b;
			}
		}
	}
	//
	public String toString() {
		return "��Ա��ţ�"+memberNumber+" ��Ա������"+memberName
				+" �绰��"+telephone;
	}
}
