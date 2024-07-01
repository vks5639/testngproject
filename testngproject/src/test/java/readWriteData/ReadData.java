package readWriteData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\readfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCols =  sheet.getRow(1).getLastCellNum();
		
		for (int i=0; i<=totalRows; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for(int j=0; j<totalCols; j++) {
				XSSFCell cellValue = currentRow.getCell(j);
				System.out.print(cellValue.toString()+"\t");
			}
			System.out.println();
		}
		
		wb.close();
		file.close();

	}

}
