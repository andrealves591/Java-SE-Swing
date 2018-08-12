/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author André Luiz Alves
 * @since 18/06/2018 - 14h23
 * @version 1.0 Snapdragon
 */
public class Person {

    private String name;
    private double weight;
    private int years;

    public Person() {
    }

    /**
     *
     * @param name recebe o nome da pessoa
     * @param weight recebe o peso da pessoa
     * @param years recebe a idade da pessoa
     */
    public Person(String name, double weight, int years) {
        this.name = name;
        this.weight = weight;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    /**
     *
     * @return retorna a idade em meses
     */
    public int calcularIdadeMeses() {
        return years * 12;
    }

    @Override
    public String toString() {
        return "\nNome = " + name
                + "\nPeso = " + weight
                + "\nIdade = " + years
                + "\nIdade em Meses = " + calcularIdadeMeses();
    }//fecha toString
    
}//fecha classe