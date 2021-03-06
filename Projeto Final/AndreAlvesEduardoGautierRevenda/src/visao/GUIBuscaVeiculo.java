/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VeiculoVO;
import servicos.ServicosFactory;
import servicos.VeiculoServicos;

/**
 *
 * @author Andre
 */
public class GUIBuscaVeiculo extends javax.swing.JInternalFrame {

    private final DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{
                "Código",
                "Nome",
                "Marca",
                "Ano",
                "Modelo",
                "Combustível",
                "Portas",
                "Cor",
                "Ar Cond.",
                "Dir. Hidráulica",
                "AirBag",
                "Valor Custo"
            }
    );

    /**
     * Creates new form GUIBuscaVeiculo
     */
    public GUIBuscaVeiculo() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFuel = new javax.swing.ButtonGroup();
        bgPortas = new javax.swing.ButtonGroup();
        jlpDados = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableVeiculo = new javax.swing.JTable();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbAtualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jlpFiltro = new javax.swing.JLayeredPane();
        jlFiltrar = new javax.swing.JLabel();
        jcomboFiltrar = new javax.swing.JComboBox<>();
        jtFiltrar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Veículos");
        setMinimumSize(new java.awt.Dimension(800, 455));
        setPreferredSize(new java.awt.Dimension(800, 455));

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlpDados.setPreferredSize(new java.awt.Dimension(764, 323));

        jtableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtableVeiculo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtableVeiculo);

        jlpDados.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlpAcoes.setPreferredSize(new java.awt.Dimension(342, 70));

        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jbAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAtualizarKeyPressed(evt);
            }
        });

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jbDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/erro.png"))); // NOI18N
        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });
        jbDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDeletarKeyPressed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setPreferredSize(new java.awt.Dimension(103, 41));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jbAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAlterarKeyPressed(evt);
            }
        });

        jlpAcoes.setLayer(jbAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpFiltro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlFiltrar.setText("Filtrar:");

        jcomboFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Marca", "Ano", "Modelo", "Combustível", "Portas", "Cor", "Ar Condicionado", "Direção Hidráulica", "AirBag", "Valor Custo" }));
        jcomboFiltrar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboFiltrarItemStateChanged(evt);
            }
        });

        jtFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarKeyReleased(evt);
            }
        });

        jlpFiltro.setLayer(jlFiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpFiltro.setLayer(jcomboFiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpFiltro.setLayer(jtFiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpFiltroLayout = new javax.swing.GroupLayout(jlpFiltro);
        jlpFiltro.setLayout(jlpFiltroLayout);
        jlpFiltroLayout.setHorizontalGroup(
            jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFiltrar)
                .addGap(18, 18, 18)
                .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jcomboFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpFiltroLayout.setVerticalGroup(
            jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpFiltro)
                    .addComponent(jlpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpDados, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela() {
        try {
            VeiculoServicos vs = ServicosFactory.getVeiculosServicos();
            ArrayList<VeiculoVO> carros = vs.buscarVeiculo();

            for (int i = 0; i < carros.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(carros.get(i).getIdVeiculo()),
                    carros.get(i).getNome(),
                    carros.get(i).getMarca(),
                    String.valueOf(carros.get(i).getAno()),
                    String.valueOf(carros.get(i).getModelo()),
                    carros.get(i).getCombustivel(),
                    carros.get(i).getPortas(),
                    carros.get(i).getCor(),
                    carros.get(i).getComplementos().get(0),
                    carros.get(i).getComplementos().get(1),
                    carros.get(i).getComplementos().get(2),
                    String.valueOf(carros.get(i).getValorCusto())
                });
            }
            jtableVeiculo.setModel(dtm);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparTabela() {
        dtm.setNumRows(0);
    }

    private void deletar() {
        try {
            int linha = jtableVeiculo.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Você não selecionou nenhuma linha!");
            } else {
                VeiculoServicos vs = ServicosFactory.getVeiculosServicos();
                String idVeiculo = (String) jtableVeiculo.getValueAt(linha, 0);
                vs.deletarVeiculo(Long.parseLong(idVeiculo));
                JOptionPane.showMessageDialog(
                            rootPane,
                            "Veículo Excluído com Sucesso!",
                            "Sistema",
                            JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao deletar! " + e.getMessage());
        }
    }

    private void filtrarVeiculos() {
        try {
            if (jtFiltrar.getText().isEmpty()) {
                limparTabela();
                preencherTabela();
            } else {

                String filtro = (String) jcomboFiltrar.getSelectedItem();
                String query = "";

                switch (filtro) {
                    case "Código":
                        query = "where idveiculo = " + jtFiltrar.getText();
                        break;
                    case "Nome":
                        query = "where nome like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Marca":
                        query = "where marca like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Ano":
                        query = "where ano = " + jtFiltrar.getText();
                        break;
                    case "Modelo":
                        query = "where modelo = " + jtFiltrar.getText();
                        break;
                    case "Combustível":
                        query = "where combustivel like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Portas":
                        query = "where portas like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Cor":
                        query = "where cor like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Ar Condicionado":
                        query = "where arcondicionado like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Direção Hidráulica":
                        query = "where direcaohidraulica like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "AirBag":
                        query = "where airbag like '%" + jtFiltrar.getText() + "%'";
                        break;
                    case "Valor Custo":
                        query = "where valorcusto like '%" + jtFiltrar.getText() + "%'";
                        break;
                    default:
                        break;
                }

                VeiculoServicos vs = ServicosFactory.getVeiculosServicos();
                ArrayList<VeiculoVO> carros = vs.filtrar(query);

                for (int i = 0; i < carros.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(carros.get(i).getIdVeiculo()),
                        carros.get(i).getNome(),
                        carros.get(i).getMarca(),
                        String.valueOf(carros.get(i).getAno()),
                        String.valueOf(carros.get(i).getModelo()),
                        carros.get(i).getCombustivel(),
                        carros.get(i).getPortas(),
                        carros.get(i).getCor(),
                        carros.get(i).getComplementos().get(0),
                        carros.get(i).getComplementos().get(1),
                        carros.get(i).getComplementos().get(2),
                        String.valueOf(carros.get(i).getValorCusto())
                    });
                }
                jtableVeiculo.setModel(dtm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar() {

        int linha = jtableVeiculo.getSelectedRow();
        if (linha != -1) {
            GUIAlteraVeiculo.jtCodigo.setText((String) jtableVeiculo.getValueAt(linha, 0));
            GUIAlteraVeiculo.jtNome.setText((String) jtableVeiculo.getValueAt(linha, 1));
            GUIAlteraVeiculo.jtMarca.setText((String) jtableVeiculo.getValueAt(linha, 2));
            GUIAlteraVeiculo.jtAno.setText((String) jtableVeiculo.getValueAt(linha, 3));
            GUIAlteraVeiculo.jtModelo.setText((String) jtableVeiculo.getValueAt(linha, 4));
            String combustivel = (String) jtableVeiculo.getValueAt(linha, 5);

            if (combustivel.equalsIgnoreCase("Gasolina")) {
                GUIAlteraVeiculo.jrbGasolina.setSelected(true);
            } else if (combustivel.equalsIgnoreCase("GNV")) {
                GUIAlteraVeiculo.jrbGnv.setSelected(true);
            } else if (combustivel.equalsIgnoreCase("Flex")) {
                GUIAlteraVeiculo.jrbFlex.setSelected(true);
            } else if (combustivel.equalsIgnoreCase("Etanol")) {
                GUIAlteraVeiculo.jrbEtanol.setSelected(true);
            } else {
                GUIAlteraVeiculo.jrbDiesel.setSelected(true);
            }

            String portas = (String) jtableVeiculo.getValueAt(linha, 6);

            if (portas.equalsIgnoreCase("2")) {
                GUIAlteraVeiculo.jrb2p.setSelected(true);
            } else if (portas.equalsIgnoreCase("3")) {
                GUIAlteraVeiculo.jrb3p.setSelected(true);
            } else {
                GUIAlteraVeiculo.jrb4p.setSelected(true);
            }
            GUIAlteraVeiculo.jtCor.setText((String) jtableVeiculo.getValueAt(linha, 7));

            String ar = (String) jtableVeiculo.getValueAt(linha, 8);
            if (ar.equalsIgnoreCase("Sim")) {
                GUIAlteraVeiculo.jcAr.setSelected(true);
            } else {
                GUIAlteraVeiculo.jcAr.setSelected(false);
            }

            String direcao = (String) jtableVeiculo.getValueAt(linha, 9);
            if (direcao.equalsIgnoreCase("Sim")) {
                GUIAlteraVeiculo.jcDirecao.setSelected(true);
            } else {
                GUIAlteraVeiculo.jcDirecao.setSelected(false);
            }

            String airbag = (String) jtableVeiculo.getValueAt(linha, 10);
            if (airbag.equalsIgnoreCase("Sim")) {
                GUIAlteraVeiculo.jcAirBag.setSelected(true);
            } else {
                GUIAlteraVeiculo.jcAirBag.setSelected(false);
            }
            GUIAlteraVeiculo.jtValor.setText((String) jtableVeiculo.getValueAt(linha, 11));
        } else {
            JOptionPane.showMessageDialog(this,
                    "Você não selecionou nenhuma linha!");
        }
    }

    private void abrirAlterar() {
        GUIAlteraVeiculo objGUI = new GUIAlteraVeiculo();
        Menu.jAreaDeTrabalho.add(objGUI);
        objGUI.setVisible(true);
    }


    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAtualizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limparTabela();
            preencherTabela();
        }
    }//GEN-LAST:event_jbAtualizarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            limparTabela();
        }
    }//GEN-LAST:event_jbLimparKeyPressed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int op = JOptionPane.showConfirmDialog(
                null,
                "Deseja Realmente Excluir?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (op == 0) {
            deletar();
            limparTabela();
            preencherTabela();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Cancelado com Sucesso!",
                    "Sistema",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDeletarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int op = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja Realmente Excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (op == 0) {
                deletar();
                limparTabela();
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Cancelado com Sucesso!",
                        "Sistema",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbDeletarKeyPressed

    private void jtFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltrarKeyReleased
        limparTabela();
        filtrarVeiculos();
    }//GEN-LAST:event_jtFiltrarKeyReleased

    private void jcomboFiltrarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboFiltrarItemStateChanged
        limparTabela();
        filtrarVeiculos();
    }//GEN-LAST:event_jcomboFiltrarItemStateChanged

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        abrirAlterar();
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAlterarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            abrirAlterar();
            alterar();
        }
    }//GEN-LAST:event_jbAlterarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFuel;
    private javax.swing.ButtonGroup bgPortas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcomboFiltrar;
    private javax.swing.JLabel jlFiltrar;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JLayeredPane jlpFiltro;
    private javax.swing.JTextField jtFiltrar;
    public javax.swing.JTable jtableVeiculo;
    // End of variables declaration//GEN-END:variables
}
