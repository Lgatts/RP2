/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.util.ArrayList;
/**
 *
 * @author YuryAlencar
 */
public class PanelShortCourse extends javax.swing.JFrame {

    /**
     * Creates new form panelShortCourse
     */
    private ArrayList<categorias.ShortCourse> courseList = new ArrayList<>();
    
    public PanelShortCourse() {
        initComponents();
        this.setTitle("RP II - Minicursos");
        jTabShortCourse.setEnabledAt(0, true);
        jTabShortCourse.setEnabledAt(1, true);
        jTabShortCourse.setEnabledAt(2, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabShortCourse = new javax.swing.JTabbedPane();
        jPanelList = new javax.swing.JPanel();
        jButtonViewDetails = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonBackListInit = new javax.swing.JButton();
        jScrollPaneNamesShortCourses = new javax.swing.JScrollPane();
        jListNamesShortCourses = new javax.swing.JList<>();
        jPanelInsert = new javax.swing.JPanel();
        jButtonSaveInsert = new javax.swing.JButton();
        jButtonBackInsertInit = new javax.swing.JButton();
        jPanelEdit = new javax.swing.JPanel();
        jButtonSaveEdit = new javax.swing.JButton();
        jButtonBackList = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonViewDetails.setText("Mais Detalhes");

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Excluir");

        jButtonBackListInit.setText("Voltar");
        jButtonBackListInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackListInitActionPerformed(evt);
            }
        });

        jListNamesShortCourses.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneNamesShortCourses.setViewportView(jListNamesShortCourses);

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBackListInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneNamesShortCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNamesShortCourses)
                    .addGroup(jPanelListLayout.createSequentialGroup()
                        .addComponent(jButtonViewDetails)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(jButtonBackListInit)))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Lista", jPanelList);

        jButtonSaveInsert.setText("Salvar");
        jButtonSaveInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveInsertActionPerformed(evt);
            }
        });

        jButtonBackInsertInit.setText("Voltar");
        jButtonBackInsertInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackInsertInitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInsertLayout = new javax.swing.GroupLayout(jPanelInsert);
        jPanelInsert.setLayout(jPanelInsertLayout);
        jPanelInsertLayout.setHorizontalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBackInsertInit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jButtonSaveInsert)
                .addContainerGap())
        );
        jPanelInsertLayout.setVerticalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveInsert)
                    .addComponent(jButtonBackInsertInit))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Adicionar", jPanelInsert);

        jButtonSaveEdit.setText("Salvar");

        jButtonBackList.setText("Voltar");
        jButtonBackList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditLayout = new javax.swing.GroupLayout(jPanelEdit);
        jPanelEdit.setLayout(jPanelEditLayout);
        jPanelEditLayout.setHorizontalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBackList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jButtonSaveEdit)
                .addContainerGap())
        );
        jPanelEditLayout.setVerticalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveEdit)
                    .addComponent(jButtonBackList))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Editar", jPanelEdit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabShortCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabShortCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackInsertInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackInsertInitActionPerformed
        // TODO add your handling code here:
        Inicial back = new Inicial();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackInsertInitActionPerformed

    private void jButtonBackListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackListActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(2);
        jTabShortCourse.setEnabledAt(0, true);
        jTabShortCourse.setEnabledAt(1, true);
        jTabShortCourse.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonBackListActionPerformed

    private void jButtonBackListInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackListInitActionPerformed
        // TODO add your handling code here:
        Inicial back = new Inicial();
        back.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_jButtonBackListInitActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(2);
        jTabShortCourse.setEnabledAt(0, false);
        jTabShortCourse.setEnabledAt(1, false);
        jTabShortCourse.setEnabledAt(2, true);        
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSaveInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveInsertActionPerformed

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
            java.util.logging.Logger.getLogger(PanelShortCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelShortCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelShortCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelShortCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelShortCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackInsertInit;
    private javax.swing.JButton jButtonBackList;
    private javax.swing.JButton jButtonBackListInit;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSaveEdit;
    private javax.swing.JButton jButtonSaveInsert;
    private javax.swing.JButton jButtonViewDetails;
    private javax.swing.JList<String> jListNamesShortCourses;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelInsert;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPaneNamesShortCourses;
    private javax.swing.JTabbedPane jTabShortCourse;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
