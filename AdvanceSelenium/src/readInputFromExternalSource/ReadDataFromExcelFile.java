package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException 
	{
		//Step 1: Create object for File
		File file = new File("./testData/testData1.xlsx");
		
		
		//Step2: Create object for file inputstream
		FileInputStream fis = new FileInputStream(file);
		
		//Step3: Create object for XSSFWorkBook
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		//To get sheet name
		String sheet_name= xsf.getSheetName(0);
		System.out.println(sheet_name);
		
		//reference for sheet
		XSSFSheet sheet =xsf.getSheet(sheet_name);
		
		//Now we can call getRow() and getCell() to retrieve value;
		String entry1=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(entry1);
		
		String entry2=sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(entry2);
		
		String entry3=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(entry3);
	}

}
