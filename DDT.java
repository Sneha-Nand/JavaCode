package basicPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\SNEHA\\Java\\JavaOne\\DDTesting\\sneha.xlsx");
		Workbook w1 =  WorkbookFactory.create(f1);
//		Sheet s1 = w1.getSheet("logindetails");
//		
//		// username
//		Row r1 = s1.getRow(1);
//		Cell c1 = r1.getCell(0);
//		String username = c1.getStringCellValue();
//		System.out.println(username);
//		
//		// password
//		Cell c2 = r1.getCell(1);
//		String password = c2.getStringCellValue();
//		System.out.println(password);
		
		// we can read this data using single line code
		String username1 = w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username1);
		
		String password = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		

	}

}
