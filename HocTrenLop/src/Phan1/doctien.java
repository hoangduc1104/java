package Phan1;

import java.util.Scanner;

public class doctien {
	static String motso(long dv) {
		String kq="";
		if(dv==0)kq="không";
		if(dv==1)kq="một";
		if(dv==2)kq="hai";
		if(dv==3)kq="ba";
		if(dv==4)kq="bốn";
		if(dv==5)kq="năm";
		if(dv==6)kq="sáu";
		if(dv==7)kq="bảy";
		if(dv==8)kq="tám";
		if(dv==9)kq="chín";
		return kq;
}
	static String haiso(long dv,long c) {
		String kqc="";
		if(dv==0&&c!=1) {
			kqc= motso(c)+" "+"mươi";
		}
		if(dv==0&&c==1) kqc="mười";
		if(dv==5&&c!=1) {
			kqc=motso(c)+" "+"mươi"+" "+"lăm";
		}
		if(dv==5&&c==1) {kqc="mười"+" "+"lăm";}
		if(dv==1&&c!=1) {kqc=motso(c)+" "+"mươi"+" "+"mốt";}
		if(c==1&&dv!=0&&dv!=5) kqc= "muời"+" "+motso(dv);
		if(dv!=0&&dv!=1&&dv!=5&&c!=1) kqc=motso(c)+" "+"mươi"+" "+motso(dv);
		return kqc;
	}
	static String baso(long dv,long c,long t) {
		String kqt="";
		if(dv==0&&c==0) kqt=motso(t)+" "+"trăm";
		if(dv!=0&&c==0) kqt=motso(t)+" "+"trăm"+" "+"lẻ"+" "+motso(dv);
		if(c==1&&dv==0) kqt=motso(t)+" "+"trăm"+" "+"mốt";
		if(dv==0&&c>1) kqt=motso(t)+" "+"trăm"+" "+haiso(dv,c);
		if(dv!=0&&c!=0) kqt= motso(t)+" "+"trăm"+" "+haiso(dv,c);
		if(t==0&&c==1)kqt=motso(t)+" "+"trăm"+" "+haiso(dv,c);
		return kqt;
	}
	static String batki(long t,int h) {
		String kqcc="";
		int dem=-1;
		if(t==0) return motso(t);
		else {
			if(h<3&&h>0) {
				long dv1=t%10;
				t=t/10;
				long c1=t%10;
				t=t/10;
				long t1=t;
				if(h==1) {
					kqcc=motso(dv1);
				}
				if(h==2) {
					kqcc=haiso(dv1,c1);
				}
				if(h==3) {
					kqcc=baso(dv1,c1,t1);
				}
			}
			else {
				while(t!=0) {
					long a=t%1000;
					dem++;
					if(a==0) {
						if(dem>=3)kqcc= nhieu(dem)+kqcc;
						h=h-3;
					}
					else {
						long dv1 = a%10;
						a=a/10;
						long c1=a%10;
						a=a/10;
						long t1=a;
						
						if(h-3>0) {
							kqcc=baso(dv1,c1,t1)+" "+nhieu(dem)+" "+kqcc;
							h=h-3;
						}
						else {
							if(h==1)kqcc=motso(dv1)+" "+nhieu(dem)+" "+kqcc;
							if(h==2)kqcc=haiso(dv1,c1)+" "+nhieu(dem)+" "+kqcc;
							if(h==3)kqcc=baso(dv1,c1,t1)+" "+nhieu(dem)+" "+kqcc;
						} 
				}
					t=t/1000;
			}
			return kqcc;
		}
			return kqcc;}
		}
	static String nhieu(int a) {
		String kqn="";
		if(a==0)kqn="";
		if(a==1)kqn="nghìn";
		if(a==2)kqn="triệu";
		if(a==3)kqn="tỷ";
		if(a==4)kqn="nghìn";
		if(a==5)kqn="triệu";
		return kqn;
	}
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("nhap n");
	long n=in.nextLong();	
	int L=0;
	long b=n;
	while (b!=0) {
		L++;
		b=b/10;
	}
System.out.println(batki(n,L));
}
}
