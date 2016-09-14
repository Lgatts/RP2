/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author YuryAlencar
 */
public class Minicurso extends SubmissaoApresentacao {

    private String recursos;
    private String metodologia;
    
    /**
     * Cria um minicurso novo
     * @param titulo - Recebe o título do minicurso
     * @param situacao - situação que é um tipo ENUM
     * @param resumoTexto - recebe o resumo do minicurso
     * @param abstractTexto - abstract também é necessario
     * @param duracao - a duração em inteiro do minicurso
     * @param recursos - recursos que serão utilizados para o minicurso
     * @param metodologia - metodologia do minicurso específico
     * @param autores - uma lista com todos os autores
     */
    public Minicurso(String titulo, Situacao situacao, String resumoTexto, String abstractTexto,
            int duracao, String recursos, String metodologia, List<String> autores) {
        
        super(titulo, situacao, duracao, 3, resumoTexto, abstractTexto);
        this.recursos = recursos;
        this.metodologia = metodologia;
        super.setAutores(autores);
    }

    /**
     *
     * @return - Retorna os recursos que serão
     * utilizados para a execução do minicurso
     */
    public String getRecursos() {
        return this.recursos;
    }

    /**
     *
     * @return - retorna a metodologia presente no
     * respectivo minicurso.
     */
    public String getMetodologia() {
        return this.metodologia;
    }

    /**
     *
     * @param recursos - Modifica os recursos que serão
     * necessários para o minicurso específico, através
     * deste parâmetro recebido.
     */
    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    /**
     *
     * @param metodologia - modifica a metodologia do
     * minicurso específico a partir desta nova metodologia
     * que é recebida por parâmetro
     */
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    
    /**
     * 
     * @return - retorna uma string com todos os dados do
     * minicurso específico.
     */
    @Override
    public String toString(){
        String dados = super.toString();
        dados += "\nMetodologia: "+getMetodologia();
        dados += "\nRecursos: "+getRecursos();
        return dados;
    }
}
