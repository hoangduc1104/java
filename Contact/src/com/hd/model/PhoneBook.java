package com.hd.model;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	private ArrayList<Contact> ContactList;

	public PhoneBook(ArrayList<Contact> contactList) {
		super();
		ContactList = new ArrayList<Contact>();
		ContactList = contactList;
		
	}

	public ArrayList<Contact> getContactList() {
		return ContactList;
	}

	public void setContactList(ArrayList<Contact> contactList) {
		ContactList = contactList;
	}
	public PhoneBook() {
		ContactList = new ArrayList<Contact>();
	}

	public void addC() {
		Contact c = new Contact();
		c.inputC();
		ContactList.add(c);
	}

	public void showl() {
		for (Contact contact : ContactList) {
			contact.showC();
		}
	}
	public int check() {
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhap ten can kiem tra: ");
		ten =sc.nextLine();
		int dem=0;
		for (Contact contact : ContactList) {
			if(contact.getName().contains(ten)) {
				dem = 1;
			}
			else {
				dem = -1;
			}
		}
		return dem;
	}
	public void update() {
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhap ten can update: ");
		ten =sc.nextLine();
		String sdt;
		for (Contact contact : ContactList) {
			if(contact.getName().contains(ten)) {
				System.out.print("\ncap nhat sdt: ");
				sdt= sc.nextLine();
				contact.setPhoneNumber(sdt);
			}
		}
	}
	public void remove() {
		String ten;
		ArrayList<Contact> contactcanxoa= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhap ten can remove: ");
		ten =sc.nextLine();
		for (Contact contact : ContactList) {
			if(contact.getName().contains(ten)) {
				contactcanxoa.add(contact);
			}
		}	
		ContactList.remove(contactcanxoa);
	}
	public void search() {
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhap ten can tim: ");
		ten =sc.nextLine();
		for (Contact contact : ContactList) {
			if(contact.getName().contains(ten)) {
				contact.showC();
			}
			if(!contact.getName().contains(ten)) {
				System.out.println("Not exists");
			}
		}	
	}
}
