/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Diovani Cardoso Bach
 * @since 25/06/2018 - 15:53
 * @version 1.0
 */
public class Cliente {
    
    private String nome;
    private String sexo;
    private String possuiCartao;
    private int qtdCartao;
    private ArrayList<String> qualCartao;
    private ArrayList<String> qualConta;

    public Cliente() {
    }
    
    /**
     * 
     * @param nome recebe o nome do Cliente
     * @param sexo recebe o sexo do Cliente
     * @param possuiCartao recebe o possui cartao
     * @param qtdCartao recebe a quantidade de cartão do Cliente
     * @param qualCartao recebe qual cartão do Cliente
     * @param qualConta recebe qual conta do Cliente
     */
    
    public Cliente(String nome, String sexo, String possuiCartao, int qtdCartao, ArrayList<String> qualCartao, ArrayList<String> qualConta) {
        this.nome = nome;
        this.sexo = sexo;
        this.possuiCartao = possuiCartao;
        this.qtdCartao = qtdCartao;
        this.qualCartao = qualCartao;
        this.qualConta = qualConta;
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

    public int getQtdCartao() {
        return qtdCartao;
    }

    public void setQtdCartao(int qtdCartao) {
        this.qtdCartao = qtdCartao;
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
            x = x + "\n" +qualCartao.get(i);
            
        }
        
        String y = "";
        
        for (int i = 0; i < qualConta.size(); i++) {
            y = y + "\n" + qualConta.get(i);
            
        }
        
        if(qualCartao.isEmpty() && qualConta.isEmpty()){
             return "\nNome: " + nome 
                + "\nSexo: " + sexo 
                + "\nPossui Cartão: " + possuiCartao 
                + "\nQuantidade de Cartões: " + qtdCartao ;
        }
        
        if(qualCartao.isEmpty()){
            return "\nNome: " + nome 
                + "\nSexo: " + sexo 
                + "\nPossui Cartão: " + possuiCartao 
                + "\nQuantidade de Cartões: " + qtdCartao 
                 + "\nQual Conta: " + y;
        }
        
        if(qualConta.isEmpty()){
            return "\nNome: " + nome 
                + "\nSexo: " + sexo 
                + "\nPossui Cartão: " + possuiCartao 
                + "\nQuantidade de Cartões: " + qtdCartao 
                + "\nQual Cartão: " + x;
        }
        
        
        
        
        return "\nNome: " + nome 
                + "\nSexo: " + sexo 
                + "\nPossui Cartão: " + possuiCartao 
                + "\nQuantidade de Cartões: " + qtdCartao 
                + "\n\nQual Cartão: " + x 
                + "\n\nQual Conta: " + y;
    }
    
    
}
