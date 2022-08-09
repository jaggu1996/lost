package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramatrization {
	public static String getData(int row,int coloumn) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\real path.xlsx");
		
		String user	= WorkbookFactory.create(file).getSheet("credential").getRow(row).getCell(coloumn).getStringCellValue();
	  return user;
		
	}
  
}
