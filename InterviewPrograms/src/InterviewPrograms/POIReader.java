package InterviewPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POIReader {

	private static HSSFWorkbook excelBook;
	private static HSSFSheet excelSheet;
	private static HSSFCell cell;
	

	public static String getData(int row, int col) throws Exception {

		FileInputStream fis = new FileInputStream("D:\\Learning Selenium\\TestData\\Test.xls");
		excelBook = new HSSFWorkbook(fis);
		excelSheet = excelBook.getSheet("Sheet1");
		cell = excelSheet.getRow(row).getCell(col);
		String cellData = cell.getStringCellValue();
		return cellData;
	}
	
	public static void setData(String Result, int row, int col ) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Learning Selenium\\TestData\\Test.xls");
		excelBook = new HSSFWorkbook(fis);
		excelSheet = excelBook.getSheet("Sheet1");
		excelSheet.createRow(row).createCell(col).setCellValue(Result);
		FileOutputStream fos = new FileOutputStream("D:\\Learning Selenium\\TestData\\Test.xls");
		excelBook.write(fos);
		System.out.println("Value configured");
		fos.flush();
		fos.close();
	}

	public static void main(String[] args) throws Exception {

		System.out.println(getData(1, 2));
		setData("Dinesh",5,8);

	}

}
