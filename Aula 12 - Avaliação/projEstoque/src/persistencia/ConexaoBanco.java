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
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class ConexaoBanco {
    private static String URL = "jdbc:mysql://localhost:3307/vonpar";
    private static String USUARIO = "root";
    private static String SENHA = "root";
    
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