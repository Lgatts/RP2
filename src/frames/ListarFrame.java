/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import categorias.Submissao;
import categorias.SubmissaoTipo;
import cruds.SubmissaoCrud;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lucas
 */
public class ListarFrame extends javax.swing.JFrame {

    private SubmissaoCrud listaSubmissoes;
    private Submissao submissaoSelecionada;
    private SubmissaoTipo submissaoTipo;

    public ListarFrame(SubmissaoCrud listaSubmissoes) {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle(listaSubmissoes.getTipoSubmissao().toString());

        listar(listaSubmissoes.getListaSubmissao());
        this.listaSubmissoes = listaSubmissoes;
        this.submissaoTipo = listaSubmissoes.getTipoSubmissao();

        jTextFieldConsulta.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelListar = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldConsulta = new javax.swing.JTextField();
        jLabelConsulta = new javax.swing.JLabel();
        jComboBoxConsulta = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jlButtonVoltarMenuInicia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelListar.setMaximumSize(new java.awt.Dimension(640, 785));
        jPanelListar.setMinimumSize(new java.awt.Dimension(640, 785));

        jList.setToolTipText("");
        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane.setViewportView(jList);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextFieldConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldConsultaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 591;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 11, 10);
        jPanel1.add(jTextFieldConsulta, gridBagConstraints);

        jLabelConsulta.setText("Consultar por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        jPanel1.add(jLabelConsulta, gridBagConstraints);

        jComboBoxConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar tudo", "Título", "Autor" }));
        jComboBoxConsulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxConsultaItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 119;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 32, 0, 0);
        jPanel1.add(jComboBoxConsulta, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jButtonExcluir, gridBagConstraints);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jButtonAdicionar, gridBagConstraints);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jButtonEditar, gridBagConstraints);

        jlButtonVoltarMenuInicia.setText("Voltar");
        jlButtonVoltarMenuInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlButtonVoltarMenuIniciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jlButtonVoltarMenuInicia, gridBagConstraints);

        javax.swing.GroupLayout jPanelListarLayout = new javax.swing.GroupLayout(jPanelListar);
        jPanelListar.setLayout(jPanelListarLayout);
        jPanelListarLayout.setHorizontalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelListarLayout.setVerticalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelListar, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            if (jList.getSelectedIndex() != -1) {

//                jPopupMenuDetalhes.setLocation(evt.getXOnScreen() - 5, evt.getYOnScreen() - 5);
//                jPopupMenuDetalhes.setVisible(true);
            }
        }
    }//GEN-LAST:event_jListMouseClicked

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        if (jList.isSelectionEmpty() == false) {
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            //Quando se clica na lista o valor selecionado é indicado como monografia selecionada
            javax.swing.ListModel<Submissao> lista = jList.getModel();
            submissaoSelecionada = lista.getElementAt(jList.getSelectedIndex());
        } else {

            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jListValueChanged

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        new SubmissoesFrame(listaSubmissoes, false, null).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        new SubmissoesFrame(listaSubmissoes, true, submissaoSelecionada).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        listaSubmissoes.excluir(submissaoSelecionada.getTituloSubmissao());
        listar(listaSubmissoes.getListaSubmissao());
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jlButtonVoltarMenuIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlButtonVoltarMenuIniciaActionPerformed
        new Inicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlButtonVoltarMenuIniciaActionPerformed

    private void jComboBoxConsultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxConsultaItemStateChanged

        switch ((String) jComboBoxConsulta.getSelectedItem()) {
            case "Autor":
                jTextFieldConsulta.setEnabled(true);
                listar(listaSubmissoes.consultarAutor(jTextFieldConsulta.getText()));
                break;
            case "Título":
                jTextFieldConsulta.setEnabled(true);
                listar(listaSubmissoes.consultarTitulo(jTextFieldConsulta.getText()));
                break;
            default:
                listar(listaSubmissoes.getListaSubmissao());
                jTextFieldConsulta.setEnabled(false);
                break;
        }        
    }//GEN-LAST:event_jComboBoxConsultaItemStateChanged

    private void jTextFieldConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsultaKeyTyped

        switch ((String) jComboBoxConsulta.getSelectedItem()) {
            case "Autor":
                listar(listaSubmissoes.consultarAutor(jTextFieldConsulta.getText()));
                break;
            case "Título":
                listar(listaSubmissoes.consultarTitulo(jTextFieldConsulta.getText()));
                break;
        }
    }//GEN-LAST:event_jTextFieldConsultaKeyTyped

    private void listar(List<Submissao> listaMonografias) {

        DefaultListModel listModel = new DefaultListModel();

        for (Submissao submissao : listaMonografias) {
            listModel.addElement(submissao);
        }

        jList.setModel(listModel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxConsulta;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JList<Submissao> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelListar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextFieldConsulta;
    private javax.swing.JButton jlButtonVoltarMenuInicia;
    // End of variables declaration//GEN-END:variables
}
