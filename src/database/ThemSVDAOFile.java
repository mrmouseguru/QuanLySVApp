package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.SinhVien;

public class ThemSVDAOFile {
	
	//fields
	private File fileData = null;
	
	//methods
	public ThemSVDAOFile(String fileName) {
		fileData = new File(fileName);
	}
	public void addSinhVien(SinhVien sv) {
		FileOutputStream fileStream = null;
		ObjectOutputStream os = null;
		
		try {
			//mở kênh đến file cần ghi đối tượng
			fileStream = new FileOutputStream(fileData);
			//dùng công cụ để ghi xuống file thông qua
			//kênh fileStream
			os = new ObjectOutputStream(fileStream);
			os.writeObject(sv);
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
