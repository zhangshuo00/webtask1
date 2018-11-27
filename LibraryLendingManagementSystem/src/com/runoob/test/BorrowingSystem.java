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
	//借阅图书
	public void borrowingBook() {
		System.out.println("请输入想要借阅的图书编号：");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		for(int i = 0;i<book.length;i++) {
			if(book[i].getNumber().equals(str1)) {
				System.out.println("该图书在图书馆!");
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
				System.out.println("图书馆内暂无该书籍");
			}
		}	
	}
	//借阅DVD
	public void borrowingDVD() {
		System.out.println("请输入想要借阅的DVD编号：");
		Scanner sc = new Scanner(System.in);
		String str2 = sc.next();
		for(int i = 0;i<dvd.length;i++) {
			if(dvd[i].getNumber().equals(str2)) {
				System.out.println("该DVD在图书馆!");
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
				System.out.println("图书馆内暂无该DVD");
			}
		}	
	}
	//还书
	public void returnBook() {
		System.out.println("请输入要归还的图书编号：");
		Scanner sc = new Scanner(System.in);
		String str3 = sc.next();
		for(int i = 0;i<book.length;i++) {
			if(book[i].getNumber().equals(str3))
				booksAmount++;
		}
	}
	//还DVD
	public void returnDVD() {
		System.out.println("请输入要归还的DVD编号：");
		Scanner sc = new Scanner(System.in);
		String str4 = sc.next();
		for(int i = 0;i<dvd.length;i++) {
			if(book[i].getNumber().equals(str4))
				dvdsAmount++;
		}
	}
}
