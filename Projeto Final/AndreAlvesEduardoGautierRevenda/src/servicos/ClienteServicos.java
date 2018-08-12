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
 * @author André Luiz Alves & Eduardo Gautier
 * @since 06/07/2018 - 15h33
 * @version 1.0 meta charset
 */
public class ClienteServicos {
    public void cadastrarCliente(ClienteVO cVO) throws SQLException{
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarCliente(cVO);
    }
    
    public ArrayList<ClienteVO> buscarCliente()throws SQLException{
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.buscarCliente();
    }
    public ArrayList<ClienteVO> filtrar(String query) throws SQLException {
        ClienteDAO pDAO = DAOFactory.getClienteDAO();
        return pDAO.filtrar(query);
    }
    public void deletarCliente(long idCliente) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarCliente(idCliente);
    }
    
     public void alterarCliente(ClienteVO cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.alterarCliente(cVO);
    }
}
