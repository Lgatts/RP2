package categorias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;

/**
 * Classe que implenta a noção de monografia.
 *
 * @author Lucas
 */
public class Monografia extends SubmissaoCientifica{

    //<editor-fold defaultstate="collapsed" desc="Declaração de Variaveis">   
    private String orientador;
    private String curso;
    private int ano;
    private int nPaginas;
    private String resumo;
    private String abstractText;
    private Tipo tipo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    /**
     * Construtor da classe monografia, recebe todos os atributos da classe
     *
     * @param titulo Titulo da monografia
     * @param situacao situação de avaliação da monografia podendo ser Em
     * avaliação, Aprovado, Reprovado
     * @param tipo String pode ser Graduação, Especialização, Mestrado,
     * Doutorado
     * @param autor Lista contendo a String com o nome do autor da monografia
     * @param instituicao String Instituição onde foi produzida a monografia
     * @param orientador String Orientador
     * @param curso String Curso de origem do autor
     * @param ano String ano de produção
     * @param nPaginas int número de páginas
     * @param palavraChave String[] palavras chaves
     * @param resumo String resumo da monografia
     * @param abstractText String resumo em ingles da monografia
     */
    public Monografia(String titulo, Situacao situacao, Tipo tipo, List<String> autor, List<String> instituicao, String orientador,
            String curso, int ano, int nPaginas, List<String> palavraChave, String resumo, String abstractText) {

        super(titulo, situacao, 1, 1, 4);
        super.setAutores(autor);
        super.setInstituicao(instituicao);
        super.setPalavraChave(palavraChave);
        this.orientador = orientador;
        this.curso = curso;
        this.ano = ano;
        this.nPaginas = nPaginas;
        this.resumo = resumo;
        this.abstractText = abstractText;
        this.tipo = tipo;

        SubmissaoTipo.Artigo.toString();
        
    }
    
    public Monografia(){
        super(1, 1, 4);
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get Sets">
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Métodos">
    /**
     * Método que trasforma todos os dados da monografia em uma String
     *
     * @return String com todos os atributos que forma preenchidos
     */
    @Override
    public String toString() {
//        String dados;
//        dados = super.toString();
//        dados += "\n Tipo: " + this.tipo;
//        dados += "\n Orientador: " + this.orientador;
//        dados += "\n Curso: " + this.curso;
//        dados += "\n Ano: " + this.ano;
//        dados += "\n Número de Paginas: " + this.nPaginas;
//        dados += "\n Resumo: " + this.resumo;
//        dados += "\n Abstract: " + this.abstractText;
        
        return super.getTituloSubmissao();
    }
//</editor-fold>

}
