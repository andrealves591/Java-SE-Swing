/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 13h49
 * @version 1.0 meta charset
 */
public class ClienteVO {

    private long idCliente;
    private String nome;
    private long cpf;
    private String sexo;
    private byte idade;
    private EnderecoVO endereco;

    public ClienteVO() {
    }

    /**
     *
     * @param idCliente recebe o id do cliente
     * @param nome recebe o nome do cliente
     * @param cpf recebe o nome do cliente
     * @param sexo recebe o sexo do cliente
     * @param idade recebe a idade do cliente
     * @param endereco recebe os dados de endereço do cliente
     */
    public ClienteVO(long idCliente, String nome, long cpf, String sexo, byte idade, EnderecoVO endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
    }

    public EnderecoVO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoVO endereco) {
        this.endereco = endereco;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ClienteVO{" + "idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", idade=" + idade + ", endereco=" + endereco + '}';
    }

}
