package SeleniumConceptsPractice;

import java.io.FileInputStream;

public class xl {
	
	
	
	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("C:\\Users\\csc\\Desktop\\testdata\\.xlsx");
		Workbook wb=WorkbookFactory.(fis);
		String UN=wb.getsheet("sheet1").getrow(0).getcell(0).getStringcellvalue();
		System.out.println(UN);
		String PWD=wb.getsheet("sheet1").getrow(1).getcell(0).getStringcellvalue();
		System.out.println(PWD);
		
	}

}
