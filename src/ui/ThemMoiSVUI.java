package ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class ThemMoiSVUI {
	
	//fields
	private PrintWriter screenOut = null;
	private Scanner keyBoardInput = null;
	
	private String hoTenPrompt, nganhPrompt, diaChiPrompt,
	ngaySinhPromt, diemJavaPrompt, diemCssPrompt, 
	diemHtmlPrompt, diemMarketingPrompt, diemSalesPrompt;
	
	//functions - methods
	
	public ThemMoiSVUI() {
		
	}
	
	public ThemMoiSVUI(PrintWriter _screenOut, Scanner _keyBoardInput) {
		screenOut = _screenOut;
		keyBoardInput = _keyBoardInput;
		hoTenPrompt = "HO TEN SV: ";
		nganhPrompt = "NGANH [\"KTPM\" / \"KT\"]: ";
		diaChiPrompt = "DIA CHI CUA SV: ";
		ngaySinhPromt = "NGAY SINH CUA SV: ";
		diemCssPrompt = "DIEM MON HOC CSS: ";
		diemJavaPrompt = "DIEM MON HOC JAVA: ";
		diemMarketingPrompt = "DIEM MON HOC Marketing: ";
		diemSalesPrompt = "DIEM MON HOC SALES: ";		
	}
	
	public void nhapThongTinSV() {
		screenOut.print(hoTenPrompt);screenOut.flush();
		String hoTen = keyBoardInput.nextLine();
		screenOut.print(nganhPrompt);screenOut.flush();
		String nganh = keyBoardInput.nextLine();
		screenOut.print(diaChiPrompt);screenOut.flush();
		String diaChi = keyBoardInput.nextLine();
		screenOut.print(ngaySinhPromt);screenOut.flush();
		String ngaySinh = keyBoardInput.nextLine();// dd/MM/yyyy
		
		if("KTPM".equalsIgnoreCase(nganh)){
			screenOut.print(diemJavaPrompt);screenOut.flush();
			double diemJava = keyBoardInput.nextDouble();
			screenOut.print(diemCssPrompt);screenOut.flush();
			double diemCss = keyBoardInput.nextDouble();
			screenOut.print(diemHtmlPrompt);screenOut.flush();
			double diemHtml = keyBoardInput.nextDouble();
		}
		
		if("KT".equalsIgnoreCase(nganh)) {
			screenOut.print(diemMarketingPrompt);screenOut.flush();
			double diemMarketing = keyBoardInput.nextDouble();
			screenOut.print(diemSalesPrompt);screenOut.flush();
			double diemSales = keyBoardInput.nextDouble();
		}
	}
	

}
