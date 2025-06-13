package Mypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\halifax.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("homepage");
		
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
//		System.out.println(cell);

		System.out.println(sheet.getRow(7).getCell(1));
	


}
}
