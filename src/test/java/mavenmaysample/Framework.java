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

public class Framework {
	
	public static void main(String[] args) throws IOException {
		
	
	
	// 1. mention the file path
	
	File f = new File("C:\\Users\\Hari Prasad\\eclipse-workspace\\mavenmaysample\\src\\test\\resources\\mano\\hari007.xlsx");
	
// 2. to read the data from excel
	
	FileInputStream file = new FileInputStream(f);
	
	// 3. workbook
	
	Workbook work = new XSSFWorkbook(file);
	
	//4.sheet
	
	Sheet sheet = work.getSheet("data");
	
	//5.row
	
	Row row = sheet.getRow(0);
	
	//6. cell
	
	Cell cell = row.getCell(1);
	
	//7. data
	
	System.out.println(cell);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
