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
import modelo.VeiculoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 14h07
 * @version 1.0 meta charset
 */
public class VeiculoDAO {
    
    public void cadastrarVeiculo(VeiculoVO vVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "insert into veiculo(idveiculo, nome, marca, ano, modelo, combustivel, valorcusto, cor, portas, arcondicionado, direcaohidraulica, airbag)"
                    + "values(null, '"+vVO.getNome()+"', '"+vVO.getMarca()+"', "+vVO.getAno()+", "+vVO.getModelo()+", '"+vVO.getCombustivel()+"', "+vVO.getValorCusto()+", '"+vVO.getCor()+"',  '"+vVO.getPortas()+"','"+vVO.getComplementos().get(0)+"','"+vVO.getComplementos().get(1)+"','"+vVO.getComplementos().get(2)+"')";
            
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar no banco!" + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public ArrayList<VeiculoVO> buscarVeiculos() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        
        try {
            String sql = "select * from veiculo";

            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<VeiculoVO> carro = new ArrayList<>();
            while (rs.next()) {
                VeiculoVO v = new VeiculoVO();
                
                v.setIdVeiculo(rs.getLong("idveiculo"));
                v.setNome(rs.getString("nome"));
                v.setMarca(rs.getString("marca"));
                v.setAno(rs.getInt("ano"));
                v.setModelo(rs.getInt("modelo"));
                v.setCombustivel(rs.getString("combustivel"));
                v.setValorCusto(rs.getDouble("valorcusto"));
                v.setCor(rs.getString("cor"));
                v.setPortas(rs.getString("portas"));
                
                ArrayList<String> complementos = new ArrayList<>();
                
                complementos.add(rs.getString("arcondicionado"));
                complementos.add(rs.getString("direcaohidraulica"));
                complementos.add(rs.getString("airbag"));
                v.setComplementos(complementos);
                carro.add(v);
           }
            return carro;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar veículo!" + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    
    public void deletarVeiculo(long idVeiculo) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "delete from veiculo where idveiculo=" + idVeiculo;
            
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar produto! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public ArrayList<VeiculoVO> filtrarVeiculos(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from veiculo " + query;
            
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<VeiculoVO> carro = new ArrayList<>();
            while (rs.next()) {
                VeiculoVO v = new VeiculoVO();
                
                v.setIdVeiculo(rs.getLong("idveiculo"));
                v.setNome(rs.getString("nome"));
                v.setMarca(rs.getString("marca"));
                v.setAno(rs.getInt("ano"));
                v.setModelo(rs.getInt("modelo"));
                v.setCombustivel(rs.getString("combustivel"));
                v.setValorCusto(rs.getDouble("valorcusto"));
                v.setCor(rs.getString("cor"));
                v.setPortas(rs.getString("portas"));
                
                ArrayList<String> complementos = new ArrayList<>();
                
                complementos.add(rs.getString("arcondicionado"));
                complementos.add(rs.getString("direcaohidraulica"));
                complementos.add(rs.getString("airbag"));
                v.setComplementos(complementos);
                carro.add(v);
           }
            return carro;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void alterarVeiculo(VeiculoVO vVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql;

            sql = "update veiculo set "
                    + "nome=?, marca=?, ano=?, modelo=?, combustivel=?, portas=?, cor=?, valorcusto=?, arcondicionado=?, direcaohidraulica=?, airbag=?  "
                    + "where idveiculo=?";

            pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, vVO.getNome());
            pstmt.setString(2, vVO.getMarca());
            pstmt.setInt(3, vVO.getAno());
            pstmt.setInt(4, vVO.getModelo());
            pstmt.setString(5, vVO.getCombustivel());
            pstmt.setString(6, vVO.getPortas());
            pstmt.setString(7, vVO.getCor());
            pstmt.setDouble(8, vVO.getValorCusto());
            pstmt.setString(9, vVO.getComplementos().get(0));
            pstmt.setString(10, vVO.getComplementos().get(1));
            pstmt.setString(11, vVO.getComplementos().get(2));
            pstmt.setLong(12, vVO.getIdVeiculo());
            pstmt.executeUpdate();

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar veículo! " + se.getMessage());
        } finally {
            con.close();
            pstmt.close();
        }
    }
}