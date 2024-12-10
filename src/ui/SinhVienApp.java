package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import control.ThemMoiSVControl;
import database.ArrayListCoSoDuLieu;
import database.ThemSVDAO;
import database.ThemSVDAOFile;

public class SinhVienApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khoi tao database
		//ham initDatabase() la static
		ArrayListCoSoDuLieu.initDatabase();
		
		ThemSVDAOFile themSVDAORemote = new ThemSVDAOFile("SV.data");
		
		ThemMoiSVControl themSVControlRemote = new 
				ThemMoiSVControl(themSVDAORemote);
		
		
		
		PrintWriter screenOutRemote = new PrintWriter(System.out, true);
		Scanner keyBoardInputRemote = new Scanner(System.in);
		
		ThongBaoThemMoiSVUI tbThemMoiSV = new 
				ThongBaoThemMoiSVUI(screenOutRemote);
		
		themSVControlRemote.setThongBaoThemMoiSVUI(tbThemMoiSV);

		ThemMoiSVUI themMoiSVUIRemote = new 
				ThemMoiSVUI(screenOutRemote, keyBoardInputRemote, 
						themSVControlRemote);
		
		MainMenuUI mainMenuUIRemote = new MainMenuUI(screenOutRemote, 
				keyBoardInputRemote, themMoiSVUIRemote);
		
		mainMenuUIRemote.controlLoop();

	}

}
