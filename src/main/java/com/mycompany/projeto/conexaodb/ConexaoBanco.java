/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projeto.conexaodb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author beatriz.miranda
 */
public class ConexaoBanco {
     //Conexão com o Banco de Dados
    private final String url = "jdbc:postgresql://localhost/projeto";
    private final String user = "postgres";
    private final String password = "senac23";
    
    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ConexaoBanco app = new ConexaoBanco();
        app.open();
    }
    
        public Connection open() {
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Parabéns conectado com sucesso");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    public void close() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public void inserir(String tabela, String valores) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto statement (stmt)
            stmt = conn.createStatement();
    // Executando uma instrução SQL.
            stmt.executeUpdate(
                    "INSERT INTO "+ tabela+" VALUES "+valores+"");
    // Fechando a conexão com o banco
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }
        public ResultSet buscarDados(String tabela) {
        try {
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+tabela+"");
            return rs;
        } catch (SQLException e) {
            close();
            e.printStackTrace();
        }
        return null;
    }
    
        public void alterar(String tabela, String valores) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto preparedStatement (pstmt)
            pstmt = conn.prepareStatement(
                    "UPDATE "+ tabela+" SET "+valores+"");
    // Setando o valor ao parâmetro
            //pstmt.setString(1, "MARIA");
            //pstmt.setInt(2, 1);            
    // Fechando a conexão com o banco
            pstmt.execute();
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }

    public void excluir(String tabela, String condicao) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto preparedStatement (pstmt)
            pstmt = conn.prepareStatement(
                    "DELETE FROM "+tabela+ " " +condicao);   
            pstmt.execute();
    // Fechando a conexão com o banco
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            e.printStackTrace();
        }
    }    
}
