
package finaloop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static jdk.nashorn.internal.objects.NativeString.search;


public class connection {
    
    Connection c;
    Statement s;
    
    public connection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopfinal","root","");
            s=c.createStatement();
             
        }catch(Exception e){
            System.out.println(e);
            
        }
    }

    
        
        
        }
    

