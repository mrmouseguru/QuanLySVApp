package database;

import entity.SinhVien;

public class ThemSVDAO {
	
	public ThemSVDAO() {
		
	}
	
	public void addSinhVien(SinhVien sv ) {
		ArrayListCoSoDuLieu.insertSinhVien(sv);
	}

}
