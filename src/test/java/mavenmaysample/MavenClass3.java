package mavenmaysample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenClass3 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Hari Prasad\\eclipse-workspace\\mavenmaysample\\src\\test\\resources\\Harish\\new sheet.xlsx");
		FileInputStream fil=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fil);
		//to get sheet from work book
		Sheet sheet = w.getSheet("data");
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);	
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat  sfd=new SimpleDateFormat("dd/MM/yy");
						String format = sfd.format(date);
						System.out.println(format);
						}
					
					else {
						double ncv = cell.getNumericCellValue();
						long l=(long)ncv;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					
					}
					
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

