package cmsprojectwithc;
import java.sql.*;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Model_CMS {
 
    Connection con;
    Statement st;
    ResultSet rs;
    
    DB_Model_CMS(){
    
    
        try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CMS_SMIU_DB_2", "root","");
          st=con.createStatement();
          System.out.println("DB is Connected");
       
        }catch(Exception e){
         System.out.println(e);
        }
    }


public int AddTeacher(int id,String name,String department, String email){
    int status=0;
        try {
            String sql="insert into teacher values('"+id+"','"+name+"','"+department+"','"+email+"')";
            status=st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        
        }
        return status;
    
    
    

   }
public ResultSet LoginTeacher(int id,String user){
        try {
            String sql="select * from teacher where T_ID='"+id+"' and T_Name='"+user+"'";
            rs=st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    
}

public ResultSet TeacherProfile(int id){
        try {
            String sql="select * from teacher where T_ID='"+id+"'";
            rs=st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    
}
   
public ResultSet findRecords(String searchdata){

        try {
            String sql="select * from teacher where T_ID='"+searchdata+"' or T_Name='"+searchdata+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
   
}


public int RemoveRecordBYID(String id){
int s=0;
        try {
            String sql="delete from teacher where T_ID="+id;
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
     return s;

}


public int updateTeacherRecord(String id, String name, String email, String department){
      int s=0;   
    try {
          
            String sql="update teacher set T_Name='"+name+"',T_Department='"+department+"',T_Email='"+email+"' where T_ID='"+id+"'";
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
}


public ResultSet getRecordByID(String id){
 
    
        try {
            String sql="select * from teacher where T_ID="+Integer.parseInt(id);
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
      

}

public ResultSet getTeacherRecods(){

  String sql="select * from teacher";
  try{
  rs=st.executeQuery(sql);
  }catch(Exception e){
  
  System.out.println(e);
  }
  
  return rs;

}


public ResultSet searchTeacherByID  (String id){

        try {
            String sql="select * from teacher where T_ID='"+id+"' OR T_Name='"+id+"' OR T_Email='"+id+"'";
            System.out.println(sql);
            rs=st.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
     
return rs;
}


public ResultSet searchTeacher(String id){

        try {
            String sql="select * from teacher where T_ID like '"+id+"%' or T_Name like '"+id+"%'";
            
            System.out.println(sql);
            rs=st.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model_CMS.class.getName()).log(Level.SEVERE, null, ex);
        }
     
return rs;
}





    
      
public static void main(String []args){

    DB_Model_CMS db=new DB_Model_CMS();
    
}


}
