/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ClienteVO;

/**
 * @author André Luiz Alves
 * @since 01/07/2018 - 10H05
 * @version 3.0 BERG
 */
public class ClienteServicos {
    public  void cadastrarCliente (ClienteVO c) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarCliente(c);
    }
    
    public ArrayList<ClienteVO> buscarClientes() throws SQLException{
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarClientes();
    }
}