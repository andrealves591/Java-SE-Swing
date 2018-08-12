/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class ServicosFactory {
    private static final VonparServicos VS = new VonparServicos();
    
    public static VonparServicos getVonparServicos(){
        return VS;
    }
}
