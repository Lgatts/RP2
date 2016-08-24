/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import cruds.MinicursoCRUD;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author YuryAlencar
 */
public class FrameMinicursoConsultaAvancada extends javax.swing.JFrame {
    
    private JList jListMinicursosNomes;
    private List<String> visualizarLista;
    /**
     * Creates new form AdvancedConsultShortCourse
     */
    public FrameMinicursoConsultaAvancada(JList jListNamesShortCourses) {
        initComponents();
        this.jListMinicursosNomes = jListNamesShortCourses;
        
        this.setTitle("RP II - Consulta Avançada");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelConsultaAvancadaTitulo = new javax.swing.JLabel();
        jLabelConsultaAvancadaAutor = new javax.swing.JLabel();
        jButtonConsultaAvancadaConsultar = new javax.swing.JButton();
        jTextConsultaAvancadaTitulo = new javax.swing.JTextField();
        jTextConsultaAvancadaAutor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelConsultaAvancadaTitulo.setText("Título:*");

        jLabelConsultaAvancadaAutor.setText("Autor:*");

        jButtonConsultaAvancadaConsultar.setText("Consultar");
        jButtonConsultaAvancadaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaAvancadaConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConsultaAvancadaTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextConsultaAvancadaTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConsultaAvancadaAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextConsultaAvancadaAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultaAvancadaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaAvancadaTitulo)
                    .addComponent(jTextConsultaAvancadaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaAvancadaAutor)
                    .addComponent(jTextConsultaAvancadaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultaAvancadaConsultar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void visualizarLista() {
        DefaultListModel mLista = new DefaultListModel();
        
        for(String elemento : visualizarLista){
            mLista.addElement(elemento);
        }
        jListMinicursosNomes.setModel(mLista);
    }

    private void jButtonConsultaAvancadaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaAvancadaConsultarActionPerformed
        // TODO add your handling code here:
        if(jTextConsultaAvancadaAutor.getText().trim().equals("") || jTextConsultaAvancadaTitulo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de todos os campos(*) para realizar a consulta avançada");
        }else{
            
            visualizarLista = MinicursoCRUD.consultaAvancada(jTextConsultaAvancadaTitulo.getText(),jTextConsultaAvancadaAutor.getText());
            visualizarLista();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonConsultaAvancadaConsultarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(FrameMinicursoConsultaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMinicursoConsultaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMinicursoConsultaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMinicursoConsultaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMinicursoConsultaAvancada(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultaAvancadaConsultar;
    private javax.swing.JLabel jLabelConsultaAvancadaAutor;
    private javax.swing.JLabel jLabelConsultaAvancadaTitulo;
    private javax.swing.JTextField jTextConsultaAvancadaAutor;
    private javax.swing.JTextField jTextConsultaAvancadaTitulo;
    // End of variables declaration//GEN-END:variables
}