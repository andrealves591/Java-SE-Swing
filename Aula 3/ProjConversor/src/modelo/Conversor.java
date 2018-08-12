/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Diovani Cardoso Bach
 * @since 18/06/2018 - 16:00
 * @version 2.0 pokemon
 */
public class Conversor {

    private int ano;
    /**
     * 
     * @param ano recebe o ano digitado 
     */
    public Conversor(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * 
     * @return converte ano digitado em meses 
     */
    public int converterMeses() {
        return ano * 12;
    }
    /**
     * 
     * @return converte ano digitado em semanas 
     */
    public int converterSemanas() {
        return ano * 52;
    }
    /**
     * 
     * @return converte ano digitado em dias 
     */
    public int converterDias() {
        return ano * 365;
    }
    /**
     * 
     * @return converte ano digitado em horas 
     */
    public int converterHoras() {
        return ano * 8766;
    }
    /**
     * 
     * @return converte ano digitado em minutos 
     */
    public int converterMinutos() {
        return ano * 525960;
    }
    /**
     * 
     * @return converte ano digitado em segundos 
     */
    public int converterSegundos() {
        return ano * 31536000;
    }
    
    @Override
    public String toString() {
        return "Ano:" + ano
                + "\nMeses: " + converterMeses()
                + "\nSemanas: " + converterSemanas()
                + "\nDias: " + converterDias()
                + "\nHoras: " + converterHoras()
                + "\nMinutos: " + converterMinutos()
                + "\nSegundos: " + converterSegundos();
    }//fechar toString
}//fechar classe