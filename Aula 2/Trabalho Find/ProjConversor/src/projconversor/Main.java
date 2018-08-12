package projconversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ano objAno = new Ano();
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        objAno.setAno(leia.nextInt());

        System.out.println(objAno.toString());

    }//fecha metodo Main
}//fecha Classe Main
