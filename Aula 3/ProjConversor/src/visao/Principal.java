/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Conversor;

/**
 *
 * @author Diovani Cardoso Bach
 * @since 18/06/2018 - 16:00
 * @version 2.0 pokemon
 */
public class Principal {

    public static void main(String[] args) {
        int ano = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Digite o ano:",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE));

        Conversor objConversor = new Conversor(ano);

        int op = (JOptionPane.showConfirmDialog(
                null,
                "Deseja mostrar os dados convertidos?",
                "Registro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE));

        if (op == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    objConversor.toString(),
                    "Registro",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Trouxa",
                    "Registro",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}