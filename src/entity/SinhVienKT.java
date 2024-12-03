package entity;

import java.util.Date;

public class SinhVienKT extends SinhVien{
	private double diemMarketing;
	private double diemSales;
	
	//function
	//constructror
	public SinhVienKT() {
		
	}
	
	public SinhVienKT(String _hoTen, String _diaChi, Date _ngaySinh,
			double _diemMarketing, double _diemSales) {
		super(_hoTen, "KT", _diaChi, _ngaySinh);
		diemMarketing = _diemMarketing;
		diemSales = _diemSales;
	}

	@Override
	public double tinhDiemTB() {
		return (2 * diemMarketing + diemSales) / 3;
	}

}
