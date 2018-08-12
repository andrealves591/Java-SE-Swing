/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.VonparVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class VonparDAO {

    public void cadastarProduto(VonparVO v) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into produtos(idproduto, nome , tipodebebida, quantidade, litrosgarrafa, garrafaretornavel, preco)"
                    + "values (null,'" + v.getNome() + "','" + v.getTipoDeBebida() + "'," + v.getQuantidade() + "," + v.getLitrosGarrafa() + ",'" + v.getGarrafaRetornavel() + "'," + v.getPreco() + ")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Cadastrar No Banco!" + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }

    public ArrayList<VonparVO> buscarProduto() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {

            String sql = "select * from produtos";
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<VonparVO> vonp = new ArrayList<>();
            while (rs.next()) {
                VonparVO v = new VonparVO();
                v.setIdproduto(rs.getLong("idproduto"));
                v.setNome(rs.getString("nome"));
                v.setTipoDeBebida(rs.getString("tipodebebida"));
                v.setQuantidade(rs.getInt("quantidade"));
                v.setLitrosGarrafa(rs.getDouble("litrosgarrafa"));
                v.setGarrafaRetornavel(rs.getString("garrafaretornavel"));
                v.setPreco(rs.getDouble("preco"));
                vonp.add(v);
            }
            return vonp;
        } catch (SQLException se) {
            throw new SQLException("Erro Ao Buscar Produto! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }
}
