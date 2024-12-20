package control;

import java.util.Date;

import database.ThemDAO;
import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;
import ui.ThongBaoThemMoiSVUI;

public class ThemMoiSVControl {
	
	//fields
	///private ThemSVDAO themSVDAO = null;
	//private ThemSVDAOFile daoFile = null;
	private ThemDAO themDAO = null;
	private ThongBaoThemMoiSVUI tbThemMoiUI = null;
	
	
	//functions - methods
	//constructor
	public ThemMoiSVControl() {
		
	}
	
	public void setThongBaoThemMoiSVUI
	(ThongBaoThemMoiSVUI _tbThemMoiUI) {
		tbThemMoiUI = _tbThemMoiUI;
	}
	
	public ThemMoiSVControl(ThemDAO themDAO) {
		this.themDAO = themDAO;
	}
	
	
	//KTPM
	public void taoSV(String hoTen, String diaChi, Date ngaySinh,
			double diemJava, double diemCss, double diemHtml) {
		//SinhVien
		//SinhVienKTPM
		//SinhVienKT
		SinhVienKTPM svpm  = new SinhVienKTPM(hoTen, diaChi, 
				ngaySinh, diemJava, diemCss, diemHtml);
		themSV(svpm);
	}
	
	public void taoSV(String hoTen, String diaChi, Date ngaySinh,
			double diemMakerting, double diemSales) {
		//SinhVien
		//SinhVienKTPM
		//SinhVienKT
		SinhVienKT svkt = new SinhVienKT(hoTen, diaChi, ngaySinh, 
				diemMakerting, diemSales);
		themSV(svkt);
	}
	
	private void themSV(SinhVien sv) {
		themDAO.addSinhVien(sv);
		tbThemMoiUI.inThongBao("Them SV Thanh Cong!!!");
		
		
	}

}
