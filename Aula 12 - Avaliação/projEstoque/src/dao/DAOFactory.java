/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class DAOFactory {
    private static final VonparDAO VDAO = new VonparDAO();
    
    public static VonparDAO getClienteDAO(){
        return VDAO;
    }
}
