/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ConexaoDAO {

    public static Connection conector(){
    
        Connection conexao = null;
        
        try {
            
        //------------- se você quiser testar, coloque seu URL do Mysql aqui ----------------//
            
        
        
        var url = "jdbc:mysql://127.0.0.1:3306/usuariosbd?user=root&password=ganhar";
        
       
        
        //-----------------------------------------------------------------------------------//
        
        
        conexao = DriverManager.getConnection(url);
        } 
           
        
        
        catch (SQLException e) {
            
            JOptionPane.showInternalMessageDialog(null, e.getMessage());
        }
        
        return conexao;  
    }
}
    

