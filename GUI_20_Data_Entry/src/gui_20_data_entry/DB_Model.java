package gui_20_data_entry;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DB_Model {
Connection con;
Statement st;
ResultSet rs;

DB_Model()
{
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Entry","root","");
    st=con.createStatement();
        System.out.println("GET Connection");
    }catch(Exception e)
    {
        System.out.println(e);
    }
}

//DATA_INSERT///////////////////////////////////////////////////////////////////
public int Add(String name,String pn,String cnic,String gender,String edu)
{
    int show=0;
    try
    {
        String sql="insert into data values('"+name+"','"+pn+"','"+cnic+"','"+gender+"','"+edu+"')";
        show=st.executeUpdate(sql);
        System.out.println(show);
    }catch(Exception e)
    {
        System.out.println(e);
    }
    return show;
}
//Table View////////////////////////////////////////////////////////////////////
public ResultSet tableview()
{
    try
    {
        String sql="select *from data";
        rs=st.executeQuery(sql);
        System.out.println(rs);
    }catch(Exception e)
    {
        System.out.println(e);
    }
    return rs;
}

//Search Table//////////////////////////////////////////////////////////////////
public ResultSet searchfield(String cnic)
{
    try
    {
        String sql="select *from data where Name='"+cnic+"' or CNIC='"+cnic+"'";
        rs=st.executeQuery(sql);
        System.out.println(rs);
    }catch(Exception e)
    {
        System.out.println(e);
    }
    return rs;
}

//Delete Data///////////////////////////////////////////////////////////////////
public int deletedata(String cnic)
{
    int show=0;
   try
   {
       String sql="delete from data where CNIC='"+cnic+"'";
       show=st.executeUpdate(sql);
       System.out.println(show);
   }catch(Exception e)
   {
       System.out.println(e);
   }
   return show;
}

//Update Data///////////////////////////////////////////////////////////////////
public int Updatedata(String name,String pn,String cnic,String gender,String edu)
{
    int show=0;
    try
    {
        String sql="update data set Name='"+name+"',PN='"+pn+"',Gender='"+gender+"',Education='"+edu+"' where CNIC='"+cnic+"'";
        show=st.executeUpdate(sql);
        System.out.println(show);
    }catch(Exception e)
    {
        System.out.println(e);
    }
    return show;
}
///
public ResultSet getRecordByID(String cnic){
 
    
        try {
            String sql="select * from data where CNIC='"+cnic+"'";
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
}
    public static void main(String args[])
    {
        DB_Model db=new DB_Model();
    }
}
