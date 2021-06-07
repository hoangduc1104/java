package com.hd.model;

import java.util.Scanner;

public class table {
	private String maban;
	private boolean kt;

	public boolean isKt() {
		return kt;
	}

	public void setKt(boolean kt) {
		this.kt = kt;
	}

	public String getMaban() {
		return maban;
	}

	public table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMaban(String maban) {
		this.maban = maban;
	}

	public table(String maban, boolean kt) {
		super();
		this.maban = maban;
		this.kt = kt;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma ban: ");
		maban = sc.nextLine();
	}
	public void show() {
		System.out.println("ma ban: "+maban);
		System.out.println("kiem tra: " + kt);
	}
	
	
}
