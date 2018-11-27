package com.runoob.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.util.Scanner;
public class BorrowingSystem {
	private static int booksAmount;
	private static int dvdsAmount;
	private Books[] book;
	private DVDs[] dvd;
	//
	public static int getBooksAmount() {
		return booksAmount;
	}
	public static void setBooksAmount(int booksAmount) {
		BorrowingSystem.booksAmount = booksAmount;
	}
	public static int getDvdsAmount() {
		return dvdsAmount;
	}
	public static void setDvdsAmount(int dvdsAmount) {
		BorrowingSystem.dvdsAmount = dvdsAmount;
	}


	//
	public int getBook() {
		return book.length;
	}
	public void setBook(int booksAmount) {
		book = new Books[booksAmount];
	}
	public int getDvd() {
		return dvd.length;
	}
	public void setDvd(int dvdsAmount) {
		dvd = new DVDs[dvdsAmount];
	}
	//����ͼ��
	public void borrowingBook() {
		System.out.println("��������Ҫ���ĵ�ͼ���ţ�");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		for(int i = 0;i<book.length;i++) {
			if(book[i].getNumber().equals(str1)) {
				System.out.println("��ͼ����ͼ���!");
				try {		
					Writer writer = new FileWriter(new File("E:\\record.txt"));			
					writer.write(book[i].toString() + "\r\n");
					writer.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				booksAmount--;
				break;
			}else {
				System.out.println("ͼ��������޸��鼮");
			}
		}	
	}
	//����DVD
	public void borrowingDVD() {
		System.out.println("��������Ҫ���ĵ�DVD��ţ�");
		Scanner sc = new Scanner(System.in);
		String str2 = sc.next();
		for(int i = 0;i<dvd.length;i++) {
			if(dvd[i].getNumber().equals(str2)) {
				System.out.println("��DVD��ͼ���!");
				try {		
					Writer writer = new FileWriter(new File("E:\\record.txt"));			
					writer.write(dvd[i].toString() + "\r\n");
					writer.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				dvdsAmount--;
				break;
			}else {
				System.out.println("ͼ��������޸�DVD");
			}
		}	
	}
	//����
	public void returnBook() {
		System.out.println("������Ҫ�黹��ͼ���ţ�");
		Scanner sc = new Scanner(System.in);
		String str3 = sc.next();
		for(int i = 0;i<book.length;i++) {
			if(book[i].getNumber().equals(str3))
				booksAmount++;
		}
	}
	//��DVD
	public void returnDVD() {
		System.out.println("������Ҫ�黹��DVD��ţ�");
		Scanner sc = new Scanner(System.in);
		String str4 = sc.next();
		for(int i = 0;i<dvd.length;i++) {
			if(book[i].getNumber().equals(str4))
				dvdsAmount++;
		}
	}
}
