/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PICHAU
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdsiscofis";
    private static final String USER = "root";
    private static final String PASS = "senhabanco";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao", ex);
        }     
    }
    
    public static void closeConnection(Connection con){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro !"+ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro !"+ex);
            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro !"+ex);
            }
        }
        closeConnection(con, stmt);
    }
}
