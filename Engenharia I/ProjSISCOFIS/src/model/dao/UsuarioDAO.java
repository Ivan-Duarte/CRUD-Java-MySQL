/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author PICHAU
 */
public class UsuarioDAO {

    private Connection con = null;

    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }
    public boolean save(Usuario usuario){
        String sql = "INSERT INTO usu(nome_Usu, senha_Usu, tipo_Usu) VALUES (?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome_Usu());
            stmt.setString(2, usuario.getSenha_Usu());
            stmt.setString(3, usuario.getTipo_Usu());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public boolean updateUsu(Usuario objUsuario) {
        String sql = "UPDATE usu SET nome_Usu = ?, senha_Usu = ?, tipo_Usu = ? WHERE id_Usu = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, objUsuario.getNome_Usu());
            stmt.setString(2, objUsuario.getSenha_Usu());
            stmt.setString(3, objUsuario.getTipo_Usu());
            stmt.setInt(4, objUsuario.getId_Usu());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
    }
    public ResultSet autenticacaoUsuario(Usuario objUsuario) {

        try {
            String sql = "SELECT * FROM usu WHERE nome_Usu = (?) and senha_Usu = (?) and tipo_Usu = (?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuario.getNome_Usu());
            pstm.setString(2, objUsuario.getSenha_Usu());
            pstm.setString(3, objUsuario.getTipo_Usu());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: "+ erro);
            return null;
        }
    }
}
