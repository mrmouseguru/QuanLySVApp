package ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class MainMenuUI {
	
	//fields
	
	private PrintWriter screenOut = null;
	private Scanner keyBoardInput = null;
	private String loiNhac = "->";
	private String command = " ";
	
	//functions
	//constructor
	public MainMenuUI() {
		//khởi tạo screenOut và keyBoardInput
	}
	
	public MainMenuUI(PrintWriter _screenOut, Scanner _keyBoardInput) {
		screenOut = _screenOut;
		keyBoardInput = _keyBoardInput;
	}
	
	public void controlLoop() {
		screenOut.println("go lenh \"help\" de duoc ho tro");
		screenOut.flush();
		
		//vòng lặp
		//for
		//while
		//do while
		while(true) {
			screenOut.print(loiNhac);
			screenOut.flush();
			command = keyBoardInput.nextLine();//user nhập vào từ bàn phím
			command = command.trim();
			
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			
		}
		
		
	}
	
	private void help() {
		screenOut.println("~~~~~Console Heplp Menu~~~~~");
		//screenOut.flush();
		screenOut.println("[HELP] Ho tro su dung phan mem");
		screenOut.println("~~~~~Console Heplp Menu~~~~~");

	}
	
	

}
