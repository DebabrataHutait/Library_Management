
package test;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Debabrata
 */
public class test1 {
    
    public static void main(String[] args) {
        Connection conn=null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","##Dh1122334455@@@");
            if(conn!=null)
                System.out.println("Connection Successful");
        }
        catch(Exception e)
        {
            System.out.println("Failed!");
        }
    }
    
}
