package control;

import java.util.Date;

import database.ThemSVDAO;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class ThemMoiSVControl {
	
	//fields
	private ThemSVDAO themSVDAO = null;
	
	
	//functions - methods
	//constructor
	public ThemMoiSVControl() {
		
	}
	
	public ThemMoiSVControl(ThemSVDAO _themSVDAO) {
		themSVDAO = _themSVDAO;
	}
	
	
	//KTPM
	public void taoSV(String hoTen, String diaChi, Date ngaySinh,
			double diemJava, double diemCss, double diemHtml) {
		//SinhVien
		//SinhVienKTPM
		//SinhVienKT
		SinhVienKTPM svpm  = new SinhVienKTPM(hoTen, diaChi, 
				ngaySinh, diemJava, diemCss, diemHtml);
		themSVDAO.addSinhVien(svpm);
	}
	
	public void taoSV(String hoTen, String diaChi, Date ngaySinh,
			double diemMakerting, double diemSales) {
		//SinhVien
		//SinhVienKTPM
		//SinhVienKT
		SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinh, 
				diemMakerting, diemSales);
		themSVDAO.addSinhVien(svkt);
	}

}
