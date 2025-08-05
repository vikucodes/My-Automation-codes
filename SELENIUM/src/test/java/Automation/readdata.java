package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\D:\\Book11.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(file);
       XSSFSheet sheet=Workbook.getSheet("sheet1");
       int totalRows= sheet.getLastRowNum();
       int totalcells= sheet.getRow(1).getLastCellNum();  
       System.out.println("total rows");
       System.out.println("total cells");
       
       for(int r=0 ;r<=totalRows;r++) {
    	   
    	   XSSFRow CurrentRow =sheet.getRow(r);
    	   
    	   for(int c=0 ; c<=totalcells;c++) {
    		
    		   XSSFCell cell =CurrentRow.getCell(c);
    		   System.out.println(cell.toString()+ "\t");
    	   }
    	   System.out.println("Running");
       }
       Workbook.close();
       file.close();
       
	}

}
