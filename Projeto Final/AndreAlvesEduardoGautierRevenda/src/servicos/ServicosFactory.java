/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 * @author André Luiz Alves & Eduardo Gautier
 * @since 06/07/2018 - 15h45
 * @version 1.0 meta charset
 */
public class ServicosFactory {
    private static final ClienteServicos CS = new ClienteServicos();
    private static final VeiculoServicos VS = new VeiculoServicos();

    public static ClienteServicos getClienteServicos() {
        return CS;
    }
    
    public static VeiculoServicos getVeiculosServicos() {
        return VS;
    }
}
