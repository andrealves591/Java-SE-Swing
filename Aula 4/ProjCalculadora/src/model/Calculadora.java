/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author André Luiz Alves
 * @since 20/06/2018 14h00
 * @version 1.0 ppk
 */
public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora() {
    }
    /**
     * 
     * @param num1 recebe o 1º valor 
     * @param num2 recebe o 2º valor
     */
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    /**
     * 
     * @return retorna a soma dos valores 
     */
    public double somar() {
        return num1 + num2;
    }
    /**
     * 
     * @return retorna a subtração dos valores 
     */
    public double subtrair() {
        return num1 - num2;
    }
    /**
     * 
     * @return retorna a divisão dos valores 
     */
    public double dividir() {
        return num1 / num2;
    }
    /**
     * 
     * @return retorna a multiplicação dos valores 
     */
    public double multiplicar() {
        return num1 * num2;
    }

    @Override
    public String toString() {
        return "\nNúmero 1: " + num1
                + "\nNúmero 2: " + num2
                + "\n\nSoma: " + somar()
                + "\nSubtração: " + subtrair()
                + "\nDivisão: " + dividir()
                + "\nMultiplicação: " + multiplicar();
    }
}