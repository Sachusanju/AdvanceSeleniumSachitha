package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Sachitha
 */

public class UtilityMethodsToReadData
{
	/**
	 * 
	 * @param path - need to pass path for property file
	 * @param key - you have to pass key for property file
	 * @return
	 * @throws IOException
	 */
	public String readTheDataFromPropertyFile(String path, String key) throws IOException
	{
	
		File file = new File(path);
		FileInputStream fis  = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public String readingDataExcelSingleValue(String path, String sheetName, int rowNum, int colNum) throws IOException
	{
		File file = new File(path);
		FileInputStream fis  = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(colNum).toString();
		return data;
	}
	
	public String[] readingRowDataFromExcel(String path, String sheetName, int colNum) throws Exception, IOException
	{
		File file = new File(path);
		FileInputStream fis  = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowNum = sheet.getPhysicalNumberOfRows();
		String[] data  = new String[rowNum];
		for(int i=0; i<rowNum;i++)
		{
			String dataFromCell = sheet.getRow(i).getCell(colNum).toString();
			data[i] = dataFromCell;
		}
		
		return data;
	}
	
	public static String[][] readingDataFromMultipleRowColumn(String path, String sheetName) throws IOException
	{
		File file = new File(path);
		FileInputStream fis  = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data  = new String[rowNum][colNum];
		for(int i=0; i<rowNum;i++)
		{
			for(int j=0; j< colNum; j++)
			{
				String dataFromCell = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j] = dataFromCell;
				
			}
		}
		
		return data;
	}
}
