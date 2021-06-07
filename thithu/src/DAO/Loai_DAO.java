package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Loai;


public class Loai_DAO {
	public ArrayList<Loai> docsql() throws SQLException{
		ArrayList<Loai> arr = new ArrayList<Loai>();
		Statement st = coso.conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM DonVi");
		
		while(r.next()) {
			String ml = r.getString(1);
			String tl = r.getString(2);
			Loai l = new Loai(ml,tl);
			arr.add(l);
		}
		return arr;
	}
}
