package phan2;

import java.util.Scanner;

public class diem {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public diem(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public diem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void xuat() {
		System.out.println("("+a+";"+b+")");
	}
}
