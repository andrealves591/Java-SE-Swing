/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author André Luiz Alves
 * @since 29/06/2018 17h00
 * @version 3.0 BERG
 */
public class ClienteVO {
    private long idCliente;
    private String nome;
    private String sexo;
    private String possuiCartao;
    private int qtdCartoes;
    private ArrayList<String> qualCartao;
    private ArrayList<String> qualConta;

    public ClienteVO() {
    }

    /**
     * @param idCliente recebe um id para o cliente
     * @param nome recebe um nome
     * @param sexo recebe um sexo
     * @param possuiCartao recebe a resposta se o cliente possui cartao
     * @param qtdCartoes recebe a quantidade de cartoes
     * @param qualCartao recebe quais cartoes o cliente tem
     * @param qualConta recebe quais contas o cliete possui
     */
    

    public ClienteVO(long idCliente, String nome, String sexo, String possuiCartao, int qtdCartoes, ArrayList<String> qualCartao, ArrayList<String> qualConta) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sexo = sexo;
        this.possuiCartao = possuiCartao;
        this.qtdCartoes = qtdCartoes;
        this.qualCartao = qualCartao;
        this.qualConta = qualConta;
    }
    
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPossuiCartao() {
        return possuiCartao;
    }

    public void setPossuiCartao(String possuiCartao) {
        this.possuiCartao = possuiCartao;
    }

    public int getQtdCartoes() {
        return qtdCartoes;
    }

    public void setQtdCartoes(int qtdCartoes) {
        this.qtdCartoes = qtdCartoes;
    }

    public ArrayList<String> getQualCartao() {
        return qualCartao;
    }

    public void setQualCartao(ArrayList<String> qualCartao) {
        this.qualCartao = qualCartao;
    }
    
    public ArrayList<String> getQualConta() {
        return qualConta;
    }

    public void setQualConta(ArrayList<String> qualConta) {
        this.qualConta = qualConta;
    }
    
    
    @Override
    public String toString() {

        String x = "";

        for (int i = 0; i < qualCartao.size(); i++) {
            x = x + "\n" + qualCartao.get(i);
        }

        String y = "";

        for (int i = 0; i < qualConta.size(); i++) {
            y = y + "\n" + qualConta.get(i);
        }

        if (qualCartao.isEmpty() && qualConta.isEmpty()) {
            return "\nNome: " + nome
                    + "\nSexo: " + sexo
                    + "\nPossui Cartão: " + possuiCartao
                    + "\nQuantidade de Cartões: " + qtdCartoes;
        } else if (qualCartao.isEmpty()) {
            return "\nNome: " + nome
                    + "\nSexo: " + sexo
                    + "\nPossui Cartão: " + possuiCartao
                    + "\nQuantidade de Cartões: " + qtdCartoes
                    + "\n\nQual Conta: " + y;
        } else if (qualConta.isEmpty()) {
            return "\nNome: " + nome
                    + "\nSexo: " + sexo
                    + "\nPossui Cartão: " + possuiCartao
                    + "\nQuantidade de Cartões: " + qtdCartoes
                    + "\n\nQual Cartão: " + x;
        }

        return "\nNome: " + nome
                + "\nSexo: " + sexo
                + "\nPossui Cartão: " + possuiCartao
                + "\nQuantidade de Cartões: " + qtdCartoes
                + "\n\nQual Cartão: " + x
                + "\n\nQual Conta: " + y;

    }
}