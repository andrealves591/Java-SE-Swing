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
import modelo.ClienteVO;
import persistencia.ConexaoBanco;

/**
 * @author André Luiz Alves
 * @since 01/07/2018 - 09H45
 * @version 3.0 BERG
 */
public class ClienteDAO {

    public void cadastrarCliente(ClienteVO c) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into clientes(idcliente, nome, sexo, possuicartao, qtdcartoes, qualcartao1, qualcartao2, qualcartao3, qualcartao4, qualcartao5, qualcartao6, qualconta1, qualconta2, qualconta3, qualconta4)"
                    + "values(null, '" + c.getNome() + "', '" + c.getSexo() + "', '" + c.getPossuiCartao() + "', " + c.getQtdCartoes() + ", '" + c.getQualCartao().get(0) + "', '" + c.getQualCartao().get(1) + "', '" + c.getQualCartao().get(2) + "', '" + c.getQualCartao().get(3) + "', '" + c.getQualCartao().get(4) + "', '" + c.getQualCartao().get(5) + "', '" + c.getQualConta().get(0) + "', '" + c.getQualConta().get(1) + "', '" + c.getQualConta().get(2) + "', '" + c.getQualConta().get(3) + "')";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao Cadastar no banco!" + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public ArrayList<ClienteVO> buscarClientes() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "select * from clientes";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<ClienteVO> clien = new ArrayList<>();
            while (rs.next()) {
                ClienteVO c = new ClienteVO();

                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setSexo(rs.getString("sexo"));
                c.setPossuiCartao(rs.getString("possuicartao"));
                c.setQtdCartoes(rs.getInt("qtdcartoes"));

                ArrayList<String> cartoes = new ArrayList<>();
                cartoes.add(rs.getString("qualcartao1"));
                cartoes.add(rs.getString("qualcartao2"));
                cartoes.add(rs.getString("qualcartao3"));
                cartoes.add(rs.getString("qualcartao4"));
                cartoes.add(rs.getString("qualcartao5"));
                cartoes.add(rs.getString("qualcartao6"));
                c.setQualCartao(cartoes);

                ArrayList<String> contas = new ArrayList<>();

                contas.add(rs.getString("qualconta1"));
                contas.add(rs.getString("qualconta2"));
                contas.add(rs.getString("qualconta3"));
                contas.add(rs.getString("qualconta4"));
                c.setQualConta(contas);
                clien.add(c);

            }

            return clien;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar cliente!" + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}//fecha classe