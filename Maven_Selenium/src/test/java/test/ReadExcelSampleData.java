package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadExcelSampleData {
  @Test
  public void readExcelata() throws Exception {
	  
	  String path=System.getProperty("user.dir");
	  System.out.println(path);
	  
	  File file=new File(path+"\\src\\test\\resources\\TestData\\SampleTest.xlsx");
	  FileInputStream fis = new FileInputStream(file);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  Sheet sheet=wb.getSheetAt(0);
	  int rowsCount= sheet.getPhysicalNumberOfRows();
	  System.out.println("Rows: "+rowsCount);
	  
	  int columnsCount = sheet.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Columns: "+columnsCount);
	  
//	  String v1= sheet.getRow(0).getCell(0).getStringCellValue();
//	  String v2=sheet.getRow(0).getCell(1).getStringCellValue();
//	  String v3= sheet.getRow(0).getCell(2).getCellFormula();
//	  System.out.println(v1+"\t"+v2+"\t"+v3);
	  
	  for (int i = 0; i <rowsCount; i++) {
		for (int j = 0; j <columnsCount; j++) {
			
			CellType cellType = sheet.getRow(i).getCell(j).getStringCellValue();
			Object value=null;
			
			
			//String value=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"\t");
		}
		System.out.println();
	}
	  wb.close();
	  fis.close();
	
  }
}
 