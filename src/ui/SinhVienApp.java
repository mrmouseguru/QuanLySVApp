package ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class SinhVienApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter screenOutRemote = new PrintWriter(System.out, true);
		Scanner keyBoardInputRemote = new Scanner(System.in);
		
		MainMenuUI mainMenuUIRemote = new MainMenuUI(screenOutRemote, 
				keyBoardInputRemote);
		
		mainMenuUIRemote.controlLoop();

	}

}
