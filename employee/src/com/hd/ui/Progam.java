package com.hd.ui;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.hd.model.Employee;

public class Progam {

	public static ArrayList<Employee> list = new ArrayList<Employee>();
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Menu();
	}
	public static void Menu() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add Employee");
		System.out.println("2. Show Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. Exit");
		System.out.print("Nhap lua chon: ");
		int n = sc.nextInt();
		Choice(n);
		
	}
	public static void Choice(int n) throws ParseException {
		switch(n) {
		case 1:
			int m;
			do {
				Employee e= new Employee();
				e.inputInfo();
				list.add(e);
				System.out.print("nhap 0 de thoat hoac phim bat ky de nhap tiep: ");
				Scanner sc = new Scanner(System.in);
				m= sc.nextInt();
			}
			while(m==0);
			
			break;
		case 2:
			for (Employee employee : list) {
				employee.ShowInfo();
			}
			break;
		case 3:
			String name2;
			Scanner sc = new Scanner(System.in);
			name2= sc.nextLine();
			for (Employee employee : list) {
				if(employee.getName().contains(name2))
				{	
					employee.ShowInfo();
				}
				else
					{
					System.out.println("khong tim thay");
					}
			}
			break;
		case 4:
			System.exit(0);
		}
		Menu();
	} 
	

}
