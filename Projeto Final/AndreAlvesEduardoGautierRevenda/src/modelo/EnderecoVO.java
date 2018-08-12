/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 13h52
 * @version 1.0 meta charset
 */
public class EnderecoVO {

    private long idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public EnderecoVO() {
    }

    /**
     *
     * @param idEndereco recebe o id do endereço
     * @param rua recebe a rua do endereço
     * @param numero recebe o número rua
     * @param bairro recebe o bairro do endereço
     * @param cidade recebe a cidade do endereço
     * @param estado recebe o estado do endereço
     */
    public EnderecoVO(long idEndereco, String rua, int numero, String bairro, String cidade, String estado) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + "\n"
                + "Número: " + numero + "\n"
                + "Bairro: " + bairro + "\n"
                + "Cidade: " + cidade + "\n"
                + "Estado: " + estado;
    }
}
