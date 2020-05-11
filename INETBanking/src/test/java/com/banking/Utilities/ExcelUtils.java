package com.banking.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelUtils {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static HSSFWorkbook wb;
	public static HSSFSheet sh;
	public static HSSFRow row;
	public static HSSFCell cell;
	
	public static int getRowCount(String xlFile, String xlSheet)throws IOException {
		
		fis=new FileInputStream(xlFile);
		wb=new HSSFWorkbook(fis);
		sh=wb.getSheet(xlSheet);
		int rowCount=sh.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}
	
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException{
		fis=new FileInputStream(xlFile);
		wb=new HSSFWorkbook(fis);
		sh=wb.getSheet(xlSheet);
		row=sh.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
	}
	
	public static String getData(String xlFile, String xlSheet, int row, int col) throws Exception {

		fis = new FileInputStream(xlFile);
		wb = new HSSFWorkbook(fis);
		sh = wb.getSheet(xlSheet);
		cell = sh.getRow(row).getCell(col);
		String cellData = cell.getStringCellValue();
		return cellData;
	}
	
	public static void setData(String Result, String xlFile, int rowNum, int colNum ) throws Exception {
		
		row = sh.getRow(rowNum);
		cell = row.getCell(colNum);		
		cell = row.createCell(colNum);
		cell.setCellValue(Result);		
		
		fos = new FileOutputStream(xlFile);
		wb.write(fos);
		fos.flush();
		fos.close();
	}

}
