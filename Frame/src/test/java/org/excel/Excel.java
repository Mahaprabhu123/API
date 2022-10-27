package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frame\\ExcelSheet\\Book1.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		switch(type){
		case STRING:
			String value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
				String format = dateFormat.format(dateCellValue);
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				String num = valueOf.toString();
				System.out.println(num);
			}
			break;
		}
		default:
			break;
	}
}

		
		 	
	
		
		
		
	

