package projretangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Retangulo objRetangulo = new Retangulo();

        System.out.print("Informe a Altura do Retângulo: ");
        objRetangulo.setAltura(leia.nextDouble());
        System.out.print("Informe a Largura do Retângulo: ");
        objRetangulo.setLargura(leia.nextDouble());

        System.out.println(objRetangulo.toString());
    }
}
