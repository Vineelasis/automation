package xlfetching;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.graph.AbstractNetwork;

public class apache {
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\csc\\eclipse-workspace\\SeleniumPractice\\TestData\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
				
	
		
	
		
		
	}

}
