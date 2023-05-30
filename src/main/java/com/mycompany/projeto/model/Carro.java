/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.model;

/**
 *
 * @author beatriz.miranda
 */
public class Carro {
    private int ano;
    private String modelo;
    private String proprietario;
    private String placa;
    
    public Carro(){
        
    }
    
    public Carro (int ano, String modelo, String proprietario, String placa){
        this.ano = ano;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
     public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
      
     public String getProprietario(){
        return proprietario;
    }
    
    public void setProprietário(String Proprietario){
        this.proprietario = proprietario;
    }
    
     public String getPlaca(){
        return placa;
    }
     
    
    public void setPlaca(String Placa){
        this.placa = placa;
    }
    
}
