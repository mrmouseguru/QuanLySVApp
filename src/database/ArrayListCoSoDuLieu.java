package database;

import java.util.ArrayList;

import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class ArrayListCoSoDuLieu {
	
	//fields
	private static ArrayList<SinhVien> csdl = null;
	
	//function
	public static void initDatabase() {
		csdl = new ArrayList<SinhVien>();
		insertSinhVien(new SinhVienKT("Teo", "TPHCM", null, 5, 5));
		insertSinhVien(new SinhVienKTPM("Ty", "HN", null, 2,2, 2));
	}
	
	public static void insertSinhVien(SinhVien sv) {
		csdl.add(sv);
	}

}
