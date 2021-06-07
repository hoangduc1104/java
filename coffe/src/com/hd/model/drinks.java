package com.hd.model;

import java.util.Scanner;

public class drinks {
	private int madouong;
	private String tendouong;
	private long gia;
	
	public void setGia(long gia) {
		this.gia = gia;
	}
	public int getMadouong() {
		return madouong;
	}
	public void setMadouong(int madouong) {
		this.madouong = madouong;
	}
	public String getTendouong() {
		return tendouong;
	}
	public void setTendouong(String tendouong) {
		this.tendouong = tendouong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public drinks(int madouong, String tendouong, long gia) {
		super();
		this.madouong = madouong;
		this.tendouong = tendouong;
		this.gia = gia;
	}
	public drinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void inputInfo() {
		Scanner sc= new Scanner(System.in); 
		System.out.println("nhap ma do uong: ");
		madouong = sc.nextInt();
		System.out.println("nhap ten do uong: ");
		tendouong = sc.nextLine();
		System.out.println("nhap  gia do uong: ");
		gia = sc.nextLong();
	}
	public void show() {
		System.out.println("ma do uong: "+ madouong);
		System.out.println("ten do uong: "+ tendouong);
		System.out.println("gia: "+ gia);
	}
}
