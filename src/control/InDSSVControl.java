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
	
	public InDSSVControl(InDSSVDAO inDSSVDAO, InDSSVUI inDSSVUI) {
		
		this.inDSSVDAO = inDSSVDAO;
		this.inDSSVUI = inDSSVUI;
		
	}

	public void inDSSV() {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSV = inDSSVDAO.getDSSV();
		inDSSVUI.inDSSV(dsSV);
		
	}

}
