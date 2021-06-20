package week7.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util_ReadExcel {
public static String[][] getExcelData(String path) throws IOException {
	// 1. Open the respective excel file
	XSSFWorkbook book = new XSSFWorkbook(path);
	// 2. Open the respective sheet
	XSSFSheet sheet = book.getSheetAt(0);
//	XSSFSheet sheet = book.getSheet("Login");
	// 3. To find the number of rows available/used 
	/*
	 * int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	 * System.out.println(physicalNumberOfRows);
	 */
	int rowCount = sheet.getLastRowNum();
	System.out.println("Row Count:"+rowCount);
	// 4. To find the number of cols available
	short colCount = sheet.getRow(0).getLastCellNum();
	System.out.println("Column Count: "+colCount);
	
	//4.1 Create a two dimensional array to store the data retrieved from the excel
	String[][] data = new String[rowCount][colCount];
	
	//5. Iterate over the rows from the second row
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow eachRow = sheet.getRow(i);
		//6. Iterate over the cols to retrieve data out of it
		for (int j = 0; j < colCount; j++) {
			XSSFCell cell = eachRow.getCell(j);
			String value = cell.getStringCellValue();
			// Put the value in the 2D array
			data[i-1][j] = value;
			System.out.println(value);
		}
	}
	return data;
	
	
	
	
	
	
	
	
	
}
}
