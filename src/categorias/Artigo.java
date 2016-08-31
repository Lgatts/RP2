package categorias;

/**
 *
 * @author MauricioEscobar
 */
//public class Artigo extends SubmissaoCientifica {
public class Artigo {

    private String titulo;
    private String situacao;
    private String autor[];
    private String instituicao[];
    private String palavrachave[];
    private String resumo;
    private String abstrat;

    /**
     *
     * @param titulo
     * @param situacao
     * @param autor
     * @param palavrachave
     * @param resumo
     * @param abstrat
     */
    public Artigo(String titulo, String situacao, String autor[], String instituicao[], String palavrachave[], String resumo, String abstrat) {
//        super(titulo, 8, 8, 4);
        
        this.titulo = titulo;
        this.situacao = situacao;
        this.autor = autor;
        this.instituicao = instituicao;
        this.palavrachave = palavrachave;
        this.resumo = resumo;
        this.abstrat = abstrat;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the autor
     */
    public String[] getAutor() {
        return autor;
    }
//
//    /**
//     * @param autor the autor to set
//     */
    public void setAutor(String[] autor) {
        this.autor = autor;
    }

    /**
     * @return the instituicao
     */
    public String[] getInstituicao() {
        return instituicao;
    }
//
//    /**
//     * @param instituicao the instituicao to set
//     */
    public void setInstituicao(String[] instituicao) {
        this.instituicao = instituicao;
    }
    /**
     * @return the palavrachave
     */
    public String[] getPalavrachave() {
        return palavrachave;
    }
//
//    /**
//     * @param palavrachave the palavrachave to set
//     */
    public void setPalavrachave(String[] palavrachave) {
        this.palavrachave = palavrachave;
    }

    /**
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * @return the abstrat
     */
    public String getAbstrat() {
        return abstrat;
    }

    /**
     * @param abstrat the abstrat to set
     */
    public void setAbstrat(String abstrat) {
        this.abstrat = abstrat;
    }

//    public String toString() {
//        return super.toString() + "Resumo" + resumo + "Abstract" + abstrat;
//    }

}
