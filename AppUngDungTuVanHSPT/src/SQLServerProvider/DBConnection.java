/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLServerProvider;

import GUI.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DBConnection {

    
    
    
    public static Connection getConnection(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            try {
                //kêt nối tới SQL
                return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TRAINING_BAYES;user=sa;password=sa2012");
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("lỗi");
        }
        
        return null;
    }
    
    public static void close(){
        try {
            getConnection().close();
        } catch (Exception e) {
        }
    }
    
}
