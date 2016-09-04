/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import categorias.Minicurso;
import cruds.MinicursoCRUD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author YuryAlencar
 */
public class FrameMinicurso extends javax.swing.JFrame {

    private String nomeEditar;
    private List<String> visualizarLista;    
    private List<Minicurso> minicursos = MinicursoCRUD.getMinicursos();
    
    /**
     * Creates new form panelShortCourse
     */
    public FrameMinicurso() {

        initComponents();
        this.setTitle("RP II - Minicursos");
        this.setLocationRelativeTo(null);

        jTextEditarAutor1.setEnabled(false);
        jTextEditarAutor2.setEnabled(false);

        jButtonEditar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonMaisDetalhes.setEnabled(false);

        jTextAutor1.setEnabled(false);
        jTextAutor2.setEnabled(false);

        jTabShortCourse.setEnabledAt(1, false);
        jTabShortCourse.setEnabledAt(2, false);
    }
    
    /**
     * Método para verificar a duracao
     * @param duracao - recebe a duracao para verificar se é uma quantidade válida
     * @return - boolean , verdadeiro caso for inválida
     */
    public boolean verificarDuracao(String duracaoString){
        String valores="";
        int duracao=0, aux=0;
        for(int i=0; i<duracaoString.length(); i++){
            
            if(duracaoString.charAt(i) == ':'){
                if(aux == 0){
                    if(Integer.parseInt(valores)>=25){
                        return true;
                    }
                    valores ="";
                    aux++;
                } else if (aux == 1) {
                    if(60<=Integer.parseInt(valores)){
                        return true;
                    }
                    valores ="";
                    aux++;
                }
            } else {
                valores += duracaoString.charAt(i);
                if(aux==2)
                    aux++;
                if(aux == 3){
                    if(60<=Integer.parseInt(valores)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * Método para converter os campos de duracao para inteiro
     * @param duracaoString
     * @return 
     */
    public int converterStringEmNumero(String duracaoString){
        int duracao=0;
        
        duracao += Integer.parseInt(duracaoString.substring(0, 2))*3600;
        duracao += Integer.parseInt(duracaoString.substring(3, 5))*60;
        duracao += Integer.parseInt(duracaoString.substring(6));
        
        return duracao;
    }
    
    /**
     *  Método para exibir a lista no jList
     */
    public void visualizarLista() {
        DefaultListModel mLista = new DefaultListModel();
        
        for(String elemento : visualizarLista){
            mLista.addElement(elemento);
        }
        
        jListNomesMinicursos.setModel(mLista);
    }
    
    /**
     * 
     * @param nome 
     */
    private void maisDetalhes(String nome){
        FrameMinicursoDetalhes detalhes = new FrameMinicursoDetalhes(nome);
        detalhes.setVisible(true);
    }
    
    /**
     * 
     * @param jList 
     */
    private void deletar(String nomeMinicurso){
        MinicursoCRUD.excluir(nomeMinicurso);
        visualizarLista = MinicursoCRUD.consultar("", "");
        visualizarLista();
    }
    
    /**
     * 
     * @param jList 
     */
    private void editar(JList jList) {
        jTabShortCourse.setSelectedIndex(2);
        jTabShortCourse.setEnabledAt(0, false);
        jTabShortCourse.setEnabledAt(1, false);
        jTabShortCourse.setEnabledAt(2, true);

        String duracaoEditar;
        int indexEditarSituacao = 0, hora, minutos,segundos;
        nomeEditar = jList.getSelectedValue().toString();

        for (categorias.Minicurso minicurso : minicursos) {
            if (nomeEditar.equals(minicurso.getTituloSubmissao())) {
                for (int i = 0; i < jComboBoxEditarSituacao.getItemCount(); i++) {
                    if (minicurso.getSituacaoSubmissao().equals(jComboBoxEditarSituacao.getItemAt(i))) {
                        indexEditarSituacao = i;
                        
                    }
                }

                hora = minicurso.getDuracao()/3600;
                minutos = (minicurso.getDuracao()%3600)/60;
                segundos = (minicurso.getDuracao()%3600)%60;
                
                if(segundos<10 && hora<10 && minutos <10)
                    duracaoEditar = "0"+String.valueOf(hora)+"0"+String.valueOf(minutos)
                            +"0"+String.valueOf(segundos);
                else if(segundos<10 && hora<10)
                    duracaoEditar = "0"+String.valueOf(hora)+String.valueOf(minutos)
                            +"0"+String.valueOf(segundos);
                else if(segundos<10 && minutos<10)
                    duracaoEditar = String.valueOf(hora)+"0"+String.valueOf(minutos)
                            +"0"+String.valueOf(segundos);
                else if(hora<10 && minutos<10)
                    duracaoEditar = "0"+String.valueOf(hora)+"0"+String.valueOf(minutos)
                            +String.valueOf(segundos);
                else
                    duracaoEditar = String.valueOf(hora)+String.valueOf(minutos)
                            +String.valueOf(segundos);
                
                jTextEditarTitulo.setText(minicurso.getTituloSubmissao());
                jComboBoxEditarSituacao.setSelectedIndex(indexEditarSituacao);
                jTextPaneEditarResumoTexto.setText(minicurso.getResumo());
                jTextPaneEditarAbstractTexto.setText(minicurso.getAbstractText());
                jFormattedEditarDuracao.setText(duracaoEditar);
                jTextEditarRecursos.setText(minicurso.getRecursos());
                jTextPaneEditarMetodologia.setText(minicurso.getMetodologia());
                
                if(minicurso.getAutores().size() == 1){
                    jTextEditarAutor.setText(minicurso.getAutores().get(0));
                } else if (minicurso.getAutores().size() == 2){
                    jTextEditarAutor.setText(minicurso.getAutores().get(0));
                    jTextEditarAutor1.setText(minicurso.getAutores().get(1));
                } else if(minicurso.getAutores().size() == 3){
                    jTextEditarAutor.setText(minicurso.getAutores().get(0));
                    jTextEditarAutor1.setText(minicurso.getAutores().get(1));
                    jTextEditarAutor2.setText(minicurso.getAutores().get(2));
                }
                
                jComboBoxEditarAutor.setSelectedIndex(minicurso.getAutores().size()-1);
                
            }
        }

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
        jPanelListar = new javax.swing.JPanel();
        jButtonMaisDetalhes = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonVoltarInicio = new javax.swing.JButton();
        jScrollPaneNomesMinicursos = new javax.swing.JScrollPane();
        jListNomesMinicursos = new javax.swing.JList<>();
        jLabelConsultar = new javax.swing.JLabel();
        jTextConsultar = new javax.swing.JTextField();
        jComboBoxConsultar = new javax.swing.JComboBox<>();
        jButtonConsultar = new javax.swing.JButton();
        jButtonConsultaAvancada = new javax.swing.JButton();
        jButtonInserirMinicurso = new javax.swing.JButton();
        jPanelInserir = new javax.swing.JPanel();
        jButtonInserirSalvar = new javax.swing.JButton();
        jButtonInserirVoltar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jLabelSituacao = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jLabelResumoTexto = new javax.swing.JLabel();
        jScrollPaneResumoTexto = new javax.swing.JScrollPane();
        jTextPaneResumoTexto = new javax.swing.JTextPane();
        jLabelAbstractTexto = new javax.swing.JLabel();
        jScrollPaneAbstractTexto = new javax.swing.JScrollPane();
        jTextPaneAbstractTexto = new javax.swing.JTextPane();
        jLabelDuracao = new javax.swing.JLabel();
        jFormattedDuracao = new javax.swing.JFormattedTextField();
        jLabelRecursos = new javax.swing.JLabel();
        jTextRecursos = new javax.swing.JTextField();
        jLabelMetodologia = new javax.swing.JLabel();
        jScrollPaneMetodologia = new javax.swing.JScrollPane();
        jTextPaneMetodologia = new javax.swing.JTextPane();
        jLabelAutor = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jTextAutor1 = new javax.swing.JTextField();
        jTextAutor2 = new javax.swing.JTextField();
        jComboBoxInserirAutor = new javax.swing.JComboBox<>();
        jPanelEditar = new javax.swing.JPanel();
        jButtonEditarSalvar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelEditarTitulo = new javax.swing.JLabel();
        jTextEditarTitulo = new javax.swing.JTextField();
        jLabelEditarSituacao = new javax.swing.JLabel();
        jComboBoxEditarSituacao = new javax.swing.JComboBox<>();
        jLabelEditarResumoTexto = new javax.swing.JLabel();
        jScrollPaneEditarResumoTexto = new javax.swing.JScrollPane();
        jTextPaneEditarResumoTexto = new javax.swing.JTextPane();
        jLabelEditarAbstractTexto = new javax.swing.JLabel();
        jScrollPaneEditarAbstractTexto = new javax.swing.JScrollPane();
        jTextPaneEditarAbstractTexto = new javax.swing.JTextPane();
        jLabelEditarDuracao = new javax.swing.JLabel();
        jFormattedEditarDuracao = new javax.swing.JFormattedTextField();
        jLabelEditarRecursos = new javax.swing.JLabel();
        jTextEditarRecursos = new javax.swing.JTextField();
        jLabelEditarMetodologia = new javax.swing.JLabel();
        jScrollPaneEditarMetodologia = new javax.swing.JScrollPane();
        jTextPaneEditarMetodologia = new javax.swing.JTextPane();
        jLabelEditarAutor = new javax.swing.JLabel();
        jTextEditarAutor = new javax.swing.JTextField();
        jTextEditarAutor1 = new javax.swing.JTextField();
        jTextEditarAutor2 = new javax.swing.JTextField();
        jComboBoxEditarAutor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMaisDetalhes.setText("Mais Detalhes");
        jButtonMaisDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisDetalhesActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Excluir");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonVoltarInicio.setText("Voltar");
        jButtonVoltarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInicioActionPerformed(evt);
            }
        });

        jListNomesMinicursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListNomesMinicursosValueChanged(evt);
            }
        });
        jScrollPaneNomesMinicursos.setViewportView(jListNomesMinicursos);

