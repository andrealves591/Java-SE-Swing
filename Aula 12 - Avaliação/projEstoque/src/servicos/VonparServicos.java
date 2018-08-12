/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.VonparDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.VonparVO;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class VonparServicos {
    public  void cadastrarProduto (VonparVO v) throws SQLException {
        VonparDAO vDAO = DAOFactory.getClienteDAO();
        vDAO.cadastarProduto(v);
    }
    
    public ArrayList<VonparVO> buscarProduto() throws SQLException{
        VonparDAO vDAO = DAOFactory.getClienteDAO();
        return vDAO.buscarProduto();
    }
}
