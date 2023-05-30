/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.model;

/**
 *
 * @author beatriz.miranda
 */
public class Vaga {
    private String nome;
    private String local;
    
    
    public Vaga(){
        
    }
    
    public Vaga( String nome, String Local){
        this.nome = nome;
        this.local = local;
    }
    
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getLocal(){
        return local;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
}
