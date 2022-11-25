/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author PICHAU
 */
public class Itens {
    
    private int id_Item;
    private String nome_Item;
    private String descricao_Item;
    private String especificacao_Item;
    private String categoria_Item;

    public Itens() {
    }

    public Itens(int id_Item, String nome_Item, String descricao_Item, String especificacao_Item, String categoria_Item) {
        this.id_Item = id_Item;
        this.nome_Item = nome_Item;
        this.descricao_Item = descricao_Item;
        this.especificacao_Item = especificacao_Item;
        this.categoria_Item = categoria_Item;
    }

    public int getId_Item() {
        return id_Item;
    }

    public void setId_Item(int id_Item) {
        this.id_Item = id_Item;
    }

    public String getNome_Item() {
        return nome_Item;
    }

    public void setNome_Item(String nome_Item) {
        this.nome_Item = nome_Item;
    }

    public String getDescricao_Item() {
        return descricao_Item;
    }

    public void setDescricao_Item(String descricao_Item) {
        this.descricao_Item = descricao_Item;
    }

    public String getEspecificacao_Item() {
        return especificacao_Item;
    }

    public void setEspecificacao_Item(String especificacao_Item) {
        this.especificacao_Item = especificacao_Item;
    }

    public String getCategoria_Item() {
        return categoria_Item;
    }

    public void setCategoria_Item(String categoria_Item) {
        this.categoria_Item = categoria_Item;
    }  
}
