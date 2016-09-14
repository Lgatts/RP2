/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import categorias.Resumo;
import categorias.Situacao;
import categorias.Submissao;
//import cruds.ResumoCrud;
import cruds.SubmissaoCrud;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author junio
 */
public class FrameResumo extends javax.swing.JFrame {

    private List<Resumo> pesquisarLista;
    private List<String> visualizarLista;
    private int operacao;
    private List<String> autores = new ArrayList();
    private List<String> instituicoes = new ArrayList();
    private List<String> palavrasChave = new ArrayList();
    private String nomePreencher;
    private SubmissaoCrud resumoCrud= new SubmissaoCrud("Resumos");
    private List<SubmissaoCrud> submissaoLista;
    private List<Submissao> resumos;

    /**
     * Creates new form ResumoFrame
     */
    public FrameResumo(List<SubmissaoCrud> submissaoLista) {
        this.submissaoLista = submissaoLista;
        for(SubmissaoCrud crud: submissaoLista){
            if(crud.getTipoSubmissao().equalsIgnoreCase("Resumos")){
                resumoCrud = crud;
            }
        }
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RP - Resumos");

        jButtonEditar.setEnabled(false);
        jButtonMaisDetalhes.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        jTabbedPaneResumos.setEnabledAt(0, true);
        jTabbedPaneResumos.setEnabledAt(1, false);
        jTabbedPaneResumos.setEnabledAt(2, false);
        jTabbedPaneResumos.setEnabledAt(3, false);
        jTabbedPaneResumos.setEnabledAt(4, false);
    }


    
    /**
     * Método para ativar todos os campos quando necessário
     */
    private void ativarCampos() {
        jTextFieldInserirTitulo.setEnabled(true);

        jTextFieldAutor.setEnabled(true);
        jTextFieldAutor1.setEnabled(true);
        jTextFieldAutor2.setEnabled(true);
        jTextFieldAutor3.setEnabled(true);
        jTextFieldAutor4.setEnabled(true);
        jTextFieldAutor5.setEnabled(true);
        jTextFieldAutor6.setEnabled(true);
        jTextFieldAutor7.setEnabled(true);

        jTextFieldInstituicao.setEnabled(true);
        jTextFieldInstituicao1.setEnabled(true);
        jTextFieldInstituicao2.setEnabled(true);
        jTextFieldInstituicao3.setEnabled(true);
        jTextFieldInstituicao4.setEnabled(true);
        jTextFieldInstituicao5.setEnabled(true);
        jTextFieldInstituicao6.setEnabled(true);
        jTextFieldInstituicao7.setEnabled(true);

        jTextFieldPalavraChave.setEnabled(true);
        jTextFieldPalavraChave1.setEnabled(true);
        jTextFieldPalavraChave2.setEnabled(true);
        jTextFieldPalavraChave3.setEnabled(true);

        jButtonSalvarAutores.setVisible(true);
        jButtonSalvarInstituicoes.setVisible(true);
        jButtonSalvarPalavrasChaves.setVisible(true);
        jButtonSalvarInserir.setVisible(true);

    }

    /**
     * Método para desativar todos os campos quando necessário
     */
    private void desativarCampos() {
        jTextFieldInserirTitulo.setEnabled(false);

        jTextFieldAutor.setEnabled(false);
        jTextFieldAutor1.setEnabled(false);
        jTextFieldAutor2.setEnabled(false);
        jTextFieldAutor3.setEnabled(false);
        jTextFieldAutor4.setEnabled(false);
        jTextFieldAutor5.setEnabled(false);
        jTextFieldAutor6.setEnabled(false);
        jTextFieldAutor7.setEnabled(false);

        jTextFieldInstituicao.setEnabled(false);
        jTextFieldInstituicao1.setEnabled(false);
        jTextFieldInstituicao2.setEnabled(false);
        jTextFieldInstituicao3.setEnabled(false);
        jTextFieldInstituicao4.setEnabled(false);
        jTextFieldInstituicao5.setEnabled(false);
        jTextFieldInstituicao6.setEnabled(false);
        jTextFieldInstituicao7.setEnabled(false);

        jTextFieldPalavraChave.setEnabled(false);
        jTextFieldPalavraChave1.setEnabled(false);
        jTextFieldPalavraChave2.setEnabled(false);
        jTextFieldPalavraChave3.setEnabled(false);

        jButtonSalvarAutores.setVisible(false);
        jButtonSalvarInstituicoes.setVisible(false);
        jButtonSalvarPalavrasChaves.setVisible(false);
        jButtonSalvarInserir.setVisible(false);

    }

