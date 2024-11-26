package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import entity.SinhVien;
import ui.InDSSVUI;

public class InDSSVControl {
	
	private InDSSVDAO inDSSVDAO  = null;
	private InDSSVUI inDSSVUI = null;
	
	
	public InDSSVControl() {
		
	}

	public void getDSSV() {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSV = inDSSVDAO.getDSSV();
		inDSSVUI.inDSSV(dsSV);
		
	}

}
