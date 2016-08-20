/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import categorias.Resumo;
import cruds.ResumoCrud;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author junio
 */
public class ResumoFrame extends javax.swing.JFrame {

    /**
     * Creates new form ResumoFrame
     */
    public ResumoFrame() {
        initComponents();
    }

    private List<Resumo> pesquisaList;
    private List<String> displayList;

    private Object jComboBoxSituaçao;
    private Object jTextTitulo;
    private String[] autores;
    private String[] instituicoes;
    private String[] pChave;

    /**
     * Metodo para listar na lista
     */
    private void listar() {

        DefaultListModel listModel = new DefaultListModel();
        for (String element : displayList) {
            listModel.addElement(element);
        }
        jListConsulta.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jButtonAutores = new javax.swing.JToggleButton();
        jButtonInstituiçoes = new javax.swing.JToggleButton();
        jButtonPalavraChave = new javax.swing.JToggleButton();
        jButtonSalvar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextPesquisaResumo = new javax.swing.JTextField();
        jButtonListar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListConsulta = new javax.swing.JList<>();
        jButtonDetalhes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Situação:");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob Avaliação", "Aprovado", "Reprovado" }));
        jComboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSituacaoActionPerformed(evt);
            }
        });

        jButtonAutores.setText("Autor");
        jButtonAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAutoresActionPerformed(evt);
            }
        });

        jButtonInstituiçoes.setText("Instituição");
        jButtonInstituiçoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstituiçoesActionPerformed(evt);
            }
        });

        jButtonPalavraChave.setText("Palavra Chave");
        jButtonPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPalavraChaveActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Slvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAutores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonInstituiçoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPalavraChave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAutores)
                .addGap(18, 18, 18)
                .addComponent(jButtonInstituiçoes)
                .addGap(18, 18, 18)
                .addComponent(jButtonPalavraChave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Novo resumo", jPanel1);

        jLabel3.setText("Titulo :");

        jButtonListar.setText("Consultar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListConsulta);

        jButtonDetalhes.setText("Detalhes");
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPesquisaResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPesquisaResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonListar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDetalhes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutoresActionPerformed
        // TODO add your handling code here:
        int n;
        do{
            n = Integer.valueOf(JOptionPane.showInputDialog("Quantos autores deseja inserir?"));
        }while(0>n || n>8);
        autores = new String[n];
        for(int i =0; i < n; i++){
            autores[i]=JOptionPane.showInputDialog("Autor "+(i+1));
        }

    }//GEN-LAST:event_jButtonAutoresActionPerformed

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
        displayList = ResumoCrud.consultar(jTextPesquisaResumo.getText());
        listar();
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonInstituiçoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstituiçoesActionPerformed
        // TODO add your handling code here:
        int n;
        do {
            n = Integer.valueOf(JOptionPane.showInputDialog("Quantas instituições deseja inserir?"));
        } while (0 > n || n > 8);
        instituicoes = new String[n];
        for (int i = 0; i < n; i++) {
            instituicoes[i] = JOptionPane.showInputDialog("Instituição " + (i + 1));
        }
    }//GEN-LAST:event_jButtonInstituiçoesActionPerformed

    private void jButtonPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPalavraChaveActionPerformed
        // TODO add your handling code here
        int n;
        do{
            n = Integer.valueOf(JOptionPane.showInputDialog("Quantas Palavras-Chave deseja inserir?"));
        }while(0>n || n>8);
        pChave = new String[n];
        for(int i =0; i < n; i++){
            pChave[i]=JOptionPane.showInputDialog("Palavra-Chave "+(i+1));
        }
    }//GEN-LAST:event_jButtonPalavraChaveActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here
        ResumoCrud resumo = new ResumoCrud();

        resumo.incluir(jTextFieldTitulo.getText(), jComboBoxSituacao.getSelectedItem().toString(), instituicoes, pChave, autores);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
        // TODO add your handling code here:
        ResumoCrud detalhes = new ResumoCrud();
        pesquisaList = detalhes.getLista();
        for(Resumo resumo : pesquisaList){
            if(jListConsulta.getSelectedValue().equals(resumo.getTitulo())){
                JOptionPane.showMessageDialog(null, "Titulo: "+resumo.getTitulo());
                JOptionPane.showMessageDialog(null, "Situação: "+resumo.getSituacao());
                
                for(int i=0; i<resumo.getAutor().length ;i++){
                    JOptionPane.showMessageDialog(null, "Autor: "+resumo.getAutor()[i]);
                }
                
                for(int i=0; i<resumo.getPalavraChave().length ;i++){
                    JOptionPane.showMessageDialog(null, "Palavra-Chave: "+resumo.getPalavraChave()[i]);
                }
                
                for(int i=0; i<resumo.getInstituicao().length ;i++){
                    JOptionPane.showMessageDialog(null, "Insituição: "+resumo.getInstituicao()[i]);
                }
            }
        }
        
    }//GEN-LAST:event_jButtonDetalhesActionPerformed

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
            java.util.logging.Logger.getLogger(ResumoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResumoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonAutores;
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JToggleButton jButtonInstituiçoes;
    private javax.swing.JToggleButton jButtonListar;
    private javax.swing.JToggleButton jButtonPalavraChave;
    private javax.swing.JToggleButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextPesquisaResumo;
    // End of variables declaration//GEN-END:variables
}