    /**
     * Metodo para mostrar os títulos dos resumos na lista
     */
    private void listar() {

        DefaultListModel mLista = new DefaultListModel();
        
        for (Submissao elemento : resumos) {
            mLista.addElement(elemento.getTituloSubmissao());
        }

        jListListarResumos.setModel(mLista);

    }

    /**
     * Método para limpar os campos sempre.
     */
    private void limparCampos() {
        
            this.autores = new ArrayList();
        
            this.instituicoes = new ArrayList();
        
            this.palavrasChave = new ArrayList();

        jTextFieldInserirTitulo.setText("");

        jComboBoxSituacao.setSelectedIndex(0);

        jTextFieldAutor.setText("");
        jTextFieldAutor1.setText("");
        jTextFieldAutor2.setText("");
        jTextFieldAutor3.setText("");
        jTextFieldAutor4.setText("");
        jTextFieldAutor5.setText("");
        jTextFieldAutor6.setText("");
        jTextFieldAutor7.setText("");

        jTextFieldInstituicao.setText("");
        jTextFieldInstituicao1.setText("");
        jTextFieldInstituicao2.setText("");
        jTextFieldInstituicao3.setText("");
        jTextFieldInstituicao4.setText("");
        jTextFieldInstituicao5.setText("");
        jTextFieldInstituicao6.setText("");
        jTextFieldInstituicao7.setText("");

        jTextFieldPalavraChave.setText("");
        jTextFieldPalavraChave1.setText("");
        jTextFieldPalavraChave2.setText("");
        jTextFieldPalavraChave3.setText("");

    }

