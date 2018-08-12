/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.SeriadoVO;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class SeriadoDAO {

    //Método cadastrar
    /**
     * @author Thiago Cury
     * @since 25/04/2014
     * @version 1.0
     */
    public void cadastrarSeriado(SeriadoVO sVO) throws SQLException {
        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            sql = "insert into seriado(idseriado, nome, temporada)"
                    + "values(null,'" + sVO.getNome() + "','" + sVO.getTemporada() + "')";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir dados no Banco de Dados " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//efcha método

    //Método buscar
    /**
     * @author Thiago Cury
     * @since 25/04/2014
     * @version 1.0
     */
    public ArrayList<SeriadoVO> buscarSeriados() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from seriado";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<SeriadoVO> seriados = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                SeriadoVO sVO = new SeriadoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                sVO.setIdSeriado(rs.getLong("idseriado"));
                sVO.setNome(rs.getString("nome"));
                sVO.setTemporada(rs.getString("temporada"));
                seriados.add(sVO);
            }//Fecha while

            //Retornando o ArrayList com todos objetos
            return seriados;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método

}//fecha classe
