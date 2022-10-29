package agence;

import java.sql.*;  
class DataBase{  
//public static void main(String args[]){
   private  Connection con;
    
    public  Connection getConnection(){
        try{  
    Class.forName("com.mysql.jdbc.Driver");  
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agence","root","");  
     }  catch(Exception e){ System.out.println("error "+e);}  
  
    return con;
    }
}
   
//}  
 