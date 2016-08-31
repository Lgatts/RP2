/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author YuryAlencar
 */
public class Minicurso extends SubmissaoApresentacao {

    private String situacao;
    private String duracao;
    private String recursos;
    private String metodologia;
    
    /**
     * 
     * @param titulo
     * @param situacao
     * @param resumoTexto
     * @param abstractTexto
     * @param duracao
     * @param recursos
     * @param metodologia
     * @param nomeAutor
     * @param nomeAutor1
     * @param nomeAutor2 
     */
    public Minicurso(String titulo, String situacao, String resumoTexto, String abstractTexto,
            int duracao, String recursos, String metodologia, String nomeAutor,
            String nomeAutor1, String nomeAutor2) {
        
        super(titulo, duracao, 3, resumoTexto, abstractTexto);
        this.situacao = situacao;
        this.recursos = recursos;
        this.metodologia = metodologia;
        
    }

    /**
     *
     * @return
     */
    public String getSituacao() {
        return this.situacao;
    }

    /**
     *
     * @return
     */
    public String getRecursos() {
        return this.recursos;
    }

    /**
     *
     * @return
     */
    public String getMetodologia() {
        return this.metodologia;
    }

    /**
     *
     * @param situacao
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     *
     * @param duracao
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     *
     * @param recursos
     */
    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    /**
     *
     * @param metodologia
     */
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
}
