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
 * @author André Luiz Alves
 * @since 01/07/2018 - 09H48
 * @version 3.0 BERG
 */
public class ConexaoBanco {
    //private static String URL = "jdbc:mysql://localhost:3307/listadeclientes";
    private static String URL = "jdbc:mysql://localhost:3306/listadeclientes";
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
