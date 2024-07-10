
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;







public class DB_MODEL {
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    DB_MODEL(){
    
    
        try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root","");
          st=con.createStatement();
          System.out.println("DB is Connected");
       
        }catch(Exception e){
         System.out.println(e);
        }
    }
    
    public int Addaccount(int id,String name,String email, int accountNo,int PIN,String address, String gender,int dob,int creationTime,int cnic, String accountType,String balance, String status){
    int Status=0;
        try {
            String sql="insert into createacount values('"+id+"','"+name+"','"+email+"','"+accountNo+"','"+PIN+"','"+address+"','"+gender+"','"+dob+"','"+creationTime+"','"+cnic+"','"+accountType+"','"+balance+"','"+status+"')";
            Status=st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        
        }
        return Status;
   

   }
   
    public ResultSet Login(int id,String name,String email,int pin){
        try {
            String sql="select * from createacount where id ='"+id+"' and name='"+name+"' and email ='"+email+"' PIN ='"+pin+"'";
            rs=st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_MODEL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    
}
    
    
    
    
    
    public static void main(String []args){
        DB_MODEL db = new DB_MODEL();
    
    }
    
}
