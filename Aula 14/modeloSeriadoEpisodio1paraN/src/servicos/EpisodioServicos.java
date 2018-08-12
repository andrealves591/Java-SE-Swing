/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.EpisodioDAO;
import java.sql.SQLException;
import modelo.EpisodioVO;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class EpisodioServicos {
    
    public void cadastrarEpisodio(EpisodioVO eVO) throws SQLException{
        EpisodioDAO eDAO = DAOFactory.getEpisodioDAO();
        eDAO.cadastrarEpisodio(eVO);
    }//fecha método
    
  }//fecha classe
