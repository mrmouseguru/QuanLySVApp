package database;

import entity.SinhVien;

public class ThemSVDAO extends ThemDAO {
	
	public ThemSVDAO() {
		
	}
	
	public void addSinhVien(SinhVien sv ) {
		ArrayListCoSoDuLieu.insertSinhVien(sv);
	}

}
