package categorias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Monografia {

    private String titulo;
    private String situacao;
    private String tipo;
    private String[] autor;
    private String instituicao;
    private String orientador;
    private String curso;
    private int ano;
    private int numeroDePaginas;
    private String[] palavraChave;
    private String resumo;
    private String abstractText;

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
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
     * @return
     */
    public String getTipo() {
        return tipo;
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
     * @return
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     *
     * @return
     */
    public String getOrientador() {
        return orientador;
    }

    /**
     *
     * @return
     */
    public String getCurso() {
        return curso;
    }

    /**
     *
     * @return
     */
    public int getAno() {
        return ano;
    }

    /**
     *
     * @return
     */
    public int getNumeroDePaginas() {
        return numeroDePaginas;
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
     * @return
     */
    public String getResumo() {
        return resumo;
    }

    /**
     *
     * @return
     */
    public String getAbstractText() {
        return abstractText;
    }

    /**
     *
     * @param titulo
     * @param situacao
     * @param tipo
     * @param autor
     * @param instituicao
     * @param orientador
     * @param curso
     * @param ano
     * @param numeroDePaginas
     * @param palavraChave
     * @param resumo
     * @param abstractText
     */
    public Monografia(String titulo, String situacao, String tipo, String[] autor, String instituicao, String orientador, String curso, int ano, int numeroDePaginas, String[] palavraChave, String resumo, String abstractText) {
        this.titulo = titulo;
        this.situacao = situacao;
        this.tipo = tipo;
        this.autor = autor;
        this.instituicao = instituicao;
        this.orientador = orientador;
        this.curso = curso;
        this.ano = ano;
        this.numeroDePaginas = numeroDePaginas;
        this.palavraChave = palavraChave;
        this.resumo = resumo;
        this.abstractText = abstractText;
    }

}
