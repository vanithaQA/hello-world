package datadriventest;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestSample {

	private static final int i = 0;

	public static void main(String[] args) throws IOException {
		File src = new File("‪‪C:/Users/win10/Desktop/datadrivenexcel.xlsx");
		FileInputStream fis = new FileInputStream("src‪‪");//create file object
XSSFWorkbook workbook = new XSSFWorkbook("fis");//create workbook abject

XSSFSheet Sheet1= workbook.getSheetAt(0);//proving sheet name
String data0= Sheet1.getRow(0).getCell(0).getStringCellValue();
System.out.println("Data from excel is"+data0);
	}}



/*int rowcount=Sheet.getLastRowNum();//returns the row count
int colcount =Sheet.getRow(0).getLastCellNum();//returns column count
for (int i =0; i<rowcount; i++) {
	
}
XSSFRow currentrow =Sheet.getRow(i);//focused on current row
for (int j =0; j<colcount; j++) {
	String value=currentrow.getCell(j).toString();//read the value from the string

}



	}
*/
	
