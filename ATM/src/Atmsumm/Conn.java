
package Atmsumm;
import java.sql.*;


public class Conn {
    Connection c = null;
    public Statement s;
    public Conn(){
     try{ 
                  

         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("start1");
         
         c =DriverManager.getConnection("jdbc:oracle:thin:@BONGBOY:1521:XE","system","system");
         System.out.println("start2");
         s=c.createStatement();
                  

    }
     catch(Exception e){
        System.out.println(e);
        
     }
    }
    
}
