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
    
    ArrayList<categorias.ShortCourse> courseList = new ArrayList<>();
    /**
     * Creates new form panelShortCourse
     */
    public PanelShortCourse() {
        initComponents();
        this.setTitle("RP II - Minicursos");
        this.setLocationRelativeTo(null);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonMoreDetails.setEnabled(false);
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

        jTabShortCourse = new javax.swing.JTabbedPane();
        jPanelList = new javax.swing.JPanel();
        jButtonMoreDetails = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonBackListInit = new javax.swing.JButton();
        jScrollPaneNamesShortCourses = new javax.swing.JScrollPane();
        jListNamesShortCourses = new javax.swing.JList<>();
        jPanelInsert = new javax.swing.JPanel();
        jButtonSaveInsert = new javax.swing.JButton();
        jButtonBackInsertInit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jTextInsertTitle = new javax.swing.JTextField();
        jLabelSituation = new javax.swing.JLabel();
        jComboBoxSituation = new javax.swing.JComboBox<>();
        jLabelResumoText = new javax.swing.JLabel();
        jScrollPaneResumoText = new javax.swing.JScrollPane();
        jTextPaneResumoText = new javax.swing.JTextPane();
        jLabelAbstractText = new javax.swing.JLabel();
        jScrollPaneAbstractText = new javax.swing.JScrollPane();
        jTextPaneAbstractText = new javax.swing.JTextPane();
        jLabelDuration = new javax.swing.JLabel();
        jFormattedTextDuration = new javax.swing.JFormattedTextField();
        jLabelResources = new javax.swing.JLabel();
        jTextResourses = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneMethodology = new javax.swing.JScrollPane();
        jTextPaneMethodology = new javax.swing.JTextPane();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelAuthor1 = new javax.swing.JLabel();
        jLabelAuthor2 = new javax.swing.JLabel();
        jTextAuthor = new javax.swing.JTextField();
        jTextAuthor1 = new javax.swing.JTextField();
        jTextAuthor2 = new javax.swing.JTextField();
        jPanelEdit = new javax.swing.JPanel();
        jButtonSaveEdit = new javax.swing.JButton();
        jButtonBackList = new javax.swing.JButton();
        jLabelTitleEdit = new javax.swing.JLabel();
        jTextTitleEdit = new javax.swing.JTextField();
        jLabelSituationEdit = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelResumoTextEdit = new javax.swing.JLabel();
        jScrollPaneResumoTextEdit = new javax.swing.JScrollPane();
        jTextPaneResumoTextEdit = new javax.swing.JTextPane();
        jLabelAbstractTextEdit = new javax.swing.JLabel();
        jScrollPaneAbstractTextEdit = new javax.swing.JScrollPane();
        jTextPaneAbstractTextEdit = new javax.swing.JTextPane();
        jLabelDurationEdit = new javax.swing.JLabel();
        jFormattedDurationEdit = new javax.swing.JFormattedTextField();
        jLabelResourcesEdit = new javax.swing.JLabel();
        jTextResourcesEdit = new javax.swing.JTextField();
        jLabelMethodologyEdit = new javax.swing.JLabel();
        jScrollPaneMethodologyEdit = new javax.swing.JScrollPane();
        jTextPaneMethodologyEdit = new javax.swing.JTextPane();
        jLabelAuthorEdit = new javax.swing.JLabel();
        jTextAuthorEdit = new javax.swing.JTextField();
        jLabelAuthor1Edit = new javax.swing.JLabel();
        jTextAuthor1Edit = new javax.swing.JTextField();
        jLabelAuthor2Edit = new javax.swing.JLabel();
        jTextAuthor2Edit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMoreDetails.setText("Mais Detalhes");

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
        jListNamesShortCourses.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListNamesShortCoursesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jListNamesShortCoursesFocusLost(evt);
            }
        });
        jScrollPaneNamesShortCourses.setViewportView(jListNamesShortCourses);

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMoreDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBackListInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneNamesShortCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNamesShortCourses)
                    .addGroup(jPanelListLayout.createSequentialGroup()
                        .addComponent(jButtonMoreDetails)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
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

        jLabelTitle.setText("Título: ");

        jLabelSituation.setText("Situação:");

        jComboBoxSituation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob avaliação", "Aprovado", "Reprovado" }));

        jLabelResumoText.setText("Resumo: ");

        jScrollPaneResumoText.setViewportView(jTextPaneResumoText);

        jLabelAbstractText.setText("Abstract:");

        jScrollPaneAbstractText.setViewportView(jTextPaneAbstractText);

        jLabelDuration.setText("Duração:");

        try {
            jFormattedTextDuration.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelResources.setText("Recursos:");

        jTextResourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextResoursesActionPerformed(evt);
            }
        });

        jLabel1.setText("Metodologia:");

        jScrollPaneMethodology.setViewportView(jTextPaneMethodology);

        jLabelAuthor.setText("Autor:");

        jLabelAuthor1.setText("Autor:");

        jLabelAuthor2.setText("Autor:");

        javax.swing.GroupLayout jPanelInsertLayout = new javax.swing.GroupLayout(jPanelInsert);
        jPanelInsert.setLayout(jPanelInsertLayout);
        jPanelInsertLayout.setHorizontalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInsertLayout.createSequentialGroup()
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addComponent(jLabelAbstractText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneAbstractText))
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addComponent(jLabelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextInsertTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSituation)
                                    .addComponent(jLabelResumoText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPaneResumoText)
                                    .addComponent(jComboBoxSituation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAuthor1)
                                    .addComponent(jLabelAuthor2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAuthor1)
                                    .addComponent(jTextAuthor2)))
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addComponent(jLabelAuthor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAuthor))
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneMethodology))
                            .addGroup(jPanelInsertLayout.createSequentialGroup()
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDuration)
                                    .addComponent(jLabelResources))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextResourses)
                                    .addGroup(jPanelInsertLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertLayout.createSequentialGroup()
                        .addComponent(jButtonBackInsertInit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSaveInsert)))
                .addContainerGap())
        );
        jPanelInsertLayout.setVerticalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jTextInsertTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuration)
                    .addComponent(jFormattedTextDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSituation)
                        .addComponent(jLabelResources)
                        .addComponent(jTextResourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxSituation))
                .addGap(18, 18, 18)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMethodology)
                    .addComponent(jLabel1)
                    .addComponent(jLabelResumoText)
                    .addComponent(jScrollPaneResumoText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInsertLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneAbstractText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAbstractText)))
                    .addGroup(jPanelInsertLayout.createSequentialGroup()
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAuthor)
                            .addComponent(jTextAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAuthor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAuthor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAuthor2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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

        jLabelTitleEdit.setText("Titulo:");

        jLabelSituationEdit.setText("Situação:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob avaliação", "Aprovado", "Reprovado" }));

        jLabelResumoTextEdit.setText("Resumo:");

        jScrollPaneResumoTextEdit.setViewportView(jTextPaneResumoTextEdit);

        jLabelAbstractTextEdit.setText("Abstract:");

        jScrollPaneAbstractTextEdit.setViewportView(jTextPaneAbstractTextEdit);

        jLabelDurationEdit.setText("Duração:");

        try {
            jFormattedDurationEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelResourcesEdit.setText("Recursos:");

        jTextResourcesEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextResourcesEditActionPerformed(evt);
            }
        });

        jLabelMethodologyEdit.setText("Metodologia:");

        jScrollPaneMethodologyEdit.setViewportView(jTextPaneMethodologyEdit);

        jLabelAuthorEdit.setText("Autor: ");

        jLabelAuthor1Edit.setText("Autor: ");

        jLabelAuthor2Edit.setText("Autor: ");

        javax.swing.GroupLayout jPanelEditLayout = new javax.swing.GroupLayout(jPanelEdit);
        jPanelEdit.setLayout(jPanelEditLayout);
        jPanelEditLayout.setHorizontalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                        .addComponent(jButtonBackList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                        .addComponent(jButtonSaveEdit))
                    .addGroup(jPanelEditLayout.createSequentialGroup()
                        .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelTitleEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextTitleEdit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelSituationEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelResumoTextEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneResumoTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelAbstractTextEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneAbstractTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelMethodologyEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneMethodologyEdit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelDurationEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedDurationEdit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelAuthorEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAuthorEdit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelAuthor1Edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAuthor1Edit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelAuthor2Edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAuthor2Edit))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelResourcesEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextResourcesEdit)))))
                .addContainerGap())
        );
        jPanelEditLayout.setVerticalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleEdit)
                    .addComponent(jTextTitleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDurationEdit)
                    .addComponent(jFormattedDurationEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSituationEdit)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResourcesEdit)
                    .addComponent(jTextResourcesEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelResumoTextEdit)
                    .addComponent(jScrollPaneResumoTextEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabelMethodologyEdit)
                    .addComponent(jScrollPaneMethodologyEdit))
                .addGap(9, 9, 9)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAbstractTextEdit)
                    .addComponent(jScrollPaneAbstractTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEditLayout.createSequentialGroup()
                        .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAuthor1Edit)
                                    .addComponent(jTextAuthor1Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextAuthorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAuthorEdit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAuthor2Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAuthor2Edit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
            .addComponent(jTabShortCourse, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabShortCourse)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackInsertInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackInsertInitActionPerformed
        // TODO add your handling code here:
        Inicial back = new Inicial();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackInsertInitActionPerformed

    private void jButtonBackListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackListActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(0);
        jTabShortCourse.setEnabledAt(0, true);
        jTabShortCourse.setEnabledAt(1, true);
        jTabShortCourse.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonBackListActionPerformed

    private void jButtonBackListInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackListInitActionPerformed
        // TODO add your handling code here:
        Inicial back = new Inicial();
        back.setVisible(true);
        this.dispose();        
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

    private void jListNamesShortCoursesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListNamesShortCoursesFocusGained
        // TODO add your handling code here:
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonMoreDetails.setEnabled(true);
    }//GEN-LAST:event_jListNamesShortCoursesFocusGained

    private void jListNamesShortCoursesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListNamesShortCoursesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jListNamesShortCoursesFocusLost

    private void jTextResourcesEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextResourcesEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextResourcesEditActionPerformed

    private void jTextResoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextResoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextResoursesActionPerformed

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
    private javax.swing.JButton jButtonMoreDetails;
    private javax.swing.JButton jButtonSaveEdit;
    private javax.swing.JButton jButtonSaveInsert;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSituation;
    private javax.swing.JFormattedTextField jFormattedDurationEdit;
    private javax.swing.JFormattedTextField jFormattedTextDuration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbstractText;
    private javax.swing.JLabel jLabelAbstractTextEdit;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelAuthor1;
    private javax.swing.JLabel jLabelAuthor1Edit;
    private javax.swing.JLabel jLabelAuthor2;
    private javax.swing.JLabel jLabelAuthor2Edit;
    private javax.swing.JLabel jLabelAuthorEdit;
    private javax.swing.JLabel jLabelDuration;
    private javax.swing.JLabel jLabelDurationEdit;
    private javax.swing.JLabel jLabelMethodologyEdit;
    private javax.swing.JLabel jLabelResources;
    private javax.swing.JLabel jLabelResourcesEdit;
    private javax.swing.JLabel jLabelResumoText;
    private javax.swing.JLabel jLabelResumoTextEdit;
    private javax.swing.JLabel jLabelSituation;
    private javax.swing.JLabel jLabelSituationEdit;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleEdit;
    private javax.swing.JList<String> jListNamesShortCourses;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelInsert;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPaneAbstractText;
    private javax.swing.JScrollPane jScrollPaneAbstractTextEdit;
    private javax.swing.JScrollPane jScrollPaneMethodology;
    private javax.swing.JScrollPane jScrollPaneMethodologyEdit;
    private javax.swing.JScrollPane jScrollPaneNamesShortCourses;
    private javax.swing.JScrollPane jScrollPaneResumoText;
    private javax.swing.JScrollPane jScrollPaneResumoTextEdit;
    private javax.swing.JTabbedPane jTabShortCourse;
    private javax.swing.JTextField jTextAuthor;
    private javax.swing.JTextField jTextAuthor1;
    private javax.swing.JTextField jTextAuthor1Edit;
    private javax.swing.JTextField jTextAuthor2;
    private javax.swing.JTextField jTextAuthor2Edit;
    private javax.swing.JTextField jTextAuthorEdit;
    private javax.swing.JTextField jTextInsertTitle;
    private javax.swing.JTextPane jTextPaneAbstractText;
    private javax.swing.JTextPane jTextPaneAbstractTextEdit;
    private javax.swing.JTextPane jTextPaneMethodology;
    private javax.swing.JTextPane jTextPaneMethodologyEdit;
    private javax.swing.JTextPane jTextPaneResumoText;
    private javax.swing.JTextPane jTextPaneResumoTextEdit;
    private javax.swing.JTextField jTextResourcesEdit;
    private javax.swing.JTextField jTextResourses;
    private javax.swing.JTextField jTextTitleEdit;
    // End of variables declaration//GEN-END:variables
}
