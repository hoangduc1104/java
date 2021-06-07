package phan2;

public class nguoi {
	protected String hoten;
	protected int tuoi;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public nguoi(String hoten, int tuoi) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
	}
	public nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("hoten: " +hoten+ "\ttuoi: "+ tuoi);
	}
}
