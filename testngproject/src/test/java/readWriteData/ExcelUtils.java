package readWriteData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String file, String sheet) throws IOException {
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		int totalrows = sh.getLastRowNum();
		wb.close();
		fi.close();
		return totalrows;
		
	}
	
	public static int getColCount(String file, String sheet) throws IOException {
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		int totalcols = sh.getRow(0).getLastCellNum();
		wb.close();
		fi.close();
		return totalcols;
	}
	
	public static String getCellData (String file, String sheet, int rownum, int colnum) throws IOException {
		
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		row = sh.getRow(rownum);
		cell = row.getCell(colnum);
		
		String data;
		try {
			//data = cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
			}
		catch(Exception e) {
			data="";
		}
		wb.close();
		fi.close();
		
		return data;
	}
	
	public static void setCellData(String file, String sheet, int rownum, int colnum, String data) throws IOException {
		
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		row = sh.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(file);
		
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColor(String file, String sheet, int rownum, int colnum) throws IOException {
		
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		row = sh.getRow(rownum);
		cell = row.createCell(colnum);
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(file);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
public static void fillRedColor(String file, String sheet, int rownum, int colnum) throws IOException {
		
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheet);
		row = sh.getRow(rownum);
		cell = row.createCell(colnum);
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(file);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	

}
