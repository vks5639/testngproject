package readWriteData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDynamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"//TestData//writedynamicdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int totalrows = sc.nextInt();
		
		System.out.println("Enter number of cols: ");
		int totalcols = sc.nextInt();
		
		for (int i=0; i<=totalrows; i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0; j<totalcols; j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(sc.next());
			}
		}
		
		wb.write(file);
		wb.close();
		file.close();
	}

}
