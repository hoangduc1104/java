package quanlysinhvien;

import java.util.Scanner;

public class person {
	String name;
	String date;
	String address;
	String gender;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void inputInfo() {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("input name: ");
		 name = sc.nextLine();
		 
		 System.out.println("input date: ");
		 date = sc.nextLine();
		
		 System.out.println("input gender: ");
		 gender = sc.nextLine();
		 
		 System.out.println("input address: ");
		 address = sc.nextLine();
	}
	
	public void showInfo() {
		System.out.println("name: "+ name +"\n"+"date: "+ date
					+"\naddress: "+ address+"\ngender: "+gender);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
