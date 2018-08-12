package projpessoa;

import java.util.Scanner;

public class XFrango{
    public static void main(String args[]){

        System.out.println("\f");
        
        Scanner cu = new Scanner(System.in);
               
        System.out.print("Digite o seu nome: ");
        String nome = cu.next();
        
        System.out.print("Digite a sua idade: ");
        byte idade = cu.nextByte();

        Pessoa p = new Pessoa(nome, idade);
      
        System.out.println(p);
        
    }//fecha método
}//fecha classe
