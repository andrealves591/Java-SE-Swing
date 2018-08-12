/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 13h33
 * @version 1.0 meta charset
 */
public class VeiculoVO {

    private long idVeiculo;
    private String nome;
    private String marca;
    private int ano;
    private int modelo;
    private String combustivel;
    private double valorCusto;
    private String cor;
    private String portas;
    private ArrayList<String> complementos;

    public VeiculoVO() {
    }

    /**
     *
     * @param idveiculo recebe o id do veículo
     * @param nome recebe o nome do veículo
     * @param marca recebe a marca do veículo
     * @param ano recebe o ano do veículo
     * @param modelo recebe o modelo do veículo
     * @param combustivel recebe o combustível do veículo
     * @param valorCusto recebe o valor de custo do veículo
     * @param cor recebe a cor do veículo
     * @param portas recebe quantas portas tem o veículo
     * @param complementos recebe os complementos do veículo
     */
    public VeiculoVO(long idveiculo, String nome, String marca, int ano, int modelo, String combustivel, double valorCusto, String cor, String portas, ArrayList<String> complementos) {
        this.idVeiculo = idveiculo;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.valorCusto = valorCusto;
        this.cor = cor;
        this.portas = portas;
        this.complementos = complementos;
    }

    public ArrayList<String> getComplementos() {
        return complementos;
    }

    public void setComplementos(ArrayList<String> complementos) {
        this.complementos = complementos;
    }

    public long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Dados do Veículo:\n\n"
                + "Marca: " + marca + "\n"
                + "Nome: " + nome + "\n"
                + "Ano: " + ano + "\n"
                + "Modelo: " + modelo + "\n"
                + "Combustível: " + combustivel + "\n"
                + "Cor: " + cor + "\n"
                + "Portas: " + portas + "\n"
                + "Valor Custo: R$ " + valorCusto + "\n"
                + "Complementos: " + complementos;
    }
}
