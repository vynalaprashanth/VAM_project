package ReddiffMail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.common.reflection.qual.ForName;
import org.testng.annotations.Test;

public class sql {
    static File file=new File("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Desktop\\prashanth\\Excel\\appfiles2\\SqlBook.xlsx");

 @Test
  public void SQL() throws SQLException, ClassNotFoundException, IOException {
      
      FileInputStream fis=new FileInputStream(file);
      XSSFWorkbook wb=new XSSFWorkbook(fis);
      XSSFSheet sh=wb.getSheet("sheet1");
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
     Statement st=connect.createStatement();
     XSSFRow row = sh.createRow(0);
 
   String query1 = "INSERT INTO insertdemo " + "VALUES (1, 'John', 34)";
   st.executeUpdate(query1);
   query1 = "INSERT INTO InsertDemo " + "VALUES (2, 'Carol', 42)";
   st.executeUpdate(query1);
int r=1;
   ResultSet result=st.executeQuery("select * from insertdemo");
   while(result.next()) {

       row = sh.createRow(r++);
          row.createCell(0).setCellValue(result.getInt(1));
          row.createCell(1).setCellValue(result.getString(2));
          row.createCell(2).setCellValue(result.getString(3));

//        System.out.println(result.getString(1));
//        System.out.println(result.getString(2));
       
    }
    FileOutputStream fos= new FileOutputStream(file);
       wb.write(fos);    
 }
}