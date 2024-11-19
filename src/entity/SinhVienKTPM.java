package entity;

import java.util.Date;

public class SinhVienKTPM extends SinhVien{
	 private double diemJava;
	    private double diemCss;
	    private double diemHtml;
	    
	
	public SinhVienKTPM() {
		
	}
	
	public SinhVienKTPM(String _hoTen, String _diaChi, Date _ngaySinh,
			double _diemJava, double _diemCss, double _diemHtml) {
		super(_hoTen, "PM", _diaChi, _ngaySinh);
		diemJava = _diemJava;
		diemCss = _diemCss;
		diemHtml = _diemHtml;
	}
	
	@Override
	protected double tinhDiemTB() {
		// TODO Auto-generated method stub
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}

}
