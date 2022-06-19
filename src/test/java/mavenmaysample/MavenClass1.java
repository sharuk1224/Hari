package mavenmaysample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
                                                   
public class MavenClass1 {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\Hari Prasad\\eclipse-workspace\\mavenmaysample\\src\\test\\resources\\Harish\\new sheet.xlsx");
	FileInputStream file=new FileInputStream(f);
	Workbook b= new XSSFWorkbook(file);
	Sheet sheet = b.getSheet("data");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	
	Row row2 = sheet.getRow(1);
	Cell cell2 = row2.getCell(2);
	System.out.println(cell);
	System.out.println(cell2);
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
