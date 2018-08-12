/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.VeiculoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.VeiculoVO;

/**
 * @author André Luiz Alves & Eduardo Gautier
 * @since 06/07/2018 - 15h43
 * @version 1.0 meta charset
 */
public class VeiculoServicos {
    public void cadastrarVeiculo(VeiculoVO vVO)throws SQLException{
        VeiculoDAO vDAO = DAOFactory.getVeiculoDAO();
        vDAO.cadastrarVeiculo(vVO);
    }
    
    public ArrayList<VeiculoVO> buscarVeiculo()throws SQLException{
        VeiculoDAO vDAO = DAOFactory.getVeiculoDAO();
        return vDAO.buscarVeiculos();
    }
    
    public void deletarVeiculo(long idVeiculo) throws SQLException{
        VeiculoDAO vDAO =  DAOFactory.getVeiculoDAO();
        vDAO.deletarVeiculo(idVeiculo);
    }
    
    public ArrayList<VeiculoVO> filtrar(String query) throws SQLException{
        VeiculoDAO pDAO = DAOFactory.getVeiculoDAO();
        return pDAO.filtrarVeiculos(query);
    }
    
    public void alterarVeiculo(VeiculoVO vVO) throws SQLException {
        VeiculoDAO pDAO = DAOFactory.getVeiculoDAO();
        pDAO.alterarVeiculo(vVO);
    }
}