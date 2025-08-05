package Topics_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reading_data_from_Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
//C:\Selenium Training Workspace\Impotant_selenium_topics\testdata\data.xlsx=System.getProperty("user.dir")+"\\testdata\\data.xlsx"
		//we can use
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	XSSFSheet sheet=	workbook.getSheet("Sheet1");
	
            int totalRows=	sheet.getLastRowNum();
	
       int totalCells= sheet.getRow(1).getLastCellNum();// we can put any row no. here
       
       System.out.println("no. of Rows :"+totalRows);//5
       System.out.println("no. of Cells :"+totalCells);//4
	
       for(int r=0;r<=totalRows;r++) 
       {
    	  
    	XSSFRow  currentrow=  sheet.getRow(r);
    	   
    	   for(int c=0;c<totalCells;c++) {
    		   
    	XSSFCell cell=	   currentrow.getCell(c);
    	System.out.print(cell.toString()+"\t");
    		   
    	   }
    	   System.out.println();
       }
       
       workbook.close();
       file.close();
		
	}

}
