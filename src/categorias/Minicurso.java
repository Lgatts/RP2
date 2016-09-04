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
    public Minicurso(String titulo, /*Situacao situacao,*/ String resumoTexto, String abstractTexto,
            int duracao, String recursos, String metodologia, List<String> autores) {
        
        super(titulo, duracao, 3, resumoTexto, abstractTexto);
        this.recursos = recursos;
        this.metodologia = metodologia;
        super.setAutores(autores);
    }

    /**
     *
     * @return
     */
    public String getRecursos() {
        return this.recursos;
    }

    /**
     *
     * @return
     */
    public String getMetodologia() {
        return this.metodologia;
    }

    /**
     *
     * @param recursos
     */
    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    /**
     *
     * @param metodologia
     */
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    
    @Override
    public String toString(){
        String dados = super.toString();
        dados += "\nMetodologia: "+getMetodologia();
        dados += "\nRecursos: "+getRecursos();
        return dados;
    }
}
