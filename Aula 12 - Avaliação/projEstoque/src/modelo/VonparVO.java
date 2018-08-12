/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 03/07/2018
 * @version 1.0 charset
 */
public class VonparVO {
    private long idproduto;
    private String nome;
    private String tipoDeBebida;
    private int quantidade;
    private double litrosGarrafa;
    private String garrafaRetornavel;
    private double preco;   

    public VonparVO() {
    }
    /**
     * 
     * @param idproduto recebe id produto
     * @param nome recebe nome do produto
     * @param tipoDeBebida recebe o tipo de bebida
     * @param quantidade recebe a quantiade disponivel
     * @param litrosGarrafa recebe o tamanho da garrafa
     * @param garrafaRetornavel recebe se a garrafa é retornavel ou nao
     * @param preco recebe o valor de custo
     */
    public VonparVO(long idproduto, String nome, String tipoDeBebida, int quantidade, double litrosGarrafa, String garrafaRetornavel, double preco) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.tipoDeBebida = tipoDeBebida;
        this.quantidade = quantidade;
        this.litrosGarrafa = litrosGarrafa;
        this.garrafaRetornavel = garrafaRetornavel;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(long idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getLitrosGarrafa() {
        return litrosGarrafa;
    }

    public void setLitrosGarrafa(double litrosGarrafa) {
        this.litrosGarrafa = litrosGarrafa;
    }

    public String getGarrafaRetornavel() {
        return garrafaRetornavel;
    }

    public void setGarrafaRetornavel(String garrafaRetornavel) {
        this.garrafaRetornavel = garrafaRetornavel;
    }
     
}