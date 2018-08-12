/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ClienteVO;
import modelo.EnderecoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 14h38
 * @version 1.0 meta charset
 */
public class ClienteDAO {

    public void cadastrarCliente(ClienteVO cVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            EnderecoDAO eDAO = new EnderecoDAO();
            long chaveGerada = eDAO.cadastrarEndereco(cVO.getEndereco());

            sql = "insert into cliente(idcliente, nome , cpf, sexo, idade, idendereco)"
                    + "values(null, '" + cVO.getNome() + "'," + cVO.getCpf() + ",'" + cVO.getSexo() + "', " + cVO.getIdade() + "," + chaveGerada + ")";
            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao Cadastrar o Cliente!" + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public ArrayList<ClienteVO> buscarCliente() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "select idcliente, nome, cpf, sexo, idade, e.idendereco, rua, numero, bairro, cidade, estado "
                    + "from cliente as c, endereco as e "
                    + "where c.idendereco = e.idendereco";
            ArrayList<ClienteVO> cliente = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                ClienteVO c = new ClienteVO();

                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getLong("cpf"));
                c.setSexo(rs.getString("sexo"));
                c.setIdade(rs.getByte("idade"));

                EnderecoVO e = new EnderecoVO();

                e.setIdEndereco(rs.getLong("idendereco"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getInt("numero"));
                e.setBairro(rs.getString("bairro"));
                e.setCidade(rs.getString("cidade"));
                e.setEstado(rs.getString("estado"));

                c.setEndereco(e);
                cliente.add(c);
            }
            return cliente;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar pessoa no banco de dados! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public ArrayList<ClienteVO> filtrar(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "select idcliente, nome, cpf, sexo, idade, e.idendereco, rua, numero, bairro, cidade, estado "
                    + "from cliente as c inner join endereco as e on c.idendereco = e.idendereco " + query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<ClienteVO> cli = new ArrayList<>();

            while (rs.next()) {
                ClienteVO c = new ClienteVO();

                c.setIdCliente(rs.getLong("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getLong("cpf"));
                c.setSexo(rs.getString("sexo"));
                c.setIdade(rs.getByte("idade"));

                EnderecoVO e = new EnderecoVO();

                e.setIdEndereco(rs.getLong("idendereco"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getInt("numero"));
                e.setBairro(rs.getString("bairro"));
                e.setCidade(rs.getString("cidade"));
                e.setEstado(rs.getString("estado"));

                c.setEndereco(e);
                cli.add(c);
            }
            return cli;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }
    
    public  void deletarCliente(long idCliente) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
             sql = "delete from endereco where idendereco = " + idCliente;
             stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar produto! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void alterarCliente(ClienteVO cVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql;

            sql = "update cliente as c, endereco as e set "
                    + "rua=?, numero=?, bairro=?, cidade=?, estado=?, nome=?, cpf=?, sexo=?, idade=? "
                    + "where c.idendereco = e.idendereco and idcliente=?";

            pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, cVO.getEndereco().getRua());
            pstmt.setInt(2, cVO.getEndereco().getNumero());
            pstmt.setString(3, cVO.getEndereco().getBairro());
            pstmt.setString(4, cVO.getEndereco().getCidade());
            pstmt.setString(5, cVO.getEndereco().getEstado());
            pstmt.setString(6, cVO.getNome());
            pstmt.setLong(7, cVO.getCpf());
            pstmt.setString(8, cVO.getSexo());
            pstmt.setByte(9, cVO.getIdade());
            pstmt.setLong(10, cVO.getIdCliente());
            
            pstmt.executeUpdate();

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar dados do cliente! " + se.getMessage());
        } finally {
            con.close();
            pstmt.close();
        }
    }
}