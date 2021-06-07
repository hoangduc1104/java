package com.hd.ui;

import java.util.Scanner;

import com.hd.model.Contact;
import com.hd.model.PhoneBook;

public class program {
	public static PhoneBook phonebook = new PhoneBook();
	public static void main(String[] args) {
	
		menu();
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap lua chon");
		System.out.println("1. Nhan phim 1 de add");
		System.out.println("2. Nhan phim 2 de check");
		System.out.println("3. Nhan phim 3 de update");
		System.out.println("4. Nhan phim 4 de remove");
		System.out.println("5. Nhan phim 5 de search");
		System.out.println("5. Nhan phim 6 de show");
		System.out.println("5. Nhan phim 7 de exists");
		System.out.println("------------------------");
		System.out.print("Nhap lua chon: ");
		int n = sc.nextInt();
		choice(n);
	}
	public static void choice(int n) {
		switch(n) {
		case 1:
			phonebook.addC();
			break;
		case 2:
			System.out.println(phonebook.check());
			break;
		case 3:
			phonebook.update();
			break;
		case 4:
			phonebook.remove();
			break;
		case 5:
			phonebook.search();
			break;
		case 6:
			phonebook.showl();
		case 7:
			System.exit(0);
		}
		menu();
	}
}
