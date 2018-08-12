/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 * @author André Luiz Alves
 * @since 28/06/2018 - 15:22
 * @version 1.0 beta
 */
public class ProdutoDAO {

    public void cadastrarProduto(ProdutoVO p) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "";
            
            sql = "insert into produto(idproduto, nome, valorcusto, quantidade)"
                    + "values(null, '" + p.getNome() + "', " + p.getValorCusto() + ", " + p.getQuantidade() + ")";
            stat.execute(sql);

        } catch (Exception e) {
            throw new SQLException("ERRO AO CADASTRAR! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}//fecha classe
