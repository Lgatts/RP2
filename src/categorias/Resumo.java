/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

import java.util.List;

/**
 *
 * @author junio
 */
public class Resumo extends SubmissaoCientifica {
    
    
    
    public Resumo (String titulo, Situacao situacaoSubmissao, 
            List<String> autores, List<String> instituicao, List<String> palavraChave){
        super(titulo, 8, 8, 4);
        super.setTituloSubmissao(titulo);
        super.setSituacaoSubmissao(situacaoSubmissao);
        super.setAutores(autores);
        super.setInstituicao(instituicao);
        super.setPalavraChave(palavraChave);
        
    }
    
    public Resumo(){
        super(8,8,4);
    }
    
    @Override
    public String toString(){
       return super.getTituloSubmissao();
    }
    
}