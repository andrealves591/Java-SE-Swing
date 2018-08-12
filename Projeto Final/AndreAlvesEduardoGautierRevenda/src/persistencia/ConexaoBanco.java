/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author André Luiz Alves & Eduardo Gautier
 * @since 06/07/2018 - 14h04
 * @version 1.0 meta charset
 */
public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3307/revenda";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    public static Connection getConexao() throws SQLException{
        Connection c = null;
        
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar!" +  se.getMessage());
        }
        
        return c;
    }
}