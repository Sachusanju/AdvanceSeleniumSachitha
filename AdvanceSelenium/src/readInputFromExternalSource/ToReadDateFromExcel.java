package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ToReadDateFromExcel {

	public static void main(String[] args) throws Exception, IOException
	{
		//Step 1: Create object for File
		File file = new File("./testData/testData1.xlsx");
		
		//Step2: Create object for file input stream
		FileInputStream fis = new FileInputStream(file);
		
		//To create direct object for workBook(it will take care about excel extension)
		Workbook work_book = WorkbookFactory.create(fis);
		
		LocalDateTime date = work_book.getSheet("data").getRow(2).getCell(1).getLocalDateTimeCellValue();
		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfMonth());
		
		//Date value = work_book.getSheet("data").getRow(2).getCell(1).getDateCellValue();
		
		//System.out.println(value);
	}

}
