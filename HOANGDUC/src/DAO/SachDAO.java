package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import BEAN.Sach;

public class SachDAO {
	public ArrayList<Sach> docsql() throws SQLException{
		ArrayList<Sach> arr = new ArrayList<Sach>();
		Statement st = coso.conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM Sach");
		
		while(r.next()) {
			String ms = r.getString(1);
			String ts = r.getString(2);
			String tg = r.getString(3);
			String g = r.getString(4);
			Sach s = new Sach(ms,ts,tg,Double.parseDouble(g));
			arr.add(s);
		}
		return arr;
	}
}
