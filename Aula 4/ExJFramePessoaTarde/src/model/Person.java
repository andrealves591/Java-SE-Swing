/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author André Alves
 * @since 19/06/2018 - 13H50
 * @version 1.0 CHARSET
 */
public class Person {

    private String name;
    private double weight;
    private int years;

    public Person() {
    }

    /**
     *
     * @param name RECEBE O NOME DA PESSOA
     * @param weight RECEBE O PESO DA PESSOA
     * @param years RECEBE A IDADE DA PESSOA
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
     * @return Retorna a idade em meses
     */
    public int calculateYearsMonths() {
        return years * 12;
    }

    /**
     *
     * @return Retorna a idade em semanas
     */
    public int calculateYearsWeeks() {
        return years * 48;
    }

    /**
     *
     * @return Retorna a idade em dias
     */
    public int calculateYearsDays() {
        return years * 365;
    }

    @Override
    public String toString() {
        return "Nome: " + name
                + "\nPeso: " + weight
                + "\nIdade:" + years
                + "\nIdade em meses: " + calculateYearsMonths()
                + "\nIdade em semanas: " + calculateYearsWeeks()
                + "\nIdade em dias: " + calculateYearsDays();
    }
}