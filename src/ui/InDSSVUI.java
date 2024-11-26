package ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import entity.SinhVien;

public class InDSSVUI {
	private PrintWriter screenOut = null;

	public void inDSSV(ArrayList<SinhVien> dsSV) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dsSV) {
			
			screenOut.println(sinhVien.toString());
		}
		
	}

}
