package com.hd.model;



import java.util.ArrayList;
import java.util.Scanner;

import com.hd.ui.program;



public class order {
	private String maban;
//	private String tdu;
//	private int sl;
//	private long g;
//	private ArrayList<String> mb = new ArrayList<String>();
	private ArrayList<String> tendouong = new ArrayList<String>();
	private ArrayList<Integer> soluong = new ArrayList<Integer>(); 
//	private ArrayList<Long> gia = new ArrayList<Long>();
	


	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public order(String maban, ArrayList<String> tendouong, ArrayList<Integer> soluong/*, ArrayList<Long> gia*/) {
		super();
		this.maban = maban;
		this.tendouong = tendouong;
		this.soluong = soluong;
//		this.gia = gia;
	}

	public String getMaban() {
		return maban;
	}

	public void setMaban(String maban) {
		this.maban = maban;
	}

	public ArrayList<String> getTendouong() {
		return tendouong;
	}

	public void setTendouong(ArrayList<String> tendouong) {
		this.tendouong = tendouong;
	}

	public ArrayList<Integer> getSoluong() {
		return soluong;
	}

	public void setSoluong(ArrayList<Integer> soluong) {
		this.soluong = soluong;
	}

//	public ArrayList<Long> getGia() {
//		return gia;
//	}
//
//	public void setGia(ArrayList<Long> gia) {
//		this.gia = gia;
//	}

	public void goinuoc() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ma ban:" );
		maban = sc.nextLine();
		for (table tb : program.listtb) {
			if(tb.getMaban().equalsIgnoreCase(maban)) {
				if(tb.isKt()==true) {
					while(true) {
						System.out.println("nhap do uong:" );
						String tdu = sc.nextLine();
						if(tdu.compareTo("")==0) {
							break;
						}
						tendouong.add(tdu);
						System.out.println("nhap so luong:" );
						int sl = Integer.parseInt(sc.nextLine());
						soluong.add(sl);
	
						for (order od : program.listod) {
							if(od.getMaban().equalsIgnoreCase(maban)) {
								od.getTendouong().add(tdu);
								od.getSoluong().add(sl);
							}
						}
					}
//					for (String st : tendouong) {
//						for (drinks dr : program.listd) {
//							if(tendouong.get(tendouong.size()-1) .equalsIgnoreCase(dr.getTendouong()))
//								gia.add(dr.getGia());
//						}
//					}
				}
				if(tb.isKt()==false) {
					while(true) {
						System.out.println("nhap do uong:" );
						String tdu = sc.nextLine();
						if(tdu.compareTo("")==0) {
							break;
						}
						System.out.println("nhap so luong:" );
						int sl = Integer.parseInt(sc.nextLine());
						tendouong.add(tdu);
						soluong.add(sl);
	//					for (String st : tendouong) {
	//						for (drinks dr : program.listd) {
	//							if(st.equalsIgnoreCase(dr.getTendouong()))
	//								gia.add(dr.getGia());
	//						}
	//					}
					}
					tb.setKt(true);
					program.listod.add(this);
				}
			}
		}
	}
//	public void goinuoc() {
//	Scanner sc= new Scanner(System.in);
//	System.out.println("nhap ma ban:" );
//	maban = sc.nextLine();
//	mb.add(maban);
//	for (table tb : program.listtb) {
//		if(tb.getMaban().equalsIgnoreCase(maban)) {
//			if(tb.isKt()==false) {
//				tb.setKt(true);
//				System.out.println("nhap do uong:" );
//				String tdu = sc.nextLine();
//				tendouong.add(tdu);
//				System.out.println("nhap so luong:" );
//				int sl = sc.nextInt();
//				soluong.add(sl);
//			}
//			else {
//				System.out.println("nhap do uong:" );
//				String tdu = sc.nextLine();
//				tendouong.add(tdu);
//				System.out.println("nhap so luong:" );
//				int sl = sc.nextInt();
//				soluong.add(sl);
//			}
//		}
//	}
//	
//}
	public ArrayList<Long> showgia() {
		ArrayList<Long> gia = new ArrayList<Long>();
		for (int i=0;i<tendouong.size();i++) {
			for (drinks dr : program.listd) {
				if(tendouong.get(i) .equalsIgnoreCase(dr.getTendouong()))
					gia.add(dr.getGia()*soluong.get(i));
			}
		}
		return gia;
	}

	public void show() {
		this.showgia();
		System.out.println(maban);
		for(int i=0;i<soluong.size();i++) {
			System.out.println(tendouong.get(i)+"\t"+soluong.get(i)+"\t"+this.showgia().get(i));
		}
	}
	public Long tongtien() {
		long t =0;
		for(int i=0;i<soluong.size();i++) {
			t+=this.showgia().get(i);
		}
		return t;
	}
}
