/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author junio
 */
public class Resumo {
    private String titulo;
    private String situacao;
    private String[] autor = new String [8];
    private String[] instituicao = new String [8];
    private String[] palavraChave = new String [4];
    
    
/**
 * 
 * @param titulo
 * @param situacao
 * @param instituicao
 * @param palavraChave
 * @param autor 
 */
    public Resumo (String titulo, String situacao, String instituicao[], String palavraChave[], String autor[]){
        this.titulo = titulo;
        this.situacao = situacao;
        this.autor = autor;
        this.instituicao = instituicao;
        this.palavraChave = palavraChave;
        
        
        
    }


/**
 * 
 * @return 
 */
    public String getTitulo() {
        return titulo;
    }
/**
 * 
 * @param titulo 
 */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
/**
 * 
 * @return 
 */
    public String getSituacao() {
        return situacao;
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
 * @return 
 */
    public String[] getAutor() {
        return autor;
    }
/**
 * 
 * @param autor 
 */
    public void setAutor(String[] autor) {
        this.autor = autor;
    }
/**
 * 
 * @return 
 */
    public String[] getInstituicao() {
        return instituicao;
    }
/**
 * 
 * @param instituicao 
 */
    public void setInstituicao(String[] instituicao) {
        this.instituicao = instituicao;
    }
/**
 * 
 * @return 
 */
    public String[] getPalavraChave() {
        return palavraChave;
    }
/**
 * 
 * @param palavraChave 
 */
    public void setPalavraChave(String[] palavraChave) {
        this.palavraChave = palavraChave;
    }

}