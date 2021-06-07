package bt1;

import java.io.BufferedReader;
import
java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class docfile {
	
	ArrayList<String> ds= new ArrayList<String>();
	
	 public ArrayList<String> DocFile1(String tf) throws Exception{
  
	   	 FileReader f= new FileReader(tf);
	   	 BufferedReader doc = new BufferedReader(f);
	   	 while(true){
	   		 String st= doc.readLine();
	   		 if(st==null||st=="") break;
	   		 //1;abc;2323;
	   		 //2;abc;2323;
	   		 ds.add(st);
	   	 } 
	   	 doc.close();
	   	 return ds;
    }
	 public void HienThi(){
	   	 for(String st:ds){
	   	     String[] tam= st.split("[;]");
	   		 System.out.println(tam[0]); System.out.println(tam[1]);
	   		 System.out.println(tam[2]); System.out.println(tam[3]);
	   		 System.out.println("---------------------"); 
	   	 } 
	 }
	 public void thanhtien() {
		 long tien = 0;
		 for(String st:ds){
	   	     String[] tam= st.split("[;]");
	   		 tien =  Long.parseLong(tam[2])*Long.parseLong(tam[3]);
	   		System.out.println(tam[1]);
	   		System.out.println(tam[2]);
	   		System.out.println(tien);
	   	 } 
	 }
	 public void timkiem() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap ten hang can tim: ");
		 String ten = sc.nextLine();
		 for(String st:ds){
	   	     String[] tam= st.split("[;]");
	   		 if(tam[1].contains(ten)) {
	   			System.out.println(tam[1]);
	   			System.out.println(tam[3]);
	   		 }
	   	 } 
	 }
}
