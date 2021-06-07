package com.hd.ui;


import java.util.ArrayList;
import java.util.Scanner;

import com.hd.DAO.bill;
import com.hd.DAO.drinkDAO;
import com.hd.DAO.orderDAO;
import com.hd.DAO.tableDAO;
import com.hd.model.drinks;
import com.hd.model.order;
import com.hd.model.table;

public class program {
	public static  bill b = new bill();
	public static drinkDAO d = new drinkDAO();
	public static tableDAO tb = new tableDAO();
	public static orderDAO odao = new orderDAO();
	public static ArrayList<order> listod = new ArrayList<order>();
	public static ArrayList<table> listtb = new ArrayList<table>();
	public static ArrayList<drinks> listd = new ArrayList<drinks>();
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		listtb = tb.readfilet();
		listd = d.readfiled();
		menu();
	}
	public static void menu() {
		System.out.println("nhan phim 1 de order nuoc");
		System.out.println("nhan phim nhan 2 de in bill");
		System.out.println("nhan phim 0 de thoat");
		System.out.println("-------------------------------");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		choose(n);
	}
	public static void choose(int n) {
		switch (n) {
			case 0: 
				System.exit(0);
			case 1:{
				order or = new order();
				or.goinuoc();
//				or.showgia();
//				System.out.println(or.getTendouong());
//				System.out.println(or.getSoluong());
//				System.out.println(or.getGia());
//				for (order od : listod) {
//					od.show();
//				}
				odao.ghifile();
				break;
			}
			case 2:
				b.ghifile();
		}
		menu();
	}
}
