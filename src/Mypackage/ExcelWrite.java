package Mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\halifax.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.createRow(1);
		
		XSSFCell cell = row.createCell(2);
		
		XSSFRow row1 = sheet.getRow(9);
		XSSFCell cell1 = row1.getCell(1);
		cell1.setCellValue("student");


		cell.setCellValue("vishnupriya");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\halifax.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
	}
}
