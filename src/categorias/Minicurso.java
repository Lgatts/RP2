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
public class Minicurso {
    
    private String titulo;
    private String situacao;
    private String resumoTexto;
    private String abstractTexto;
    private String duracao;
    private String recursos;
    private String metodologia;
    private String[] autor = new String [3];
    
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
                 String duracao,String recursos, String metodologia, String nomeAutor,
                 String nomeAutor1, String nomeAutor2){
        this.titulo = titulo;
        this.situacao = situacao;
        this.resumoTexto = resumoTexto;
        this.abstractTexto = abstractTexto;
        this.duracao = duracao;
        this.recursos = recursos;
        this.metodologia = metodologia;
        this.autor[0] = nomeAutor;
        this.autor[1] = nomeAutor1;
        this.autor[2] = nomeAutor2;
    }

    /**
     *
     * @return
     */
    public String getTitulo(){
        return this.titulo;
    }
    
    /**
     *
     * @return
     */
    public String getSituacao(){
        return this.situacao;
    }
    
    /**
     *
     * @return
     */
    public String getResumoTexto(){
        return this.resumoTexto;
    }
    
    /**
     *
     * @return
     */
    public String getAbstractTexto(){
        return this.abstractTexto;
    }
    
    /**
     *
     * @return
     */
    public String getDuracao(){
        return this.duracao;
    }
    
    /**
     *
     * @return
     */
    public String getRecursos(){
        return this.recursos;
    }
    
    /**
     *
     * @return
     */
    public String getMetodologia(){
        return this.metodologia;
    }
    
    /**
     *
     * @return 
     */
    public String[] getAutor(){
        return this.autor;
                
    }
    
    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    /**
     *
     * @param situacao
     */
    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
    
    /**
     *
     * @param resumoTexto
     */
    public void setResumoTexto(String resumoTexto){
        this.resumoTexto = resumoTexto;
    }
    
    /**
     *
     * @param abstractTexto
     */
    public void setAbstractTexto(String abstractTexto){
        this.abstractTexto = abstractTexto;
    }
    
    /**
     *
     * @param duracao
     */
    public void setDuracao(String duracao){
        this.duracao = duracao;
    }
    
    /**
     *
     * @param recursos
     */
    public void setRecursos(String recursos){
        this.recursos = recursos;
    }
    
    /**
     *
     * @param metodologia
     */
    public void setMetodologia(String metodologia){
        this.metodologia = metodologia;
    }
    
    /**
     *
     * @param nomeAutor
     * @param nomeAutor1
     * @param nomeAutor2
     */
    public void setAuthor(String nomeAutor, String nomeAutor1, String nomeAutor2){
        this.autor[0] = nomeAutor;
        this.autor[1] = nomeAutor1;
        this.autor[2] = nomeAutor2;
    }
}
