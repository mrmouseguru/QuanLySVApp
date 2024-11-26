package ui;

import java.io.PrintWriter;

public class ThongBaoThemMoiSVUI {
	
	private PrintWriter screenOutput = null;
	
	public ThongBaoThemMoiSVUI() {
		
	}
	
	
	public ThongBaoThemMoiSVUI(PrintWriter _screenOutput) {
		screenOutput = _screenOutput;
		
	}
	
	
	public void inThongBao(String thongBao) {
		screenOutput.println(thongBao);
	}

}
