/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */

import java.sql.DriverManager;
import java.sql.*;




public class DBConnection{
     private Connection c;
     private Statement s;
     private ResultSet rs;
     
     
     public DBConnection(){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
           s= c.createStatement();
         } catch (ClassNotFoundException | SQLException e) {
             System.out.println(e);
         
         }}
     public String generateid(){
          String myid="";
String sql="SELECT ID FROM customer ORDER BY ID DESC LIMIT 1"; 
try{
    
ResultSet rs= s.executeQuery(sql);
if(rs.next()){
 myid= rs.getString("ID");
}
System.out.println(rs);
}catch(Exception e){
    System.out.println(e);
    
}return myid;}
     public String flightid(){
          String id="";
String sql="SELECT Flight_id FROM tickets ORDER BY ID DESC LIMIT 1"; 
try{
    
ResultSet rs= s.executeQuery(sql);
if(rs.next()){
 id= rs.getString("Flight_id");
}
System.out.println(rs);
}catch(Exception e){
    System.out.println(e);
    
}return id;}
     
}


     
  
   
   
   
   
   
   
   



         
    
