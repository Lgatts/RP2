package categorias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author Lucas
 */
public class Monografia implements Serializable {

    private String monografiaId;
    private String titulo;
    private String situacao;
    private String tipo;
    private String autor;
    private String instituicao;
    private String orientador;
    private String curso;
    private int ano;
    private int nPaginas;
    private String[] palavraChave;
    private String resumo;
    private String abstractText;

    /**
     * Construtor da classe monografia, recebe todos os atributos da classe
     * @param monografiaId id criado para controle dos arquivos armazenados no sistema
     * @param titulo Titulo da monografia
     * @param situacao situação de avaliação da monografia podendo ser Em avaliação, 
     * @param tipo String
     * @param autor String
     * @param instituicao 
     * @param orientador
     * @param curso
     * @param ano
     * @param nPaginas
     * @param palavraChave
     * @param resumo
     * @param abstractText 
     */
    public Monografia(String monografiaId, String titulo, String situacao, String tipo, String autor, String instituicao, String orientador, String curso, int ano, int nPaginas, String[] palavraChave, String resumo, String abstractText) {
        this.monografiaId = monografiaId;
        this.titulo = titulo;
        this.situacao = situacao;
        this.tipo = tipo;
        this.autor = autor;
        this.instituicao = instituicao;
        this.orientador = orientador;
        this.curso = curso;
        this.ano = ano;
        this.nPaginas = nPaginas;
        this.palavraChave = palavraChave;
        this.resumo = resumo;
        this.abstractText = abstractText;
    }
    
    public String getMonografiaId() {
        return monografiaId;
    }

    public void setMonografiaId(String monografiaId) {
        this.monografiaId = monografiaId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String[] getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String[] palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }
     
}
