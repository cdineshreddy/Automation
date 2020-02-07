package InterviewPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIReader {

	private static XSSFWorkbook excelBook;
	private static XSSFSheet excelSheet;
	private static XSSFCell cell;
	private static XSSFRow Row;

	public static String getData(int row, int col) throws Exception {

		FileInputStream fis = new FileInputStream("F:\\Selenium\\FreeCRMTestData.xlsx");
		excelBook = new XSSFWorkbook(fis);
		excelSheet = excelBook.getSheet("contacts");
		cell = excelSheet.getRow(row).getCell(col);
		String cellData = cell.getStringCellValue();
		return cellData;
	}
	
	public static void setData(String Result, int row, int col ) throws Exception {
		
		Row = excelSheet.getRow(row);
		cell = Row.getCell(col);		
		cell = Row.createCell(col);
		cell.setCellValue(Result);		
		
		FileOutputStream fos = new FileOutputStream("F:\\Selenium\\FreeCRMTestData.xlsx");
		excelBook.write(fos);
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws Exception {

		System.out.println(getData(1, 2));
		setData("Dinesh",8,8);

	}

}
