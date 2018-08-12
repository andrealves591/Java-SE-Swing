/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.EnderecoVO;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 15h04
 * @version 1.0 meta charset
 */
public class EnderecoDAO {

    public long cadastrarEndereco(EnderecoVO eVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into endereco(idendereco, rua, numero, bairro, cidade, estado)"
                    + "values(null,'" + eVO.getRua() + "'," + eVO.getNumero() + ", '"+eVO.getBairro()+"', '"+eVO.getCidade()+"','"+eVO.getEstado()+"')";

            stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stat.getGeneratedKeys();
            long chaveGerada = 0;

            if (rs != null && rs.next()) {
                chaveGerada = rs.getLong(1);
            }

            return chaveGerada;

        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar o Endereço no Banco de Dados! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
}