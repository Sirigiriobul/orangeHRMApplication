package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ObulWriteOperations {

	public static void main(String[] args) throws IOException {
//Identifying the file in the system
		FileInputStream file=new FileInputStream("./src/com/ExcelWorkBook/TestData2.xlsx");
//Identify the workbook in the file
		XSSFWorkbook workBook=new XSSFWorkbook(file);
//Identify the sheet in the workbook
		XSSFSheet sheet=workBook.getSheet("Sheet1");
//Create the Row in the sheet
		Row row=sheet.createRow(10);
//Create the row of a cell
		Cell cell=row.createCell(10);
//set the TestData into the row of a cell
		cell.setCellValue("Obul");
		
		FileOutputStream obulData=new FileOutputStream("C:\\Users\\dell\\OneDrive\\Desktop\\TestingSelenium\\WebApplicationTesting\\src\\com\\ExcelWorkBook\\TestData2.xlsx");
workBook.write(obulData);
	}

}
