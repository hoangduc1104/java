package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class coso {
	public static Connection conn;
	public static void ketNoi() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		System.out.println("Da xac dnh HQTCSDL!");
		String url="jdbc:sqlserver://localhost;databaseName=19T1021035;user=DUC;password=123";
		conn=DriverManager.getConnection(url);
//		System.out.println("Da ket noi");
	}
}
