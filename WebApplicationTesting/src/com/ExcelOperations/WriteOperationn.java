package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperationn {
	public static void main(String[] args) throws IOException {
		
	
FileInputStream file=new FileInputStream("./src/com/ExcelWorkBook/TestData2.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);
XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.createRow(1);
Cell cell=row.createCell(0);

cell.setCellValue("laddu");
FileOutputStream save=new FileOutputStream("./src/com/ExcelWorkBook/TestData3.xlsx");
workBook.write(save);
}
}