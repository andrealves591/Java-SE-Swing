/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 * @author André Luiz Alves
 * @since 01/07/2018 - 10h07
 * @version 3.0 BERG
 */
public class ServicosFactory {
    private static final ClienteServicos CS = new ClienteServicos();
    
    public static ClienteServicos getClienteServicos(){
        return CS;
    }
}