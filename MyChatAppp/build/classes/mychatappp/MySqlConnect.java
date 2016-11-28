/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychatappp;

import java.sql.*;
import javax.swing.*;



public class MySqlConnect {
    
    Connection conn=null;
    
    public static Connection ConnectBD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","1386313863");
        JOptionPane.showMessageDialog(null,"Connection to data base");
        return conn;
        }  
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      } 
        
    
    
    }

    
}
