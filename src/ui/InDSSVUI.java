package ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import entity.SinhVien;

public class InDSSVUI {
	private PrintWriter screenOut = null;
	
	public InDSSVUI(PrintWriter screenOut ) {
		this.screenOut = screenOut;
	}

	public void inDSSV(ArrayList<SinhVien> dsSV) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dsSV) {
			screenOut.println(sinhVien.getHoTen());

			screenOut.println(sinhVien.tinhDiemTB());
			screenOut.println(sinhVien.getHoLuc());

			//screenOut.println(sinhVien.toString());
		}
		
	}

}
