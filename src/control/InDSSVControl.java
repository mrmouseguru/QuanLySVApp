package control;

import java.util.ArrayList;

import database.InDSSVDAO;
import database.InDSSVDAOFile;
import entity.SinhVien;
import ui.InDSSVUI;

public class InDSSVControl {
	
	private InDSSVDAO inDSSVDAO  = null;
	private InDSSVUI inDSSVUI = null;
	private InDSSVDAOFile inDSSVDAOFile = null;
	
	
	public InDSSVControl() {
		
	}
	
	public InDSSVControl(InDSSVDAO inDSSVDAO, InDSSVUI inDSSVUI) {
		
		this.inDSSVDAO = inDSSVDAO;
		this.inDSSVUI = inDSSVUI;
		
	}
	
	public void setInDSSVDAOFile(InDSSVDAOFile inDSSVDAOFile) {
		this.inDSSVDAOFile = inDSSVDAOFile;
	}

	public void inDSSV() {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSV = inDSSVDAOFile.getDSSV();
		inDSSVUI.inDSSV(dsSV);
		
	}

}
