package categorias;

import java.util.List;

/**
 *
 * @author MauricioEscobar
 */
public class Artigo extends SubmissaoCientifica {
    
    private String resumo;
    private String abstrat;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    /**
     * Construtor da classe artigo
     *
     * @param titulo
     * @param situacao
     * @param autor
     * @param instituicao
     * @param palavraChave
     * @param resumo
     * @param abstrat
     */
    public Artigo(String titulo, Situacao situacao, List<String> autor, List<String> instituicao,
            List<String> palavraChave, String resumo, String abstrat) {
        /*
         *  Acesso a um método da superclasse através da palavra-chave "super"
         *  super(titulo, MAX_AUTORES, MAX_INSTITUICAO, MAX_PALAVRACHAVE)
         */
        super(titulo, situacao, 8, 8, 4);
        super.setAutores(autor);
        super.setInstituicao(instituicao);
        super.setPalavraChave(palavraChave);

        this.resumo = resumo;
        this.abstrat = abstrat;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get's & set's do Artigo">
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
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    /*
     * anotação @Override
     * Método reescrito de um método da classe mãe
     * 
     */
    @Override
    public String toString() {
        return super.toString() + "Resumo: " + getResumo() + "Abstract: " + getAbstrat();
    }
    //</editor-fold>
}