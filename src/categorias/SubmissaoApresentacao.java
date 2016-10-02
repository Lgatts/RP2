/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author yuryalencar
 */
public abstract class SubmissaoApresentacao extends Submissao {

    protected String resumo;
    protected String abstractText;
    protected int duracao;

    /**
     * Construtor para a criação de uma submissão default, ou seja, que ainda
     * esta sobAvaliação
     *
     * @param tituloSubmissao
     * @param duracao
     * @param MAX_AUTORES
     * @param resumo
     * @param abstractText
     */
    public SubmissaoApresentacao(String tituloSubmissao, int duracao, int MAX_AUTORES, String resumo, String abstractText) {
        super(tituloSubmissao, MAX_AUTORES);
        this.abstractText = abstractText;
        this.resumo = resumo;
        this.duracao = duracao;
    }

    /**
     * Construtor da classe abstrata - com todos os dados para a criação de uma
     * submissao
     *
     * @param tituloSubmissao - Título da submissao , que tem vários tipos
     * @param situacaoSubmissao - Situação do resumo , APROVADO, REPROVADO e SOB
     * AVALIAÇÃO
     */
    public SubmissaoApresentacao(String tituloSubmissao, Situacao situacaoSubmissao, int duracao, int MAX_AUTORES, String resumo, String abstractText) {
        super(tituloSubmissao, situacaoSubmissao, MAX_AUTORES);
        this.abstractText = abstractText;
        this.resumo = resumo;
        this.duracao = duracao;
    }

    public SubmissaoApresentacao(int MAX_AUTORES) {
        super(MAX_AUTORES);
    }

    /**
     * Pega o resumo
     *
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * Método para modificar o resumo
     *
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * Método para pegar o abstract
     *
     * @return the abstractText
     */
    public String getAbstractText() {
        return abstractText;
    }

    /**
     * Método para modificar o abstract
     *
     * @param abstractText the abstractText to set
     */
    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    /**
     * método para pegar a duração
     *
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * método para modificar a duração da submissao
     *
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        String dados = super.toString();
        dados += "\nResumo: " + getResumo();
        dados += "\nAbstract: " + getAbstractText();
        dados += "\nDuração: " + getDuracao();
        return dados;
    }
}
