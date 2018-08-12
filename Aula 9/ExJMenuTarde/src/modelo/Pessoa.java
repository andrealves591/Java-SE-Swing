/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author André Luiz Alves e Eduardo José Gautier
 * @since 27/06/2018 13h37
 * @version 1.0 pikapika
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * 
     * @return retorna a idade em meses
     * @throws Exception bfcjfdhaj
     */
    public int calcularIdadeMeses() throws Exception{
        return idade*12;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Idade: " + idade;
    }
}