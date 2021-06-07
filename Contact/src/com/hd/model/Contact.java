package com.hd.model;

import java.util.Scanner;

public class Contact {
	private String Name;
	private String PhoneNumber;
	
	public void xuat() {
		System.out.print(Name+"\t"+PhoneNumber);
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	

	public Contact(String name, String phoneNumber) {
		super();
		Name = name;
		PhoneNumber = phoneNumber;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void inputC() {
		Scanner sc= new Scanner(System.in);
		System.out.print("nhap ho ten: ");
		Name = sc.nextLine();
		System.out.print("nhap so dien thoai: ");
		PhoneNumber = sc.nextLine();
	}
	public void showC() {
		System.out.println("hoten: "+Name+"\nsdt: "+PhoneNumber);
	}
	
}
