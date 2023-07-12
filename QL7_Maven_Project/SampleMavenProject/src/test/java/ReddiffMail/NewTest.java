package ReddiffMail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class NewTest {
	static File file= new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\SqlBook.xlsx");
	
	
  @Test
  public void demoSQL() throws ClassNotFoundException, SQLException, IOException {
	  
	  FileInputStream fis= new FileInputStream(file);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
      XSSFSheet sh = wb.getSheet("Sheet1");

	  
	  
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
	  	  	  
	  Statement smt= connect.createStatement();
	 
		String query1 = "INSERT INTO InsertDemo " + "VALUES (1, 'John', 3)";

	  smt.executeUpdate(query1);

	  query1 = "INSERT INTO InsertDemo " + "VALUES (2, 'Carol', 42)";

	  smt.executeUpdate(query1);
	  
  
  
  XSSFRow row = sh.createRow(0);  
       
  int r=1;
  ResultSet result=smt.executeQuery("select *from insertdemo");
  
  
      while(result.next()) {

     
		
      row = sh.createRow(r++);
      row.createCell(0).setCellValue(result.getInt(1));
      row.createCell(1).setCellValue(result.getString(2));
      row.createCell(2).setCellValue(result.getString(3));  
		 
		  
	  }
	  FileOutputStream fos= new FileOutputStream(file);
  	 wb.write(fos);
      
	   
	  
	  
	  
  }
}
