package DataAccessObj;

public class base {
	public void ketNoi() throws ClassNotFoundException{
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Da xac dinh");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			base cs = new base();
			cs.ketNoi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
