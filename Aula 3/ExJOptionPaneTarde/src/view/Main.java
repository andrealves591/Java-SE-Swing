/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author André Luiz Alves
 * @since 18/06/2018 - 14H55
 * @version 1.0 Snapdragon
 */
public class Main {

    public static void main(String[] args) {

        Person objPerson = new Person();

        //entrada dinamica
        objPerson.setName(
                JOptionPane.showInputDialog(
                        null,
                        "Digite sue nome:",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE));
        objPerson.setWeight(Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Digite seu peso:",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE)));
        objPerson.setYears(Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Digite sua idade:",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE)));

        //saida de dados
        JOptionPane.showMessageDialog(
                null,
                objPerson.toString(),
                "Relatório",
                JOptionPane.PLAIN_MESSAGE);

    }//fecha main 
}//fecha classe
