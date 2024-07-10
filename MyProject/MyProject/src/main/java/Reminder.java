
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;




public class Reminder {
    public void remind(){
        Date getDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(getDate);
        
        try{
            
            // connection to db
            Connection con = DriverManager.getConnection("jdbc:mysql://"
                    + "localhost:3306/task management","root","");
            
            
            String query = "SELECT * FROM new_task where Due_Date =? AND completed=? and user_id = ?"; // query
            PreparedStatement ps = con.prepareStatement(query); 
            ps.setString(1, today);
            ps.setString(2, "0");
            ps.setString(3, Loginform.id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                String task = rs.getString("Task_Name");
                JOptionPane.showMessageDialog(null, "The Task " + task +" has not completed yet!");
            }
            
                    
        }catch(Exception e){
            System.out.println("Error in Class Reminder, Function remind");
            System.out.println(e.getMessage());
        }
    }
}
