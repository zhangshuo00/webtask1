package com.runoob.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class CommoditySystem {//��Ʒ��Ϣ����
	private static int booksAmount;
	private static int dvdsAmount;
	private int maxAmount;//���洢����
	private Books[] book;
	private DVDs[] dvd;
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
	public static int getBooksAmount() {
		return booksAmount;
	}
	public static void setBooksAmount(int booksAmount) {
		CommoditySystem.booksAmount = booksAmount;
	}
	public static int getDvdsAmount() {
		return dvdsAmount;
	}
	public static void setDvdsAmount(int dvdsAmount) {
		CommoditySystem.dvdsAmount = dvdsAmount;
	}
	//
	
	public int getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}
	//������Ʒ
	public void addBooks() {
		Books books = new Books();
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ͼ��ı�ţ�");
		String str1 = sc.next();
		books.setNumber(str1);
		System.out.println("����Ϊ��");
		String str2 = sc.next();
		books.setName(str2);
		System.out.println("����Ϊ��");
		int in = sc.nextInt();
		books.setAmount(in);
		System.out.println("����Ϊ��");
		String str3 = sc.next();
		books.setAuthor(str3);
		System.out.println("ISBN��Ϊ��");
		String str4 = sc.next();
		books.setISBN(str4);
		
		//book[booksAmount] = books;
		try {
			
			Writer writer = new FileWriter(new File("E:\\product.txt"));			
			writer.write(books.toString() + "\r\n");
			
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		booksAmount++;
		System.out.println("����ɹ���");
	}
	public void addDVDs() {
		DVDs dvds = new DVDs();
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���DVD�ı�ţ�");
		String str1 = sc.next();
		dvds.setNumber(str1);
		System.out.println("����Ϊ��");
		String str2 = sc.next();
		dvds.setName(str2);
		System.out.println("����Ϊ��");
		int in = sc.nextInt();
		dvds.setAmount(in);
		System.out.println("ISRC��Ϊ��");
		dvds.setISRC(sc.next());
		
		dvd[dvdsAmount] = dvds;
		//д���ļ�
		try {		
			Writer writer = new FileWriter(new File("E:\\product.txt"));	
			writer.write(dvds.toString() + "\r\n");
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		dvdsAmount++;
		System.out.println("����ɹ���");
	}

	public String toString() {
		for(int i=0;i<booksAmount;i++) {
			return book[booksAmount].toString();
		}
		for(int i=0;i<dvdsAmount;i++)
			return dvd[dvdsAmount].toString();
		return "��ʾ���";
	}
}
