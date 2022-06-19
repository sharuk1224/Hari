package mavenmaysample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenClass2 {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Hari Prasad\\eclipse-workspace\\mavenmaysample\\src\\test\\resources\\mano\\rx.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet createSheet = w.createSheet("new sheet");
	Row createRow = createSheet.createRow(2);
	Cell createCell = createRow.createCell(2);
	createCell.setCellValue("hari");
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	System.out.println("done");
}
}
