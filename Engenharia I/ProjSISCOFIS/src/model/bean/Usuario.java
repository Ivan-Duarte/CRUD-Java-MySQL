/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author PICHAU
 */
public class Usuario {
    
    private int id_Usu;
    private String nome_Usu;
    private String senha_Usu;
    private String tipo_Usu;

    public Usuario() {
    }

    public Usuario(int id_Usu, String nome_Usu, String senha_Usu, String tipo_Usu) {
        this.id_Usu = id_Usu;
        this.nome_Usu = nome_Usu;
        this.senha_Usu = senha_Usu;
        this.tipo_Usu = tipo_Usu;
    }

    public int getId_Usu() {
        return id_Usu;
    }

    public void setId_Usu(int id_Usu) {
        this.id_Usu = id_Usu;
    }

    public String getNome_Usu() {
        return nome_Usu;
    }

    public void setNome_Usu(String nome_Usu) {
        this.nome_Usu = nome_Usu;
    }

    public String getSenha_Usu() {
        return senha_Usu;
    }

    public void setSenha_Usu(String senha_Usu) {
        this.senha_Usu = senha_Usu;
    }

    public String getTipo_Usu() {
        return tipo_Usu;
    }

    public void setTipo_Usu(String tipo_Usu) {
        this.tipo_Usu = tipo_Usu;
    }
}
