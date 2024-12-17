package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import control.InDSSVControl;
import control.ThemMoiSVControl;
import database.ArrayListCoSoDuLieu;
import database.InDSSVDAO;
import database.InDSSVDAOFile;
import database.ThemSVDAO;
import database.ThemSVDAOFile;
import database.ThemSVDAOMySQL;

public class SinhVienApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khoi tao database
		//ham initDatabase() la static
		ArrayListCoSoDuLieu.initDatabase();
		
		ThemSVDAOFile themSVDAORemote = new ThemSVDAOFile("SV.data");
		ThemSVDAOMySQL themSVDAOMySQL = new ThemSVDAOMySQL();
		InDSSVDAO inDSSVDAO = new InDSSVDAO();
		
		ThemMoiSVControl themSVControlRemote = new 
				ThemMoiSVControl(themSVDAOMySQL);
		
		InDSSVDAOFile inDSSVDAOFile = new InDSSVDAOFile("SV.data");
		
		
		
		PrintWriter screenOutRemote = new PrintWriter(System.out, true);
		Scanner keyBoardInputRemote = new Scanner(System.in);
		
		InDSSVUI inDSSVUI = new InDSSVUI(screenOutRemote);
		
		InDSSVControl inDSSVControl = new InDSSVControl(inDSSVDAO, inDSSVUI);
		inDSSVControl.setInDSSVDAOFile(inDSSVDAOFile);
		
		
		ThongBaoThemMoiSVUI tbThemMoiSV = new 
				ThongBaoThemMoiSVUI(screenOutRemote);
		
		themSVControlRemote.setThongBaoThemMoiSVUI(tbThemMoiSV);

		ThemMoiSVUI themMoiSVUIRemote = new 
				ThemMoiSVUI(screenOutRemote, keyBoardInputRemote, 
						themSVControlRemote);
		
		MainMenuUI mainMenuUIRemote = new MainMenuUI(screenOutRemote, 
				keyBoardInputRemote, themMoiSVUIRemote);
		
		mainMenuUIRemote.setInDSSV(inDSSVControl);
		
		mainMenuUIRemote.controlLoop();

	}

}
