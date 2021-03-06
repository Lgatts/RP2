/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author yuryalencar
 */
public abstract class Submissao implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Declaração de Variáveis">
    protected String iD;
    protected String tituloSubmissao;
    protected Situacao situacaoSubmissao;
    protected List<String> autores;
    protected final int MAX_AUTORES;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    /**
     * Construtor padrão somente com os dados de título e quantidade maxima de
     * autores informadas.
     *
     * @param tituloSubmissao
     * @param MAX_AUTORES
     */
    public Submissao(String tituloSubmissao, int MAX_AUTORES) {
        //Criação de uma id únicia para o objecto que for criado
        this.iD = UUID.randomUUID().toString();
        this.tituloSubmissao = tituloSubmissao;        
        this.autores = new ArrayList();
        this.MAX_AUTORES = MAX_AUTORES;
    }

    public Submissao(int MAX_AUTORES){
        this.iD = UUID.randomUUID().toString();
        this.MAX_AUTORES = MAX_AUTORES;
    }
    
    /**
     * Construtor que recebe todos os parâmetros
     *
     * @param tituloSubmissao - Título da submissão
     * @param situacaoSubmissao - Situação da submissão
     * @param MAX_AUTORES - Máximo de autores para fazer a verificação nos
     * métodos
     */
    public Submissao(String tituloSubmissao, Situacao situacaoSubmissao, int MAX_AUTORES) {
        this(tituloSubmissao, MAX_AUTORES);
        this.situacaoSubmissao = situacaoSubmissao;        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get Sets">
    /**
     * Método para se obter o id gerado para o objeto
     *
     * @return retorna uma string contendo o iD gerado para o objeto
     */
    public String getiD() {
        return iD;
    }

    /**
     * Método para retornar o título da submissao
     *
     * @return
     */
    public String getTituloSubmissao() {
        return tituloSubmissao;
    }

    /**
     * Método para modificar o título da submissao
     *
     * @param tituloSubmissao
     */
    public void setTituloSubmissao(String tituloSubmissao) {
        this.tituloSubmissao = tituloSubmissao;
    }

    /**
     * Método para verificar a situação da submissao
     *
     * @return
     */
    public Situacao getSituacaoSubmissao() {
        return situacaoSubmissao;
    }

    /**
     * Método para modificar a situação da submissao
     *
     * @param situacaoSubmissao
     */
    public void setSituacaoSubmissao(Situacao situacaoSubmissao) {
        this.situacaoSubmissao = situacaoSubmissao;
    }

    /**
     * Retorna a lista com os autores
     *
     * @return the autores
     */
    public List<String> getAutores() {
        return autores;
    }

    /**
     * Método que recebe uma lista de autores e trata suas devidas correções, só
     * colocando na lista quando se tem no mínimo, e não deixando estrapolar o
     * max
     *
     * @param autores the autores to set
     */
    public boolean setAutores(List<String> autores) {

        if (autores.size() > MAX_AUTORES || autores.isEmpty()) {
            return false;
        }

        this.autores = autores;

        return true;
    }

    /**
     * @return the MAX_AUTORES
     */
    public int getMAX_AUTORES() {
        return MAX_AUTORES;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Métodos">
    /**
     * Método para verificar se um autor é percetencente a esta submissão
     *
     * @param procuraAutor
     * @return
     */
    public boolean isAutor(String procuraAutor) {
        for (String autor : autores) {
            if (autor.equalsIgnoreCase(procuraAutor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String dados = "Título: " + getTituloSubmissao()
                + "\n Situação: " + getSituacaoSubmissao() + "\n";

        for (int i = 0; i < autores.size(); i++) {
            dados += (i + 1) + "º Autor: " + autores.get(i) + "\n";
        }

        return dados;
    }
    //</editor-fold>

}
