package com.hd.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	private String Name;
	private String Email;
	private Date DoB;
	private String Adress;
	
	public void ShowInfo() {
		System.out.println("ho ten: " + Name +"\nEmail: "+ Email
				+"\nNgay sinh: "+ DoB + "\nDia chi: "+ Adress);
		System.out.println(GetAge());
	}
	
	public void inputInfo()  {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ten: ");
		Name = sc.nextLine();
		
		System.out.print("Nhap Email: ");
		Email= sc.nextLine();
		
		System.out.print("Nhap ngay sinh: ");
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			DoB = sdf.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.print("Nhap dia chi: ");
		Adress = sc.nextLine();
	}
	public Employee() {
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDoB() {
		return DoB;
	}
	public void setDoB(Date doB) {
		DoB = doB;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public Employee(String name, String email, Date doB, String adress) {
		super();
		Name = name;
		Email = email;
		DoB = doB;
		Adress = adress;
	}
	public int GetAge() {
		int year = Year.now().getValue();
		Calendar cal = Calendar.getInstance();
		cal.setTime(DoB);
		return year - cal.get(Calendar.YEAR);
	}
}
