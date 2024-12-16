package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import database.InDSSVDAOFile;
import entity.SinhVien;
import ui.InDSSVUI;

public class InDSSVControl {
	
	//private InDSSVDAO inDSSVDAO  = null;
	private InDSSVUI inDSSVUI = null;
	//private InDSSVDAOFile inDSSVDAOFile = null;
	private InDAO inDAO = null;
	
	
	public InDSSVControl() {
		
	}
	
	public InDSSVControl(InDAO inDAO , InDSSVUI inDSSVUI) {
		
		this.inDAO = inDAO;
		this.inDSSVUI = inDSSVUI;
		
	}
	
	public void setInDSSVDAOFile(InDAO inDAO) {
		this.inDAO = inDAO;
	}

	public void inDSSV() {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSV = inDAO.getDSSV();
		inDSSVUI.inDSSV(dsSV);
		
	}

}
