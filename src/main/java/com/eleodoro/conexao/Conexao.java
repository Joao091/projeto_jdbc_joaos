package com.eleodoro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String user = "root";
    private static final String password = "";

    private static Connection conn;

    public static Connection getConexao() {

        try {
            if(conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado com sucesso!");
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStracktrece();
            System.out.println("Erro de conexão");
            return null;
        }
    }
}