        jLabelConsultar.setText("Consultar por:");

        jComboBoxConsultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar todos", "Titulo", "Autor" }));

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonConsultaAvancada.setText("Consulta Avançada");
        jButtonConsultaAvancada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaAvancadaActionPerformed(evt);
            }
        });

        jButtonInserirMinicurso.setText("Incluir Minicurso");
        jButtonInserirMinicurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirMinicursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListarLayout = new javax.swing.GroupLayout(jPanelListar);
        jPanelListar.setLayout(jPanelListarLayout);
        jPanelListarLayout.setHorizontalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonMaisDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltarInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInserirMinicurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneNomesMinicursos)))
                    .addComponent(jTextConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addComponent(jLabelConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultaAvancada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanelListarLayout.setVerticalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultar)
                    .addComponent(jComboBoxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaAvancada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultar)
                .addGap(30, 30, 30)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButtonInserirMinicurso)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMaisDetalhes)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltarInicio))
                    .addComponent(jScrollPaneNomesMinicursos, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Lista", jPanelListar);

        jButtonInserirSalvar.setText("Salvar");
        jButtonInserirSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirSalvarActionPerformed(evt);
            }
        });

        jButtonInserirVoltar.setText("Voltar");
        jButtonInserirVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirVoltarActionPerformed(evt);
            }
        });

        jLabelTitulo.setText("Título:* ");

        jLabelSituacao.setText("Situação:*");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob avaliação", "Aprovado", "Reprovado" }));

        jLabelResumoTexto.setText("Resumo:*");

        jTextPaneResumoTexto.setName(""); // NOI18N
        jScrollPaneResumoTexto.setViewportView(jTextPaneResumoTexto);

        jLabelAbstractTexto.setText("Abstract:*");

        jScrollPaneAbstractTexto.setViewportView(jTextPaneAbstractTexto);

        jLabelDuracao.setText("Duração:*");

        try {
            jFormattedDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelRecursos.setText("Recursos:*");

        jLabelMetodologia.setText("Metodologia:*");

        jScrollPaneMetodologia.setViewportView(jTextPaneMetodologia);

        jLabelAutor.setText("Autor:*");

        jComboBoxInserirAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBoxInserirAutor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxInserirAutorItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelInserirLayout = new javax.swing.GroupLayout(jPanelInserir);
        jPanelInserir.setLayout(jPanelInserirLayout);
        jPanelInserirLayout.setHorizontalGroup(
            jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                        .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInserirLayout.createSequentialGroup()
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSituacao)
                                    .addComponent(jLabelResumoTexto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPaneResumoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelInserirLayout.createSequentialGroup()
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                                        .addComponent(jLabelAbstractTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPaneAbstractTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                                        .addComponent(jLabelTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInserirLayout.createSequentialGroup()
                                .addComponent(jLabelMetodologia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInserirLayout.createSequentialGroup()
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDuracao)
                                    .addComponent(jLabelRecursos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedDuracao)
                                    .addComponent(jTextRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelInserirLayout.createSequentialGroup()
                                .addComponent(jLabelAutor)
                                .addGap(0, 0, 0)
                                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAutor1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInserirLayout.createSequentialGroup()
                                        .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxInserirAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextAutor2, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInserirLayout.createSequentialGroup()
                        .addComponent(jButtonInserirVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInserirSalvar)))
                .addContainerGap())
        );
        jPanelInserirLayout.setVerticalGroup(
            jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInserirLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracao)
                    .addComponent(jFormattedDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSituacao)
                        .addComponent(jLabelRecursos)
                        .addComponent(jTextRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxSituacao))
                .addGap(12, 12, 12)
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMetodologia)
                    .addComponent(jLabelResumoTexto)
                    .addComponent(jScrollPaneMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneResumoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAbstractTexto)
                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                        .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAutor)
                            .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxInserirAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneAbstractTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserirSalvar)
                    .addComponent(jButtonInserirVoltar))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Adicionar", jPanelInserir);

        jButtonEditarSalvar.setText("Salvar");
        jButtonEditarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSalvarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelEditarTitulo.setText("Titulo:*");

        jLabelEditarSituacao.setText("Situação:*");

        jComboBoxEditarSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob avaliação", "Aprovado", "Reprovado" }));

        jLabelEditarResumoTexto.setText("Resumo:*");

        jTextPaneEditarResumoTexto.setMaximumSize(new java.awt.Dimension(6, 10));
        jScrollPaneEditarResumoTexto.setViewportView(jTextPaneEditarResumoTexto);

        jLabelEditarAbstractTexto.setText("Abstract:*");

        jTextPaneEditarAbstractTexto.setMaximumSize(new java.awt.Dimension(6, 20));
        jScrollPaneEditarAbstractTexto.setViewportView(jTextPaneEditarAbstractTexto);

        jLabelEditarDuracao.setText("Duração:*");

        try {
            jFormattedEditarDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelEditarRecursos.setText("Recursos:*");

        jLabelEditarMetodologia.setText("Metodologia:*");

        jTextPaneEditarMetodologia.setMaximumSize(new java.awt.Dimension(6, 20));
        jScrollPaneEditarMetodologia.setViewportView(jTextPaneEditarMetodologia);

        jLabelEditarAutor.setText("Autor:*");

        jComboBoxEditarAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBoxEditarAutor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEditarAutorItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditarLayout = new javax.swing.GroupLayout(jPanelEditar);
        jPanelEditar.setLayout(jPanelEditarLayout);
        jPanelEditarLayout.setHorizontalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addComponent(jLabelEditarSituacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEditarSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addComponent(jLabelEditarResumoTexto)
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPaneEditarResumoTexto))
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabelEditarTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextEditarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabelEditarAbstractTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPaneEditarAbstractTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addComponent(jLabelEditarDuracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedEditarDuracao))
                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabelEditarAutor)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                                .addComponent(jTextEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelEditarLayout.createSequentialGroup()
                                                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextEditarAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextEditarAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(4, 4, 4))))
                                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabelEditarRecursos)
                                        .addGap(8, 8, 8)
                                        .addComponent(jTextEditarRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabelEditarMetodologia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPaneEditarMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarSalvar)))
                .addContainerGap())
        );
        jPanelEditarLayout.setVerticalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarTitulo)
                    .addComponent(jTextEditarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarDuracao)
                    .addComponent(jFormattedEditarDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarSituacao)
                    .addComponent(jComboBoxEditarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarRecursos)
                    .addComponent(jTextEditarRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEditarResumoTexto)
                    .addComponent(jLabelEditarMetodologia)
                    .addComponent(jScrollPaneEditarMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneEditarResumoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditarAbstractTexto)
                    .addComponent(jScrollPaneEditarAbstractTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEditarAutor)
                            .addComponent(jComboBoxEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jTextEditarAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextEditarAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonEditarSalvar))
                .addContainerGap())
        );

        jTabShortCourse.addTab("Editar", jPanelEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabShortCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabShortCourse)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirVoltarActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(0);
        jTabShortCourse.setEnabledAt(0, true);
        jTabShortCourse.setEnabledAt(1, false);

    }//GEN-LAST:event_jButtonInserirVoltarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(0);
        jTabShortCourse.setEnabledAt(0, true);
        jTabShortCourse.setEnabledAt(1, false);
        jTabShortCourse.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonVoltarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInicioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Inicial back = new Inicial();
        back.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarInicioActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        editar(jListNomesMinicursos);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonInserirSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextTitulo.getText().trim().equals("") || jTextPaneResumoTexto.getText().trim().equals("") || jTextPaneAbstractTexto.getText().trim().equals("") || jFormattedDuracao.getText().equals("  :  :  ") || jTextRecursos.getText().trim().equals("") || jTextPaneMetodologia.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de todos campos obrigatórios(*) para efetuar a inserção de um minicurso.");
        } else if (jTextAutor.getText().trim().equals("") && jTextAutor1.getText().trim().equals("") && jTextAutor2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de no mínimo um autor para efetuar a inserção de um minicurso.");
        }else if(verificarDuracao(jFormattedDuracao.getText())){
            JOptionPane.showMessageDialog(null, "Duração inválida");
        } else {
            ArrayList<String>nomeAutores = new ArrayList<>();
            int duracao;
            duracao = converterStringEmNumero(jFormattedDuracao.getText());

            if(!(jTextAutor.getText().trim().equals(""))){
                nomeAutores.add(jTextAutor.getText().trim());
            }            
            if(!(jTextAutor1.getText().trim().equals(""))){
                nomeAutores.add(jTextAutor1.getText().trim());
            }            
            if(!(jTextAutor2.getText().trim().equals(""))){
                nomeAutores.add(jTextAutor2.getText().trim());
            }
            
            Minicurso novoMinicurso = new Minicurso(jTextTitulo.getText().trim(),
                    //jComboBoxSituacao.getSelectedItem().toString(), 
                    jTextPaneResumoTexto.getText().trim(),
                    jTextPaneAbstractTexto.getText().trim(),
                    duracao, jTextRecursos.getText().trim(),
                    jTextPaneMetodologia.getText().trim(), nomeAutores);
            
            MinicursoCRUD.incluir(novoMinicurso);
            
            jTextTitulo.setText("");
            jComboBoxSituacao.setSelectedIndex(0);
            jTextPaneResumoTexto.setText("");
            jTextPaneAbstractTexto.setText("");
            jFormattedDuracao.setText("");
            jTextRecursos.setText("");
            jTextPaneMetodologia.setText("");
            jTextAutor.setText("");
            jTextAutor1.setText("");
            jTextAutor2.setText("");
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
            visualizarLista = MinicursoCRUD.consultar("", "");
            visualizarLista();

        }
    }//GEN-LAST:event_jButtonInserirSalvarActionPerformed

    private void jButtonEditarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextEditarTitulo.getText().trim().equals("") || jTextPaneEditarResumoTexto.getText().trim().equals("") || jTextPaneEditarAbstractTexto.getText().trim().equals("") || jFormattedEditarDuracao.getText().equals("  :  :  ") || jTextEditarRecursos.getText().trim().equals("") || jTextPaneEditarMetodologia.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de todos campos obrigatórios(*) para efetuar a edição de um minicurso.");
        } else if (jTextEditarAutor.getText().trim().equals("") && jTextEditarAutor1.getText().trim().equals("") && jTextEditarAutor2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de no mínimo um autor para efetuar a edição de um minicurso.");
        } else if(verificarDuracao(jFormattedEditarDuracao.getText())){
            JOptionPane.showMessageDialog(null, "Duração inválida.");
        }else{
            int duracao;
            duracao = converterStringEmNumero(jFormattedEditarDuracao.getText());
            ArrayList<String> nomeAutoresEdit = new ArrayList<>();
            
            if(!(jTextEditarAutor.getText().trim().equals(""))){
                nomeAutoresEdit.add(jTextEditarAutor.getText().trim());
            }            
            if(!(jTextEditarAutor1.getText().trim().equals(""))){
                nomeAutoresEdit.add(jTextEditarAutor1.getText().trim());
            }            
            if(!(jTextEditarAutor2.getText().trim().equals(""))){
                nomeAutoresEdit.add(jTextEditarAutor2.getText());
            }
            
            
            MinicursoCRUD editar = new MinicursoCRUD();
            editar.editar(nomeEditar, jTextEditarTitulo.getText(),
                  //  jComboBoxEditarSituacao.getSelectedItem().toString(),
                    jTextPaneEditarResumoTexto.getText(),
                    jTextPaneEditarAbstractTexto.getText(), duracao,
                    jTextEditarRecursos.getText(), jTextPaneEditarMetodologia.getText(),
                    nomeAutoresEdit);

            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
            
            visualizarLista = MinicursoCRUD.consultar("","");
            visualizarLista();
            
            jTabShortCourse.setSelectedIndex(0);
            jTabShortCourse.setEnabledAt(0, true);
            jTabShortCourse.setEnabledAt(1, false);
            jTabShortCourse.setEnabledAt(2, false);
        }
    }//GEN-LAST:event_jButtonEditarSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        deletar(jListNomesMinicursos.getSelectedValue().toString());
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jListNomesMinicursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListNomesMinicursosValueChanged
        // TODO add your handling code here:
        if (jListNomesMinicursos.isSelectionEmpty()) {
            jButtonEditar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jButtonMaisDetalhes.setEnabled(false);
        } else {
            jButtonEditar.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            jButtonMaisDetalhes.setEnabled(true);
        }
    }//GEN-LAST:event_jListNomesMinicursosValueChanged

    private void jComboBoxInserirAutorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxInserirAutorItemStateChanged
        // TODO add your handling code here:
        switch (jComboBoxInserirAutor.getSelectedItem().toString()) {
            case "1":
                jTextAutor.setEnabled(true);
                jTextAutor1.setEnabled(false);
                jTextAutor2.setEnabled(false);
                break;
            case "2":
                jTextAutor.setEnabled(true);
                jTextAutor1.setEnabled(true);
                jTextAutor2.setEnabled(false);
                break;
            case "3":
                jTextAutor.setEnabled(true);
                jTextAutor1.setEnabled(true);
                jTextAutor2.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jComboBoxInserirAutorItemStateChanged

    private void jComboBoxEditarAutorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEditarAutorItemStateChanged
        // TODO add your handling code here:
        switch (jComboBoxEditarAutor.getSelectedItem().toString()) {
            case "1":
                jTextEditarAutor.setEnabled(true);
                jTextEditarAutor1.setEnabled(false);
                jTextEditarAutor2.setEnabled(false);
                break;
            case "2":
                jTextEditarAutor.setEnabled(true);
                jTextEditarAutor1.setEnabled(true);
                jTextEditarAutor2.setEnabled(false);
                break;
            case "3":
                jTextEditarAutor.setEnabled(true);
                jTextEditarAutor1.setEnabled(true);
                jTextEditarAutor2.setEnabled(true);
                break;

        }
    }//GEN-LAST:event_jComboBoxEditarAutorItemStateChanged

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        if (jComboBoxConsultar.getSelectedIndex() != 0 && jTextConsultar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento do campo para este tipo de consulta.");
        } else {
            visualizarLista = MinicursoCRUD.consultar(jComboBoxConsultar.getSelectedItem().toString(), jTextConsultar.getText());
            visualizarLista();
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonMaisDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisDetalhesActionPerformed
        // TODO add your handling code here:
        maisDetalhes(jListNomesMinicursos.getSelectedValue());
    }//GEN-LAST:event_jButtonMaisDetalhesActionPerformed

    private void jButtonConsultaAvancadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaAvancadaActionPerformed
        // TODO add your handling code here:
        FrameMinicursoConsultaAvancada consultaAvancada = new FrameMinicursoConsultaAvancada(jListNomesMinicursos);
        consultaAvancada.setVisible(true);
    }//GEN-LAST:event_jButtonConsultaAvancadaActionPerformed

    private void jButtonInserirMinicursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirMinicursoActionPerformed
        // TODO add your handling code here:
        jTabShortCourse.setSelectedIndex(1);
        jTabShortCourse.setEnabledAt(1, true);
        jTabShortCourse.setEnabledAt(0, false);
    }//GEN-LAST:event_jButtonInserirMinicursoActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For detalhes see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMinicurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMinicurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMinicurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMinicurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMinicurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultaAvancada;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEditarSalvar;
    private javax.swing.JButton jButtonInserirMinicurso;
    private javax.swing.JButton jButtonInserirSalvar;
    private javax.swing.JButton jButtonInserirVoltar;
    private javax.swing.JButton jButtonMaisDetalhes;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarInicio;
    private javax.swing.JComboBox<String> jComboBoxConsultar;
    private javax.swing.JComboBox<String> jComboBoxEditarAutor;
    private javax.swing.JComboBox<String> jComboBoxEditarSituacao;
    private javax.swing.JComboBox<String> jComboBoxInserirAutor;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedDuracao;
    private javax.swing.JFormattedTextField jFormattedEditarDuracao;
    private javax.swing.JLabel jLabelAbstractTexto;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelConsultar;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelEditarAbstractTexto;
    private javax.swing.JLabel jLabelEditarAutor;
    private javax.swing.JLabel jLabelEditarDuracao;
    private javax.swing.JLabel jLabelEditarMetodologia;
    private javax.swing.JLabel jLabelEditarRecursos;
    private javax.swing.JLabel jLabelEditarResumoTexto;
    private javax.swing.JLabel jLabelEditarSituacao;
    private javax.swing.JLabel jLabelEditarTitulo;
    private javax.swing.JLabel jLabelMetodologia;
    private javax.swing.JLabel jLabelRecursos;
    private javax.swing.JLabel jLabelResumoTexto;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListNomesMinicursos;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelInserir;
    private javax.swing.JPanel jPanelListar;
    private javax.swing.JScrollPane jScrollPaneAbstractTexto;
    private javax.swing.JScrollPane jScrollPaneEditarAbstractTexto;
    private javax.swing.JScrollPane jScrollPaneEditarMetodologia;
    private javax.swing.JScrollPane jScrollPaneEditarResumoTexto;
    private javax.swing.JScrollPane jScrollPaneMetodologia;
    private javax.swing.JScrollPane jScrollPaneNomesMinicursos;
    private javax.swing.JScrollPane jScrollPaneResumoTexto;
    private javax.swing.JTabbedPane jTabShortCourse;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextAutor1;
    private javax.swing.JTextField jTextAutor2;
    private javax.swing.JTextField jTextConsultar;
    private javax.swing.JTextField jTextEditarAutor;
    private javax.swing.JTextField jTextEditarAutor1;
    private javax.swing.JTextField jTextEditarAutor2;
    private javax.swing.JTextField jTextEditarRecursos;
    private javax.swing.JTextField jTextEditarTitulo;
    private javax.swing.JTextPane jTextPaneAbstractTexto;
    private javax.swing.JTextPane jTextPaneEditarAbstractTexto;
    private javax.swing.JTextPane jTextPaneEditarMetodologia;
    private javax.swing.JTextPane jTextPaneEditarResumoTexto;
    private javax.swing.JTextPane jTextPaneMetodologia;
    private javax.swing.JTextPane jTextPaneResumoTexto;
    private javax.swing.JTextField jTextRecursos;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
