/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.EpisodioVO;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class EpisodioDAO {

    public void cadastrarEpisodio(EpisodioVO eVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;

            /* Nesse insert note que vamos buscar a coluna idseriado (chave estrangeira) 
               a partir do objeto eVo.getSeriaod().getIdSeriado() */
            sql = "insert into episodio(idepisodio, nome, duracao, idseriado)"
                    + "values(null, '" + eVO.getNome() + "', " + eVO.getDuracao() + ", " + eVO.getSeriado().getIdSeriado() + ")";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar episódio! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método cadastrarEpisodio
}//fecha classe
