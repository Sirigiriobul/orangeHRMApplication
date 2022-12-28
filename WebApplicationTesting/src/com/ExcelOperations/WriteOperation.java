package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws IOException 
	{
		
		
	 FileInputStream file= new FileInputStream("./src/com/ExcelWorkBook/WriteTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Row row=sheet.createRow(0);
		Row row1=sheet.createRow(1);
		
				
		
		Cell cell=row.createCell(0);
		Cell cell1=row.createCell(1);
		
		
		
		cell.setCellValue("Selenium");
		cell1.setCellValue("Automation");
		

		int rowCount=sheet.getLastRowNum();
		
				System.out.println(rowCount);
		
		FileOutputStream testResult=new FileOutputStream("./src/com/ExcelWorkBook/WriteTestData1.xlsx");
		
		workbook.write(testResult);
		
		
		
		
		
		
	}
	
	
}
