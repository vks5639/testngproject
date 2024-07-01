package readWriteData;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"//TestData//writefile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");
		
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("id");
		row1.createCell(1).setCellValue("name");
		row1.createCell(2).setCellValue("age");
		row1.createCell(3).setCellValue("salary");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue(101);
		row2.createCell(1).setCellValue('A');
		row2.createCell(2).setCellValue(50);
		row2.createCell(3).setCellValue(50000);
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue(102);
		row3.createCell(1).setCellValue('B');
		row3.createCell(2).setCellValue(40);
		row3.createCell(3).setCellValue(40000);
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue(103);
		row4.createCell(1).setCellValue('C');
		row4.createCell(2).setCellValue(60);
		row4.createCell(3).setCellValue(60000);
		
		wb.write(file);
		wb.close();
		file.close();

	}

}
