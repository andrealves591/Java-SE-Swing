/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.SeriadoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.SeriadoVO;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class SeriadoServicos {

    //Metodo cadastrar
    public void cadastrarSeriado(SeriadoVO sVO) throws SQLException {
        SeriadoDAO sDAO = DAOFactory.getSeriadoDAO();
        sDAO.cadastrarSeriado(sVO);
    }//fecha método

    //Método buscar
    public ArrayList<SeriadoVO> buscarSeriados() throws SQLException {
        SeriadoDAO sDAO = DAOFactory.getSeriadoDAO();
        return sDAO.buscarSeriados();
    }//fecha método
    
}//fecha classe
