/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author ander
 */
public class TaskController {
    
    public void save(Task task){
    
    }
    
    public void update(Task task){
        
    }
    
    public void removeById(int taskId) throws SQLException{
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PrepareStatement statement = null;
        
        try {
            
            
            conn = ConnectionFactory.getConnection();
            statement = (PrepareStatement) conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
            
        }catch(SQLException e){
            throw new SQLException("Error on delete task");
            
        } finally {
            
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) conn);
        }
        
    }
    
    public List<Task> getAll(int idProject){
        
        return null;
        
    }
}
