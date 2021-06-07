package random;

import java.util.Random;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String[] ho = {"Hoang", "Nguyen"};
		String h = ho[r.nextInt(ho.length)];

		String[] ten = {"Duc", "Nam"};
		String t = ten[r.nextInt(ten.length)];
		System.out.println(h +" "+t);
	}
}