    /**
     * Método para preencher os campos, tanto para editar para visualizar mais
     * detalhes
     */
    private void preencherCampos() {
        nomePreencher = jListListarResumos.getSelectedValue();

        for (Submissao submissoes : resumos) {
            if (nomePreencher.equals(submissoes.getTituloSubmissao())) {
               Resumo novoResumo = (Resumo) submissoes;
                jTextFieldInserirTitulo.setText(novoResumo.getTituloSubmissao());

                /*for (int i = 0; i < jComboBoxSituacao.getItemCount(); i++) {
                    if (resumo.getSituacao().equals(jComboBoxSituacao.getItemAt(i))) {
                        jComboBoxSituacao.setSelectedIndex(i);
                        break;
                    }
                }*/

                //lista.get(2)
                jComboBoxSituacao.setSelectedItem(novoResumo.getSituacaoSubmissao().getSituacao());
                
                this.autores = novoResumo.getAutores();
                switch (autores.size()) {
                    case 1:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        break;
                    case 2:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        break;
                    case 3:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        break;
                    case 4:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        jTextFieldAutor3.setText(novoResumo.getAutores().get(3));
                        break;
                    case 5:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        jTextFieldAutor3.setText(novoResumo.getAutores().get(3));
                        jTextFieldAutor4.setText(novoResumo.getAutores().get(4));
                        break;
                    case 6:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        jTextFieldAutor3.setText(novoResumo.getAutores().get(3));
                        jTextFieldAutor4.setText(novoResumo.getAutores().get(4));
                        jTextFieldAutor5.setText(novoResumo.getAutores().get(5));
                        break;
                    case 7:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        jTextFieldAutor3.setText(novoResumo.getAutores().get(3));
                        jTextFieldAutor4.setText(novoResumo.getAutores().get(4));
                        jTextFieldAutor5.setText(novoResumo.getAutores().get(5));
                        jTextFieldAutor6.setText(novoResumo.getAutores().get(6));
                        break;
                    default:
                        jTextFieldAutor.setText(novoResumo.getAutores().get(0));
                        jTextFieldAutor1.setText(novoResumo.getAutores().get(1));
                        jTextFieldAutor2.setText(novoResumo.getAutores().get(2));
                        jTextFieldAutor3.setText(novoResumo.getAutores().get(3));
                        jTextFieldAutor4.setText(novoResumo.getAutores().get(4));
                        jTextFieldAutor5.setText(novoResumo.getAutores().get(5));
                        jTextFieldAutor6.setText(novoResumo.getAutores().get(6));
                        jTextFieldAutor7.setText(novoResumo.getAutores().get(7));
                        break;
                }
     
                
                this.instituicoes = novoResumo.getInstituicao();
                switch (instituicoes.size()) {
                    case 1:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        break;
                    case 2:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        break;
                    case 3:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        break;
                    case 4:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        jTextFieldInstituicao3.setText(novoResumo.getAutores().get(3));
                        break;
                    case 5:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        jTextFieldInstituicao3.setText(novoResumo.getAutores().get(3));
                        jTextFieldInstituicao4.setText(novoResumo.getAutores().get(4));
                        break;
                    case 6:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        jTextFieldInstituicao3.setText(novoResumo.getAutores().get(3));
                        jTextFieldInstituicao4.setText(novoResumo.getAutores().get(4));
                        jTextFieldInstituicao5.setText(novoResumo.getAutores().get(5));
                        break;
                    case 7:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        jTextFieldInstituicao3.setText(novoResumo.getAutores().get(3));
                        jTextFieldInstituicao4.setText(novoResumo.getAutores().get(4));
                        jTextFieldInstituicao5.setText(novoResumo.getAutores().get(5));
                        jTextFieldInstituicao6.setText(novoResumo.getAutores().get(6));
                        break;
                    default:
                        jTextFieldInstituicao.setText(novoResumo.getAutores().get(0));
                        jTextFieldInstituicao1.setText(novoResumo.getAutores().get(1));
                        jTextFieldInstituicao2.setText(novoResumo.getAutores().get(2));
                        jTextFieldInstituicao3.setText(novoResumo.getAutores().get(3));
                        jTextFieldInstituicao4.setText(novoResumo.getAutores().get(4));
                        jTextFieldInstituicao5.setText(novoResumo.getAutores().get(5));
                        jTextFieldInstituicao6.setText(novoResumo.getAutores().get(6));
                        jTextFieldInstituicao7.setText(novoResumo.getAutores().get(7));
                        break;
                }
                
                
                this.palavrasChave = novoResumo.getPalavraChave();
                switch (palavrasChave.size()) {
                    case 1:
                        jTextFieldPalavraChave.setText(novoResumo.getPalavraChave().get(0));
                        break;
                    case 2:
                        jTextFieldPalavraChave.setText(novoResumo.getPalavraChave().get(0));
                        jTextFieldPalavraChave1.setText(novoResumo.getPalavraChave().get(1));
                        break;
                    case 3:
                        jTextFieldPalavraChave.setText(novoResumo.getPalavraChave().get(0));
                        jTextFieldPalavraChave1.setText(novoResumo.getPalavraChave().get(1));
                        jTextFieldPalavraChave2.setText(novoResumo.getPalavraChave().get(2));
                        break;
                    default:
                        jTextFieldPalavraChave.setText(novoResumo.getPalavraChave().get(0));
                        jTextFieldPalavraChave1.setText(novoResumo.getPalavraChave().get(1));
                        jTextFieldPalavraChave2.setText(novoResumo.getPalavraChave().get(2));
                        jTextFieldPalavraChave3.setText(novoResumo.getPalavraChave().get(3));
                        break;
                }
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

        jTabbedPaneResumos = new javax.swing.JTabbedPane();
        jPanelResumo = new javax.swing.JPanel();
        jTextConsultarResumo = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JToggleButton();
        jScrollPaneListaResumos = new javax.swing.JScrollPane();
        jListListarResumos = new javax.swing.JList<>();
        jButtonMaisDetalhes = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jComboBoxConsulta = new javax.swing.JComboBox<>();
        jPanelInserirResumo = new javax.swing.JPanel();
        jLabelInserirTitulo = new javax.swing.JLabel();
        jTextFieldInserirTitulo = new javax.swing.JTextField();
        jLabelInserirSituacao = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jButtonAutores = new javax.swing.JToggleButton();
        jButtonInstituicoes = new javax.swing.JToggleButton();
        jButtonPalavraChave = new javax.swing.JToggleButton();
        jButtonSalvarInserir = new javax.swing.JToggleButton();
        jButtonVoltarInserir = new javax.swing.JButton();
        jPanelAutores = new javax.swing.JPanel();
        jButtonSalvarAutores = new javax.swing.JButton();
        jLabelAutores = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldAutor1 = new javax.swing.JTextField();
        jTextFieldAutor2 = new javax.swing.JTextField();
        jTextFieldAutor3 = new javax.swing.JTextField();
        jTextFieldAutor4 = new javax.swing.JTextField();
        jTextFieldAutor5 = new javax.swing.JTextField();
        jTextFieldAutor6 = new javax.swing.JTextField();
        jTextFieldAutor7 = new javax.swing.JTextField();
        jButtonVoltarAutores = new javax.swing.JButton();
        jPanelInstituicoes = new javax.swing.JPanel();
        jLabelInstituicoes = new javax.swing.JLabel();
        jButtonSalvarInstituicoes = new javax.swing.JButton();
        jButtonVoltarInstituicoes = new javax.swing.JButton();
        jTextFieldInstituicao = new javax.swing.JTextField();
        jTextFieldInstituicao1 = new javax.swing.JTextField();
        jTextFieldInstituicao2 = new javax.swing.JTextField();
        jTextFieldInstituicao3 = new javax.swing.JTextField();
        jTextFieldInstituicao4 = new javax.swing.JTextField();
        jTextFieldInstituicao5 = new javax.swing.JTextField();
        jTextFieldInstituicao6 = new javax.swing.JTextField();
        jTextFieldInstituicao7 = new javax.swing.JTextField();
        jPanelPalavrasChaves = new javax.swing.JPanel();
        jLabelPalavrasChaves = new javax.swing.JLabel();
        jButtonSalvarPalavrasChaves = new javax.swing.JButton();
        jButtonVoltarPalavrasChaves = new javax.swing.JButton();
        jTextFieldPalavraChave = new javax.swing.JTextField();
        jTextFieldPalavraChave1 = new javax.swing.JTextField();
        jTextFieldPalavraChave2 = new javax.swing.JTextField();
        jTextFieldPalavraChave3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jListListarResumos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListListarResumosValueChanged(evt);
            }
        });
        jScrollPaneListaResumos.setViewportView(jListListarResumos);

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

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir resumo");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jComboBoxConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Autor" }));

        javax.swing.GroupLayout jPanelResumoLayout = new javax.swing.GroupLayout(jPanelResumo);
        jPanelResumo.setLayout(jPanelResumoLayout);
        jPanelResumoLayout.setHorizontalGroup(
            jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResumoLayout.createSequentialGroup()
                        .addComponent(jComboBoxConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextConsultarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar))
                    .addGroup(jPanelResumoLayout.createSequentialGroup()
                        .addGroup(jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMaisDetalhes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPaneListaResumos, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelResumoLayout.setVerticalGroup(
            jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextConsultarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResumoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPaneListaResumos))
                    .addGroup(jPanelResumoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMaisDetalhes)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar)))
                .addContainerGap())
        );

        jTabbedPaneResumos.addTab("Consultar", jPanelResumo);

        jLabelInserirTitulo.setText("Titulo:*");

        jTextFieldInserirTitulo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelInserirSituacao.setText("Situação:*");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sob avaliação", "Aprovado", "Reprovado" }));
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

        jButtonInstituicoes.setText("Instituição");
        jButtonInstituicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstituicoesActionPerformed(evt);
            }
        });

        jButtonPalavraChave.setText("Palavras-chaves");
        jButtonPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPalavraChaveActionPerformed(evt);
            }
        });

        jButtonSalvarInserir.setText("Salvar");
        jButtonSalvarInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarInserirActionPerformed(evt);
            }
        });

        jButtonVoltarInserir.setText("Voltar");
        jButtonVoltarInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInserirResumoLayout = new javax.swing.GroupLayout(jPanelInserirResumo);
        jPanelInserirResumo.setLayout(jPanelInserirResumoLayout);
        jPanelInserirResumoLayout.setHorizontalGroup(
            jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInserirResumoLayout.createSequentialGroup()
                        .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelInserirSituacao)
                            .addComponent(jLabelInserirTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPalavraChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldInserirTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jComboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInstituicoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInserirResumoLayout.createSequentialGroup()
                        .addComponent(jButtonVoltarInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelInserirResumoLayout.setVerticalGroup(
            jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInserirTitulo)
                    .addComponent(jTextFieldInserirTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInserirSituacao)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAutores)
                .addGap(18, 18, 18)
                .addComponent(jButtonInstituicoes)
                .addGap(18, 18, 18)
                .addComponent(jButtonPalavraChave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanelInserirResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarInserir)
                    .addComponent(jButtonVoltarInserir))
                .addContainerGap())
        );

        jTabbedPaneResumos.addTab("Operações", jPanelInserirResumo);

        jButtonSalvarAutores.setText("Salvar");
        jButtonSalvarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAutoresActionPerformed(evt);
            }
        });

        jLabelAutores.setText("Autores:*");

        jTextFieldAutor.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor1.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor2.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor3.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor4.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor5.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor6.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldAutor7.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jButtonVoltarAutores.setText("Voltar");
        jButtonVoltarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAutoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAutoresLayout = new javax.swing.GroupLayout(jPanelAutores);
        jPanelAutores.setLayout(jPanelAutoresLayout);
        jPanelAutoresLayout.setHorizontalGroup(
            jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutoresLayout.createSequentialGroup()
                        .addComponent(jLabelAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAutor7, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jTextFieldAutor6)
                            .addComponent(jTextFieldAutor5)
                            .addComponent(jTextFieldAutor4)
                            .addComponent(jTextFieldAutor3)
                            .addComponent(jTextFieldAutor2)
                            .addComponent(jTextFieldAutor1)
                            .addComponent(jTextFieldAutor)))
                    .addComponent(jButtonVoltarAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonSalvarAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAutoresLayout.setVerticalGroup(
            jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAutoresLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutores)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAutor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAutor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarAutores)
                    .addComponent(jButtonSalvarAutores))
                .addContainerGap())
        );

        jTabbedPaneResumos.addTab("Autores", jPanelAutores);

        jLabelInstituicoes.setText("Instituições:*");

        jButtonSalvarInstituicoes.setText("Salvar");
        jButtonSalvarInstituicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarInstituicoesActionPerformed(evt);
            }
        });

        jButtonVoltarInstituicoes.setText("Voltar");
        jButtonVoltarInstituicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInstituicoesActionPerformed(evt);
            }
        });

        jTextFieldInstituicao.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao1.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao2.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao3.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao4.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao5.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao6.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldInstituicao7.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelInstituicoesLayout = new javax.swing.GroupLayout(jPanelInstituicoes);
        jPanelInstituicoes.setLayout(jPanelInstituicoesLayout);
        jPanelInstituicoesLayout.setHorizontalGroup(
            jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstituicoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInstituicoesLayout.createSequentialGroup()
                        .addComponent(jButtonVoltarInstituicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarInstituicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInstituicoesLayout.createSequentialGroup()
                        .addComponent(jLabelInstituicoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldInstituicao6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstituicao7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInstituicoesLayout.setVerticalGroup(
            jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstituicoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstituicoes)
                    .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldInstituicao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldInstituicao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldInstituicao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldInstituicao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jTextFieldInstituicao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldInstituicao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldInstituicao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelInstituicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarInstituicoes)
                    .addComponent(jButtonVoltarInstituicoes))
                .addContainerGap())
        );

        jTabbedPaneResumos.addTab("Instituições", jPanelInstituicoes);

        jLabelPalavrasChaves.setText("Palavas-chaves:*");

        jButtonSalvarPalavrasChaves.setText("Salvar");
        jButtonSalvarPalavrasChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPalavrasChavesActionPerformed(evt);
            }
        });

        jButtonVoltarPalavrasChaves.setText("Voltar");
        jButtonVoltarPalavrasChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarPalavrasChavesActionPerformed(evt);
            }
        });

        jTextFieldPalavraChave.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldPalavraChave1.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldPalavraChave2.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldPalavraChave3.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelPalavrasChavesLayout = new javax.swing.GroupLayout(jPanelPalavrasChaves);
        jPanelPalavrasChaves.setLayout(jPanelPalavrasChavesLayout);
        jPanelPalavrasChavesLayout.setHorizontalGroup(
            jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPalavrasChavesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPalavrasChavesLayout.createSequentialGroup()
                        .addComponent(jButtonVoltarPalavrasChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarPalavrasChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPalavrasChavesLayout.createSequentialGroup()
                        .addGroup(jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPalavrasChavesLayout.createSequentialGroup()
                                .addComponent(jLabelPalavrasChaves)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPalavrasChavesLayout.setVerticalGroup(
            jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPalavrasChavesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPalavrasChaves)
                    .addComponent(jTextFieldPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPalavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPalavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPalavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(jPanelPalavrasChavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarPalavrasChaves)
                    .addComponent(jButtonVoltarPalavrasChaves))
                .addContainerGap())
        );

        jTabbedPaneResumos.addTab("Palavras-Chaves", jPanelPalavrasChaves);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneResumos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneResumos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutoresActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(2);
        jTabbedPaneResumos.setEnabledAt(1, false);
        jTabbedPaneResumos.setEnabledAt(2, true);
    }//GEN-LAST:event_jButtonAutoresActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        switch (jComboBoxConsulta.getSelectedItem().toString()) {
            case "Autor":
                this.resumos = this.resumoCrud.consultarAutor(jTextConsultarResumo.getText());
                listar();
                break;
            case "Título":
                this.resumos = this.resumoCrud.consultarTitulo(jTextConsultarResumo.getText());
                listar();
                break;
            default:
                this.resumos = this.resumoCrud.getListaSubmissao();
                listar();
                break;
        }
     
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonInstituicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstituicoesActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(3);
        jTabbedPaneResumos.setEnabledAt(1, false);
        jTabbedPaneResumos.setEnabledAt(3, true);

    }//GEN-LAST:event_jButtonInstituicoesActionPerformed

    private void jButtonPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPalavraChaveActionPerformed
        // TODO add your handling code here
        jTabbedPaneResumos.setSelectedIndex(4);
        jTabbedPaneResumos.setEnabledAt(1, false);
        jTabbedPaneResumos.setEnabledAt(4, true);
    }//GEN-LAST:event_jButtonPalavraChaveActionPerformed

    private void jButtonSalvarInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarInserirActionPerformed
        // TODO add your handling code here
        boolean autores = false;
        boolean palavraChaves = false;
        boolean instituicoes = false;
        
        if (!this.autores.isEmpty()) {
            autores = true;
        }

        
        if (!this.instituicoes.isEmpty()) {
            instituicoes = true;
        }

        if (!this.palavrasChave.isEmpty()) {
            palavraChaves = true;
        }

        if (jTextFieldInserirTitulo.getText().trim().equals("") || autores == false || palavraChaves == false
                || instituicoes == false) {
            JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos e inserir ao"
                    + " menos um autor, uma instituição e uma palavra-chave");
        } else if (operacao == 1) {
                
            Resumo novoResumo = new Resumo(jTextFieldInserirTitulo.getText(), 
                    Situacao.verificarSituacao(jComboBoxSituacao.getSelectedItem().toString()) ,
                    this.autores,this.instituicoes, this.palavrasChave);
            this.resumoCrud.incluir(novoResumo);
            
            limparCampos();
            
        } else if (operacao == 2) {
            Resumo r = new Resumo(jTextFieldInserirTitulo.getText(), 
                    Situacao.verificarSituacao(jComboBoxSituacao.getSelectedItem().toString()), 
                    this.instituicoes, this.palavrasChave, this.autores);
            
            resumoCrud.editar(nomePreencher, r);
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
            this.resumos = this.resumoCrud.getListaSubmissao();
            listar();
            limparCampos();
        }
        
    }//GEN-LAST:event_jButtonSalvarInserirActionPerformed

    private void jButtonMaisDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisDetalhesActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(0, false);
        jTabbedPaneResumos.setEnabledAt(1, true);
        desativarCampos();
        nomePreencher = jListListarResumos.getSelectedValue();
        preencherCampos();

    }//GEN-LAST:event_jButtonMaisDetalhesActionPerformed

    private void jButtonVoltarInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInserirActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(0);
        jTabbedPaneResumos.setEnabledAt(0, true);
        jTabbedPaneResumos.setEnabledAt(1, false);
        limparCampos();
    }//GEN-LAST:event_jButtonVoltarInserirActionPerformed

    private void jButtonSalvarPalavrasChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPalavrasChavesActionPerformed
        // TODO add your handling code here:
        if (jTextFieldPalavraChave.getText().trim().equals("") && jTextFieldPalavraChave1.getText().trim().equals("")
                && jTextFieldPalavraChave2.getText().trim().equals("") && jTextFieldPalavraChave3.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário a inserção de ao menos uma Instituição para continuar");
        } else {
         
            if (!jTextFieldPalavraChave.getText().trim().equals(""))
                palavrasChave.add(jTextFieldPalavraChave.getText());
            if (!jTextFieldPalavraChave1.getText().trim().equals(""))
                palavrasChave.add(jTextFieldPalavraChave1.getText());
            if (!jTextFieldPalavraChave2.getText().trim().equals(""))
                palavrasChave.add(jTextFieldPalavraChave2.getText());
            if (!jTextFieldPalavraChave3.getText().trim().equals(""))
                palavrasChave.add(jTextFieldPalavraChave3.getText());
            
            
            jTabbedPaneResumos.setSelectedIndex(1);
            jTabbedPaneResumos.setEnabledAt(1, true);
            jTabbedPaneResumos.setEnabledAt(4, false);

        }
    }//GEN-LAST:event_jButtonSalvarPalavrasChavesActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        new Inicial(this.submissaoLista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(0, false);
        jTabbedPaneResumos.setEnabledAt(1, true);

        operacao = 1; // Define se vai fazer edição ou inclusão
        ativarCampos();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(0, false);
        jTabbedPaneResumos.setEnabledAt(1, true);
       
        operacao = 2; // Define inclusão ou edição
        nomePreencher = jListListarResumos.getSelectedValue();

        preencherCampos();
        ativarCampos();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        resumoCrud.excluir(jListListarResumos.getSelectedValue());
        this.resumos = resumoCrud.getListaSubmissao();
        listar();
        
        JOptionPane.showMessageDialog(null, "Excluído com sucesso");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVoltarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAutoresActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(1, true);
        jTabbedPaneResumos.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonVoltarAutoresActionPerformed

    private void jButtonVoltarInstituicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInstituicoesActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(1, true);
        jTabbedPaneResumos.setEnabledAt(3, false);

    }//GEN-LAST:event_jButtonVoltarInstituicoesActionPerformed

    private void jButtonVoltarPalavrasChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarPalavrasChavesActionPerformed
        // TODO add your handling code here:
        jTabbedPaneResumos.setSelectedIndex(1);
        jTabbedPaneResumos.setEnabledAt(1, true);
        jTabbedPaneResumos.setEnabledAt(4, false);
    }//GEN-LAST:event_jButtonVoltarPalavrasChavesActionPerformed

    private void jButtonSalvarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAutoresActionPerformed
        // TODO add your handling code here:
        if (jTextFieldAutor.getText().trim().equals("") && jTextFieldAutor1.getText().trim().equals("")
                && jTextFieldAutor2.getText().trim().equals("") && jTextFieldAutor3.getText().trim().equals("")
                && jTextFieldAutor4.getText().trim().equals("") && jTextFieldAutor5.getText().trim().equals("")
                && jTextFieldAutor6.getText().trim().equals("") && jTextFieldAutor7.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário a inserção de ao menos um Autor para continuar");
        } else {
                        
            if(!jTextFieldAutor.getText().trim().equals(""))
                autores.add(jTextFieldAutor.getText());
            if(!jTextFieldAutor1.getText().trim().equals(""))
                autores.add(jTextFieldAutor1.getText());
            if(!jTextFieldAutor2.getText().trim().equals(""))
                autores.add(jTextFieldAutor2.getText());
            if(!jTextFieldAutor3.getText().trim().equals(""))
                autores.add(jTextFieldAutor3.getText());
            if(!jTextFieldAutor4.getText().trim().equals(""))
                autores.add(jTextFieldAutor4.getText());
            if(!jTextFieldAutor5.getText().trim().equals(""))
                autores.add(jTextFieldAutor5.getText());
            if(!jTextFieldAutor6.getText().trim().equals(""))
                autores.add(jTextFieldAutor6.getText());
            if(!jTextFieldAutor7.getText().trim().equals(""))
                autores.add(jTextFieldAutor7.getText());
            
                

            jTabbedPaneResumos.setSelectedIndex(1);
            jTabbedPaneResumos.setEnabledAt(1, true);
            jTabbedPaneResumos.setEnabledAt(2, false);
        }
    }//GEN-LAST:event_jButtonSalvarAutoresActionPerformed

    private void jButtonSalvarInstituicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarInstituicoesActionPerformed
        // TODO add your handling code here:
        if (jTextFieldInstituicao.getText().trim().equals("") && jTextFieldInstituicao1.getText().trim().equals("")
                && jTextFieldInstituicao2.getText().trim().equals("") && jTextFieldInstituicao3.getText().trim().equals("")
                && jTextFieldInstituicao4.getText().trim().equals("") && jTextFieldInstituicao5.getText().trim().equals("")
                && jTextFieldInstituicao6.getText().trim().equals("") && jTextFieldInstituicao7.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário a inserção de ao menos uma Instituição para continuar");
        } else {
                        
            if(!jTextFieldInstituicao.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao.getText());
            if(!jTextFieldInstituicao1.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao1.getText());
            if(!jTextFieldInstituicao2.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao2.getText());
            if(!jTextFieldInstituicao3.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao3.getText());
            if(!jTextFieldInstituicao4.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao4.getText());
            if(!jTextFieldInstituicao5.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao5.getText());
            if(!jTextFieldInstituicao6.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao6.getText());
            if(!jTextFieldInstituicao7.getText().trim().equals(""))
                instituicoes.add(jTextFieldInstituicao7.getText());
            
            jTabbedPaneResumos.setSelectedIndex(1);
            jTabbedPaneResumos.setEnabledAt(1, true);
            jTabbedPaneResumos.setEnabledAt(3, false);

        }

    }//GEN-LAST:event_jButtonSalvarInstituicoesActionPerformed

    private void jListListarResumosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListListarResumosValueChanged
        // TODO add your handling code here:
        if (jListListarResumos.isSelectionEmpty()) {
            jButtonEditar.setEnabled(false);
            jButtonMaisDetalhes.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        } else {
            jButtonEditar.setEnabled(true);
            jButtonMaisDetalhes.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jListListarResumosValueChanged

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameResumo(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonAutores;
    private javax.swing.JToggleButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JToggleButton jButtonInstituicoes;
    private javax.swing.JButton jButtonMaisDetalhes;
    private javax.swing.JToggleButton jButtonPalavraChave;
    private javax.swing.JButton jButtonSalvarAutores;
    private javax.swing.JToggleButton jButtonSalvarInserir;
    private javax.swing.JButton jButtonSalvarInstituicoes;
    private javax.swing.JButton jButtonSalvarPalavrasChaves;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarAutores;
    private javax.swing.JButton jButtonVoltarInserir;
    private javax.swing.JButton jButtonVoltarInstituicoes;
    private javax.swing.JButton jButtonVoltarPalavrasChaves;
    private javax.swing.JComboBox<String> jComboBoxConsulta;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabelAutores;
    private javax.swing.JLabel jLabelInserirSituacao;
    private javax.swing.JLabel jLabelInserirTitulo;
    private javax.swing.JLabel jLabelInstituicoes;
    private javax.swing.JLabel jLabelPalavrasChaves;
    private javax.swing.JList<String> jListListarResumos;
    private javax.swing.JPanel jPanelAutores;
    private javax.swing.JPanel jPanelInserirResumo;
    private javax.swing.JPanel jPanelInstituicoes;
    private javax.swing.JPanel jPanelPalavrasChaves;
    private javax.swing.JPanel jPanelResumo;
    private javax.swing.JScrollPane jScrollPaneListaResumos;
    private javax.swing.JTabbedPane jTabbedPaneResumos;
    private javax.swing.JTextField jTextConsultarResumo;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldAutor1;
    private javax.swing.JTextField jTextFieldAutor2;
    private javax.swing.JTextField jTextFieldAutor3;
    private javax.swing.JTextField jTextFieldAutor4;
    private javax.swing.JTextField jTextFieldAutor5;
    private javax.swing.JTextField jTextFieldAutor6;
    private javax.swing.JTextField jTextFieldAutor7;
    private javax.swing.JTextField jTextFieldInserirTitulo;
    private javax.swing.JTextField jTextFieldInstituicao;
    private javax.swing.JTextField jTextFieldInstituicao1;
    private javax.swing.JTextField jTextFieldInstituicao2;
    private javax.swing.JTextField jTextFieldInstituicao3;
    private javax.swing.JTextField jTextFieldInstituicao4;
    private javax.swing.JTextField jTextFieldInstituicao5;
    private javax.swing.JTextField jTextFieldInstituicao6;
    private javax.swing.JTextField jTextFieldInstituicao7;
    private javax.swing.JTextField jTextFieldPalavraChave;
    private javax.swing.JTextField jTextFieldPalavraChave1;
    private javax.swing.JTextField jTextFieldPalavraChave2;
    private javax.swing.JTextField jTextFieldPalavraChave3;
    // End of variables declaration//GEN-END:variables
}
