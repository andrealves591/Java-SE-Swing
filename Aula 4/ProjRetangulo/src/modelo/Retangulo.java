/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Eduardo
 * @since 19/06/2018 - 15h52
 * @version 3.0 raychu
 */
public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo() {
    }

    /**
     *
     * @param altura recebe a altura
     * @param largura recebe a largura
     */
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     *
     * @return retorna a area do retangulo
     */
    public double calcularArea() {
        return this.altura * this.largura;
    }

    /**
     *
     * @return retorna o perimetro do retangulo
     */
    public double calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    @Override
    public String toString() {
        return "Altura: " + altura + "\n"
                + "Largura: " + largura + "\n"
                + "Área: " + calcularArea() + "\n"
                + "Perímetro: " + calcularPerimetro();

    }
}
