
package airline.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){
        String dbURL = "jdbc:oracle:thin:@218.248.0.7:1521:RDBMS";
        String username = "it19737001";
        String password = "vasavi";
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            c = DriverManager.getConnection(dbURL, username, password);    
            s =c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
} 
