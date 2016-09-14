
package frames;

import categorias.Artigo;
import categorias.Situacao;
import categorias.Submissao;
import cruds.SubmissaoCrud;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrameArtigo extends javax.swing.JFrame {

    private List<SubmissaoCrud> submissaoCrudLista;
    private List<Submissao> submissaoLista;
    private SubmissaoCrud artigoCrud;
    private String tituloEditar;

    public FrameArtigo(List<SubmissaoCrud> submissaoLista) {

        this.submissaoCrudLista = submissaoLista;

        for (SubmissaoCrud crud : submissaoLista) {
            if (crud.getTipoSubmissao().equalsIgnoreCase("Artigos")) {
                artigoCrud = crud;
            }
        }

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RP2 - Artigos");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        jTabbedPaneArtigo.setEnabledAt(2, false);

        for (Situacao e : Situacao.values()) {
            jComboBoxSituacao.addItem(e.getSituacao());
            jComboBoxEditSituacao.addItem(e.getSituacao());
        }
    }

    private void listar(List<Submissao> listaArtigos) {

        DefaultListModel listModel = new DefaultListModel();

        for (Submissao submissao : listaArtigos) {
            listModel.addElement(submissao.getTituloSubmissao());
        }

        jListArtigos.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPaneArtigo = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListArtigos = new javax.swing.JList<String>();
        jComboBoxPesquisar = new javax.swing.JComboBox<String>();
        jButtonMenuPrincipal = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResumo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAbstract = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldAutor0 = new javax.swing.JTextField();
        jTextFieldInstituicao0 = new javax.swing.JTextField();
        jTextFieldPalavraChave0 = new javax.swing.JTextField();
        jTextFieldAutor1 = new javax.swing.JTextField();
        jTextFieldAutor2 = new javax.swing.JTextField();
        jTextFieldAutor3 = new javax.swing.JTextField();
        jTextFieldAutor4 = new javax.swing.JTextField();
        jTextFieldAutor5 = new javax.swing.JTextField();
        jTextFieldAutor6 = new javax.swing.JTextField();
        jTextFieldAutor7 = new javax.swing.JTextField();
        jTextFieldInstituicao1 = new javax.swing.JTextField();
        jTextFieldInstituicao2 = new javax.swing.JTextField();
        jTextFieldInstituicao3 = new javax.swing.JTextField();
        jTextFieldInstituicao4 = new javax.swing.JTextField();
        jTextFieldInstituicao5 = new javax.swing.JTextField();
        jTextFieldInstituicao6 = new javax.swing.JTextField();
        jTextFieldInstituicao7 = new javax.swing.JTextField();
        jTextFieldPalavraChave1 = new javax.swing.JTextField();
        jTextFieldPalavraChave2 = new javax.swing.JTextField();
        jTextFieldPalavraChave3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButtonSalvarAlteracao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaEditAbstract = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaEditResumo = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEditPalavraChave3 = new javax.swing.JTextField();
        jTextFieldEditPalavraChave2 = new javax.swing.JTextField();
        jTextFieldEditPalavraChave1 = new javax.swing.JTextField();
        jTextFieldEditPalavraChave0 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldEditInstituicao7 = new javax.swing.JTextField();
        jTextFieldEditInstituicao6 = new javax.swing.JTextField();
        jTextFieldEditInstituicao5 = new javax.swing.JTextField();
        jTextFieldEditInstituicao4 = new javax.swing.JTextField();
        jTextFieldEditInstituicao3 = new javax.swing.JTextField();
        jTextFieldEditInstituicao2 = new javax.swing.JTextField();
        jTextFieldEditInstituicao1 = new javax.swing.JTextField();
        jTextFieldEditInstituicao0 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldEditAutor7 = new javax.swing.JTextField();
        jTextFieldEditAutor6 = new javax.swing.JTextField();
        jTextFieldEditAutor5 = new javax.swing.JTextField();
        jTextFieldEditAutor4 = new javax.swing.JTextField();
        jTextFieldEditAutor3 = new javax.swing.JTextField();
        jTextFieldEditAutor2 = new javax.swing.JTextField();
        jTextFieldEditAutor1 = new javax.swing.JTextField();
        jTextFieldEditAutor0 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxEditSituacao = new javax.swing.JComboBox<String>();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldEditTitulo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Pesquisar:");

        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jListArtigos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListArtigosValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListArtigos);

        jComboBoxPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Titulo", "Autor", "Instituição" }));

        jButtonMenuPrincipal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMenuPrincipal.setText("Menu Inicial");
        jButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuPrincipalActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPesquisar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(jTextFieldBuscar))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPaneArtigo.addTab("Consultar", jPanel2);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Titulo:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Situação:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Autor(es):");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Instituição(ões):");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Palavra(s)-Chave:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Resumo:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Abstract:");

        jTextFieldTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jComboBoxSituacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextAreaResumo.setColumns(20);
        jTextAreaResumo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaResumo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResumo);

        jTextAreaAbstract.setColumns(20);
        jTextAreaAbstract.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaAbstract.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAbstract);

        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTextFieldAutor0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldInstituicao0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldPalavraChave0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAutor4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAutor0))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAutor5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAutor1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPalavraChave0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextFieldInstituicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldInstituicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldInstituicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldInstituicao5)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPalavraChave3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldInstituicao6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInstituicao2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldInstituicao3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInstituicao7))))))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInstituicao0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInstituicao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstituicao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPalavraChave0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPaneArtigo.addTab("Adicionar", jPanel3);

        jButtonSalvarAlteracao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvarAlteracao.setText("Salvar");
        jButtonSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlteracaoActionPerformed(evt);
            }
        });

        jTextAreaEditAbstract.setColumns(20);
        jTextAreaEditAbstract.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaEditAbstract.setRows(5);
        jScrollPane3.setViewportView(jTextAreaEditAbstract);

        jTextAreaEditResumo.setColumns(20);
        jTextAreaEditResumo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaEditResumo.setRows(5);
        jScrollPane5.setViewportView(jTextAreaEditResumo);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Abstract:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Resumo:");

        jTextFieldEditPalavraChave0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Palavra(s)-Chave:");

        jTextFieldEditInstituicao0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Instituição(ões):");

        jTextFieldEditAutor0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Autor(es):");

        jComboBoxEditSituacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("Situação:");

        jTextFieldEditTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("Titulo:");

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(308, 308, 308))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(307, 307, 307))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEditTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxEditSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEditInstituicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEditInstituicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldEditInstituicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEditPalavraChave0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEditPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEditInstituicao5))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEditPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEditPalavraChave3))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEditInstituicao2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(jTextFieldEditInstituicao6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEditInstituicao7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(jTextFieldEditInstituicao3)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEditAutor0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEditAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEditAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEditAutor4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEditAutor5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEditAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEditAutor7, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEditAutor3))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jComboBoxEditSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditAutor0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditAutor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditInstituicao0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditInstituicao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditInstituicao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditPalavraChave0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jTabbedPaneArtigo.addTab("Editar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        List<String> autores = new ArrayList();
        List<String> instituicoes = new ArrayList();
        List<String> palavrasChave = new ArrayList();

        String titulo, abstrat, resumo;
        Situacao situacao;
        titulo = jTextFieldTitulo.getText();
        situacao = Situacao.verificarSituacao(jComboBoxSituacao.getSelectedItem().toString());

        autores.add(jTextFieldAutor0.getText());
        autores.add(jTextFieldAutor1.getText());
        autores.add(jTextFieldAutor2.getText());
        autores.add(jTextFieldAutor3.getText());
        autores.add(jTextFieldAutor4.getText());
        autores.add(jTextFieldAutor5.getText());
        autores.add(jTextFieldAutor6.getText());
        autores.add(jTextFieldAutor7.getText());

        instituicoes.add(jTextFieldInstituicao0.getText());
        instituicoes.add(jTextFieldInstituicao1.getText());
        instituicoes.add(jTextFieldInstituicao2.getText());
        instituicoes.add(jTextFieldInstituicao3.getText());
        instituicoes.add(jTextFieldInstituicao4.getText());
        instituicoes.add(jTextFieldInstituicao5.getText());
        instituicoes.add(jTextFieldInstituicao6.getText());
        instituicoes.add(jTextFieldInstituicao7.getText());

        palavrasChave.add(jTextFieldPalavraChave0.getText());
        palavrasChave.add(jTextFieldPalavraChave1.getText());
        palavrasChave.add(jTextFieldPalavraChave2.getText());
        palavrasChave.add(jTextFieldPalavraChave3.getText());

        resumo = jTextAreaResumo.getText();
        abstrat = jTextAreaAbstract.getText();

        Artigo artigo = new Artigo(titulo, situacao, autores, instituicoes,
                palavrasChave, resumo, abstrat);

        artigoCrud.incluir(artigo);

        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        jTextFieldTitulo.setText("");
        jComboBoxSituacao.setSelectedIndex(0);
        jTextFieldAutor0.setText("");
        jTextFieldAutor1.setText("");
        jTextFieldAutor2.setText("");
        jTextFieldAutor3.setText("");
        jTextFieldAutor4.setText("");
        jTextFieldAutor5.setText("");
        jTextFieldAutor6.setText("");
        jTextFieldAutor7.setText("");

        jTextFieldInstituicao0.setText("");
        jTextFieldInstituicao1.setText("");
        jTextFieldInstituicao2.setText("");
        jTextFieldInstituicao3.setText("");
        jTextFieldInstituicao4.setText("");
        jTextFieldInstituicao5.setText("");
        jTextFieldInstituicao6.setText("");
        jTextFieldInstituicao7.setText("");

        jTextFieldPalavraChave0.setText("");
        jTextFieldPalavraChave1.setText("");
        jTextFieldPalavraChave2.setText("");
        jTextFieldPalavraChave3.setText("");

        jTextAreaResumo.setText("");
        jTextAreaAbstract.setText("");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        if (jComboBoxPesquisar.getSelectedItem().equals("Autor")) {
            listar(artigoCrud.consultarAutor(jTextFieldBuscar.getText()));

        } else if (jComboBoxPesquisar.getSelectedItem().equals("Titulo")) {
            listar(artigoCrud.consultarTitulo(jTextFieldBuscar.getText()));

        } else {
            listar(artigoCrud.getListaSubmissao());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuPrincipalActionPerformed
        new Inicial(this.submissaoCrudLista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMenuPrincipalActionPerformed

    private void jButtonSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlteracaoActionPerformed
        List<String> autores = new ArrayList();
        List<String> instituicoes = new ArrayList();
        List<String> palavrasChave = new ArrayList();

        String titulo, abstrat, resumo;

        titulo = jTextFieldEditTitulo.getText();

        autores.add(jTextFieldEditAutor0.getText());
        autores.add(jTextFieldEditAutor1.getText());
        autores.add(jTextFieldEditAutor2.getText());
        autores.add(jTextFieldEditAutor3.getText());
        autores.add(jTextFieldEditAutor4.getText());
        autores.add(jTextFieldEditAutor5.getText());
        autores.add(jTextFieldEditAutor6.getText());
        autores.add(jTextFieldEditAutor7.getText());

        instituicoes.add(jTextFieldEditInstituicao0.getText());
        instituicoes.add(jTextFieldEditInstituicao1.getText());
        instituicoes.add(jTextFieldEditInstituicao2.getText());
        instituicoes.add(jTextFieldEditInstituicao3.getText());
        instituicoes.add(jTextFieldEditInstituicao4.getText());
        instituicoes.add(jTextFieldEditInstituicao5.getText());
        instituicoes.add(jTextFieldEditInstituicao6.getText());
        instituicoes.add(jTextFieldEditInstituicao7.getText());

        palavrasChave.add(jTextFieldEditPalavraChave0.getText());
        palavrasChave.add(jTextFieldEditPalavraChave1.getText());
        palavrasChave.add(jTextFieldEditPalavraChave2.getText());
        palavrasChave.add(jTextFieldEditPalavraChave3.getText());

        resumo = jTextAreaEditResumo.getText();
        abstrat = jTextAreaEditAbstract.getText();

        Artigo artigo = new Artigo(titulo,
                Situacao.verificarSituacao(jComboBoxEditSituacao.getSelectedItem().toString()),
                autores, instituicoes, palavrasChave, resumo, abstrat);

        artigoCrud.editar(tituloEditar, artigo);

        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        submissaoLista = artigoCrud.getListaSubmissao();
        listar(submissaoLista);

        jComboBoxEditSituacao.setSelectedIndex(0);
        jTabbedPaneArtigo.setSelectedIndex(0);
        jTabbedPaneArtigo.setEnabledAt(0, true);
        jTabbedPaneArtigo.setEnabledAt(1, true);
        jTabbedPaneArtigo.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonSalvarAlteracaoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int j = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente excluir este artigo ?",
                "Excluir",
                JOptionPane.YES_NO_OPTION);

        if (j == JOptionPane.YES_OPTION) {
            artigoCrud.excluir(jListArtigos.getSelectedValue());

            listar(artigoCrud.getListaSubmissao());
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jTabbedPaneArtigo.setSelectedIndex(2);
        jTabbedPaneArtigo.setEnabledAt(0, false);
        jTabbedPaneArtigo.setEnabledAt(1, false);
        jTabbedPaneArtigo.setEnabledAt(2, true);

        submissaoLista = artigoCrud.getListaSubmissao();

        tituloEditar = jListArtigos.getSelectedValue();

        for (Submissao submissao : submissaoLista) {
            if (submissao.getTituloSubmissao().equals(jListArtigos.getSelectedValue())) {

                Artigo artigo = (Artigo) submissao;

                jTextFieldEditTitulo.setText(artigo.getTituloSubmissao());

                for (int i = 0; i < 3; i++) {
                    if (jComboBoxEditSituacao.getItemAt(i).equalsIgnoreCase(artigo.getSituacaoSubmissao().getSituacao())) {
                        jComboBoxEditSituacao.setSelectedIndex(i);
                    }
                }

                jTextFieldEditAutor0.setText(artigo.getAutores().get(0));
                jTextFieldEditAutor1.setText(artigo.getAutores().get(1));
                jTextFieldEditAutor2.setText(artigo.getAutores().get(2));
                jTextFieldEditAutor3.setText(artigo.getAutores().get(3));
                jTextFieldEditAutor4.setText(artigo.getAutores().get(4));
                jTextFieldEditAutor5.setText(artigo.getAutores().get(5));
                jTextFieldEditAutor6.setText(artigo.getAutores().get(6));
                jTextFieldEditAutor7.setText(artigo.getAutores().get(7));

                jTextFieldEditInstituicao0.setText(artigo.getInstituicao().get(0));
                jTextFieldEditInstituicao1.setText(artigo.getInstituicao().get(1));
                jTextFieldEditInstituicao2.setText(artigo.getInstituicao().get(2));
                jTextFieldEditInstituicao3.setText(artigo.getInstituicao().get(3));
                jTextFieldEditInstituicao4.setText(artigo.getInstituicao().get(4));
                jTextFieldEditInstituicao5.setText(artigo.getInstituicao().get(5));
                jTextFieldEditInstituicao6.setText(artigo.getInstituicao().get(6));
                jTextFieldEditInstituicao7.setText(artigo.getInstituicao().get(7));

                jTextFieldEditPalavraChave0.setText(artigo.getPalavraChave().get(0));
                jTextFieldEditPalavraChave1.setText(artigo.getPalavraChave().get(1));
                jTextFieldEditPalavraChave2.setText(artigo.getPalavraChave().get(2));
                jTextFieldEditPalavraChave3.setText(artigo.getPalavraChave().get(3));

                jTextAreaEditResumo.setText(artigo.getResumo());
                jTextAreaEditAbstract.setText(artigo.getAbstrat());
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jListArtigosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListArtigosValueChanged
        if (jListArtigos.isSelectionEmpty()) {
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        } else {
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jListArtigosValueChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTabbedPaneArtigo.setSelectedIndex(0);
        jTabbedPaneArtigo.setEnabledAt(0, true);
        jTabbedPaneArtigo.setEnabledAt(1, true);
        jTabbedPaneArtigo.setEnabledAt(2, false);

        jTextFieldEditTitulo.setText("");

        jComboBoxEditSituacao.setSelectedIndex(0);

        jTextFieldEditAutor0.setText("");
        jTextFieldEditAutor1.setText("");
        jTextFieldEditAutor2.setText("");
        jTextFieldEditAutor3.setText("");
        jTextFieldEditAutor4.setText("");
        jTextFieldEditAutor5.setText("");
        jTextFieldEditAutor6.setText("");
        jTextFieldEditAutor7.setText("");

        jTextFieldEditInstituicao0.setText("");
        jTextFieldEditInstituicao1.setText("");
        jTextFieldEditInstituicao2.setText("");
        jTextFieldEditInstituicao3.setText("");
        jTextFieldEditInstituicao4.setText("");
        jTextFieldEditInstituicao5.setText("");
        jTextFieldEditInstituicao6.setText("");
        jTextFieldEditInstituicao7.setText("");

        jTextFieldEditPalavraChave0.setText("");
        jTextFieldEditPalavraChave1.setText("");
        jTextFieldEditPalavraChave2.setText("");
        jTextFieldEditPalavraChave3.setText("");

        jTextAreaEditResumo.setText("");
        jTextAreaEditAbstract.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameArtigo(null).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonMenuPrincipal;
    private javax.swing.JButton jButtonSalvarAlteracao;
    private javax.swing.JComboBox<String> jComboBoxEditSituacao;
    private javax.swing.JComboBox<String> jComboBoxPesquisar;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListArtigos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneArtigo;
    private javax.swing.JTextArea jTextAreaAbstract;
    private javax.swing.JTextArea jTextAreaEditAbstract;
    private javax.swing.JTextArea jTextAreaEditResumo;
    private javax.swing.JTextArea jTextAreaResumo;
    private javax.swing.JTextField jTextFieldAutor0;
    private javax.swing.JTextField jTextFieldAutor1;
    private javax.swing.JTextField jTextFieldAutor2;
    private javax.swing.JTextField jTextFieldAutor3;
    private javax.swing.JTextField jTextFieldAutor4;
    private javax.swing.JTextField jTextFieldAutor5;
    private javax.swing.JTextField jTextFieldAutor6;
    private javax.swing.JTextField jTextFieldAutor7;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldEditAutor0;
    private javax.swing.JTextField jTextFieldEditAutor1;
    private javax.swing.JTextField jTextFieldEditAutor2;
    private javax.swing.JTextField jTextFieldEditAutor3;
    private javax.swing.JTextField jTextFieldEditAutor4;
    private javax.swing.JTextField jTextFieldEditAutor5;
    private javax.swing.JTextField jTextFieldEditAutor6;
    private javax.swing.JTextField jTextFieldEditAutor7;
    private javax.swing.JTextField jTextFieldEditInstituicao0;
    private javax.swing.JTextField jTextFieldEditInstituicao1;
    private javax.swing.JTextField jTextFieldEditInstituicao2;
    private javax.swing.JTextField jTextFieldEditInstituicao3;
    private javax.swing.JTextField jTextFieldEditInstituicao4;
    private javax.swing.JTextField jTextFieldEditInstituicao5;
    private javax.swing.JTextField jTextFieldEditInstituicao6;
    private javax.swing.JTextField jTextFieldEditInstituicao7;
    private javax.swing.JTextField jTextFieldEditPalavraChave0;
    private javax.swing.JTextField jTextFieldEditPalavraChave1;
    private javax.swing.JTextField jTextFieldEditPalavraChave2;
    private javax.swing.JTextField jTextFieldEditPalavraChave3;
    private javax.swing.JTextField jTextFieldEditTitulo;
    private javax.swing.JTextField jTextFieldInstituicao0;
    private javax.swing.JTextField jTextFieldInstituicao1;
    private javax.swing.JTextField jTextFieldInstituicao2;
    private javax.swing.JTextField jTextFieldInstituicao3;
    private javax.swing.JTextField jTextFieldInstituicao4;
    private javax.swing.JTextField jTextFieldInstituicao5;
    private javax.swing.JTextField jTextFieldInstituicao6;
    private javax.swing.JTextField jTextFieldInstituicao7;
    private javax.swing.JTextField jTextFieldPalavraChave0;
    private javax.swing.JTextField jTextFieldPalavraChave1;
    private javax.swing.JTextField jTextFieldPalavraChave2;
    private javax.swing.JTextField jTextFieldPalavraChave3;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
