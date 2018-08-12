/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * @author André Luiz Alves
 * @since 01/07/2018 - 10H00
 * @version 3.0 BERG
 */
public class DAOFactory {
    private static final ClienteDAO CDAO = new ClienteDAO();
    
    public static ClienteDAO getClienteDAO(){
        return CDAO;
    }
}