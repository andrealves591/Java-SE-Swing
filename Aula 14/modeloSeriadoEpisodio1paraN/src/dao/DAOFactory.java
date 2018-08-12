/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class DAOFactory {
    
    private static final SeriadoDAO seriadoDAO = new SeriadoDAO();
    private static final EpisodioDAO episodioDAO = new EpisodioDAO();

    public static SeriadoDAO getSeriadoDAO(){
        return seriadoDAO;
    }
    
    public static EpisodioDAO getEpisodioDAO(){
        return episodioDAO;
    }
    
    
}//fecha classe
