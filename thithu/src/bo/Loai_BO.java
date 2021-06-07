package bo;

import java.util.ArrayList;

import DAO.Loai_DAO;
import bean.Loai;


public class Loai_BO {
	public static Loai_DAO l = new Loai_DAO();
	public static ArrayList<Loai> listl = new ArrayList<Loai>() ;
	public ArrayList<Loai> getl () throws Exception{
		listl = l.docsql();
		return listl;
	}

}
