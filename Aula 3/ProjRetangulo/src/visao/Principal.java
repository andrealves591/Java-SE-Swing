/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Retangulo;

/**
 *
 * @author André Luiz Alves
 * @since 18/06/2018 - 16h36
 * @version 2.0 pikachu
 */
public class Principal {

    public static void main(String[] args) {

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Informe a Altura",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE));
        double largura = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Informe a Largura",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE));

        Retangulo objRetangulo = new Retangulo(altura, largura);

        int op = (JOptionPane.showConfirmDialog(
                null,
                "Deseja mostrar os dados registrados?!",
                "Registro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE));

        if (op == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    objRetangulo.toString(),
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
