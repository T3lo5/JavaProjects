/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ander
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConnection() {
       try {
           Class.forName(DRIVER);
           return (Connection) DriverManager.getConnection(URL, USER, PASS);
       } catch (Exception ex) {
           throw new RuntimeException("Datavase connection error", ex);
       }
    }
    
    public static void closeConnection (Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Databse close connection error", ex);
        }
    }
    
    
}
