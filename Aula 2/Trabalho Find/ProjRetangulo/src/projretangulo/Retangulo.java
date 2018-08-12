package projretangulo;

public class Retangulo {

    private double altura;
    private double largura;

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

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    public String toString() {
        return ":::::::::::Retângulo:::::::::::\n"
                + "Altura: " + this.altura + "\n"
                + "Largura: " + this.largura + "\n"
                + "Área: " + this.calcularArea() + "\n"
                + "Perímetro: " + this.calcularPerimetro();

    }

}
