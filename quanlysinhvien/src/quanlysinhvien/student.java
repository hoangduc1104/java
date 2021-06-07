package quanlysinhvien;

import java.util.Scanner;

public class student extends person {
	String rollNo;
	float mark;
	String email;
	public student() {
		super();
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("msv: "+rollNo+"\tdiem: "+mark+"\temail: "+email);
	} 
	
	@Override
	public void inputInfo() {
		super.inputInfo();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("nhap ma sv:");
		while(true) {
			String rollNoInput = input.nextLine();
			Boolean check = setRollNo(rollNoInput);
			if(check)
				break;
		}
		
		System.out.println("nhap diem: ");
		while(true) {
	        float markInput = Float.parseFloat(input.nextLine());
			Boolean check = setMark(markInput);
			if(check)
				break;
		}
		System.out.println("nhap email: ");
		while(true) {
	        String emailInput = input.nextLine();
			Boolean check = setEmail(emailInput);
			if(check)
				break;
		}
	}
	public String getRollNo() {
		return rollNo;
	}
	public Boolean setRollNo(String rollNo) {
		if(rollNo != null&& rollNo.length()==8) {
			this.rollNo = rollNo;
			return true;
		}
		else { 
			System.err.println("nhap lai ma sinh vien: ");
			return false;
		}
	}
	public float getMark() {
		return mark;
	}
	public boolean setMark(float mark) {
		if(mark>=0&&mark<=10) {
			this.mark = mark;
			return true;
		}
		else {
			System.err.println("nhap sai diem ");
			return false;
		}
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email != null && email.contains("@")&& !email.contains(" ")) {
			this.email = email;
			return true;
		}
		else {
			System.err.println("khong nhan dang duoc email");
			return false;
		}
	}
	public boolean checkhocbong() {
		if(mark >=8) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
