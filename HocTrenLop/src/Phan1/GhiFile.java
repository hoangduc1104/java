package Phan1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GhiFile {
	
	public void DocFile(String tf) throws Exception{
		//Mo File ra de doc
		FileReader f= new FileReader(tf);
		//Tao ra bo dem de luu noi dung doc duoc
		BufferedReader doc= new BufferedReader(f);
		//Duyet qua tung dong trong File
		while(true) {
			String st= doc.readLine(); //Doc ra 1 dong
			if(st==null||st=="") break;//Neu het File thi dung
			//Che chuoi st ra thanh 4 phan
			String[] ds= st.split("[;]");
			System.out.println(ds[0]); System.out.println(ds[1]);
			System.out.println(ds[2]); System.out.println(ds[3]);
			System.out.println("------------------------------");
				} doc.close();
	}
	
	ArrayList<String> ds= new ArrayList<String>();//Tao ra 1 mang dong
	
	 public ArrayList<String> DocFile1(String tf) throws Exception{
    	 
    	 //Mo file ra de doc
    	 FileReader f= new FileReader(tf);
    	 //Tao ra bo dem de luu noi dung doc duoc
    	 BufferedReader doc = new BufferedReader(f);
    	 //Duyet qua tung dong trong file
    	 while(true){
    		 String st= doc.readLine();//Doc ra 1 dong
    		 if(st==null||st=="") break;//Neu het file thi dung
    		 ds.add(st);//Luu chuoi st v
    	 } 
    	 doc.close();
    	 return ds;
     }
	 public void HienThi(){
	   	 for(String st:ds){//st=1;Phan Huu Lan;6.392769163887983;dau
	   	     String[] tam= st.split("[;]"); String ht=tam[1];
	   		 System.out.println(tam[0]); System.out.println(tam[1]);
	   		 System.out.println(tam[2]); System.out.println(tam[3]);
	   		 System.out.println("---------------------"); 
	   	 } 
	 }
	public ArrayList<String> Xoa(String masv){
		for(String sv:ds) {
			String[] tam = sv.split("[;]");
			 if(tam[0].equals(masv)){
    			 ds.remove(sv);break;
    		 }
    	 }
    	 return ds;
     }
	public void LuuFile(String tf) throws Exception{
   	 //lưu all sv trong ds vao lại file có tên: tf
   	 FileWriter f= new FileWriter(tf,false);//Mo file ra de ghi de
		 PrintWriter ghi= new PrintWriter(f);//Tao ra bo dem
		 for(String sv:ds){
			 ghi.println(sv);
		 }
		 ghi.close();
    }
	public ArrayList<String> Them(String masv, String hoten, Double dtb){
   	 //Chu y: Kiem tra trung masv: ve nha lam
   	String tt=masv+";"+hoten+";"+dtb+";"+(dtb>=5?"dau":"rot");
   	ds.add(tt);
   	 return ds;
    }
	public ArrayList<String> Sua(String masv,  Double dtb){
   	 //Sửa lại dtb cho sv có mã sinh viên là: masv: làm trong mảng ds
   	 int n= ds.size();
   	 for(int i=0;i<n;i++){
   		 String[] tam= ds.get(i).split("[;]"); 
   		 if(tam[0].equals(masv)){//st=1;Phan Huu Lan;6.392769163887983;dau
   			 String tt=tam[0]+";"+tam[1]+";"+dtb+";"+tam[3];
   			 ds.set(i, tt);
   			 break;
   		 }
   	 }
   	 return ds;
	}
	public void TaoFile(String tf, int n) throws Exception {
		String[] ten= {"Ha", "Trung", "Thu", "Lan"};
		String[] chulot= {"Van", "Hoang", "Huu", "Nam"};
		String[] ho= {"Nguyen", "Phan", "Phan", "Nam"};
		Random r = new Random();
		FileWriter  f= new FileWriter(tf);//Tao File ra de ghi
		PrintWriter ghi= new PrintWriter(f);
		for(int i=1; i<=n; i++) {
		System.out.print(r.nextInt(ten.length));
		String t=ten[r.nextInt(ten.length)];
		String cl=chulot[r.nextInt(chulot.length)];
		String h=ho[r.nextInt(ho.length)];
		String ht= h+" "+cl+" "+t;
		Double dtb=r.nextDouble()*10;
		ghi.println(i+";"+ ht + ";"+dtb+ ";"+(dtb>=5?"dau":"rot"));
		} ghi.close();
		
	}
	 public void TimKiem2(String tf,String key) throws Exception{
	    	for(String st:ds){//st=1;Phan Huu Lan;6.392769163887983;dau
	    	     String[] tam= st.split("[;]"); String ht=tam[1];
	    		 if(ht.toLowerCase().trim().contains(key.toLowerCase().trim())){
	    		 System.out.println(tam[0]); System.out.println(tam[1]);
	    		 System.out.println(tam[2]); System.out.println(tam[3]);
	    		 System.out.println("---------------------"); }
	    	 } 
	     }
	public void TimKiem(String tf, String key) throws Exception{
		//Mo File ra de doc
		FileReader f= new FileReader(tf);
		//Tao ra bo dem de luu noi dung doc duoc
		BufferedReader doc= new BufferedReader(f);
		//Duyet qua tung dong trong File
		while(true) {
			String st= doc.readLine(); //Doc ra 1 dong
			if(st==null||st=="") break;//Neu het File thi dung
			//Che chuoi st ra thanh 4 phan
			String[] ds= st.split("[;]"); String ht = ds[1];
			if(ht.toLowerCase().trim().contains(key.toLowerCase().trim())) {
			System.out.println(ds[0]); System.out.println(ds[1]);
			System.out.println(ds[2]); System.out.println(ds[3]);
			System.out.println("------------------------------"); }
				} doc.close();
	}
	
}