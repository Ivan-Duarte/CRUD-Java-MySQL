/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Itens;

/**
 *
 * @author PICHAU
 */
public class ItensDAO {
    
    private Connection con = null;
    
    public ItensDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Itens item){
        String sql = "INSERT INTO item(nome_Item, descricao_Item, categoria_Item, especificacao_Item) VALUES (?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, item.getNome_Item());
            stmt.setString(2, item.getDescricao_Item());
            stmt.setString(3, item.getCategoria_Item());
            stmt.setString(4, item.getEspecificacao_Item());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public boolean updateItens(Itens objItem) {
        String sql = "UPDATE item SET nome_Item = ?, descricao_Item = ?, categoria_Item = ?, especificacao_Item = ?WHERE id_Item = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, objItem.getNome_Item());
            stmt.setString(2, objItem.getDescricao_Item());
            stmt.setString(3, objItem.getCategoria_Item());
            stmt.setString(4, objItem.getEspecificacao_Item());
            stmt.setInt(5, objItem.getId_Item());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
    }
}
