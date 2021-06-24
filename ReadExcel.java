package utilis;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		/*XSSFRow row = ws.getRow(0);
		XSSFCell cell = ws.getRow(0).getCell(1);
		String value = cell.getStringCellValue();
		*/
		
		int  rows = ws.getLastRowNum();
		int  cells = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[rows][cells];
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 0; j <cells; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]= value;
				
			}
		}
		wb.close();
		
		return data;

	}

}
