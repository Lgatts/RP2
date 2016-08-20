/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Resumo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class ResumoCrud {

    private static List<Resumo> resumoList = new ArrayList();

    /**
     * 
     * @param titulo
     * @param situacao
     * @param instituicao
     * @param palavraChave
     * @param autor 
     */
    public static void incluir (String titulo, String situacao, String instituicao[], String palavraChave[], String autor[]){
       Resumo novoResumo = new Resumo(titulo, situacao, instituicao, palavraChave, autor);
       resumoList.add(novoResumo);
    }
    
    /**
     * 
     * @param textoConsulta
     * @return 
     */
    public static List<String> consultar(String textoConsulta) {

        List<String> listaConsulta = new ArrayList();

        if (textoConsulta.trim().equals("")) {
            for (categorias.Resumo resumo : resumoList) {
                    listaConsulta.add(resumo.getTitulo());
            }
        } else {
            for (categorias.Resumo resumo : resumoList) {
                if (textoConsulta.trim().equalsIgnoreCase(resumo.getTitulo().trim())) {
                    listaConsulta.add(resumo.getTitulo());
                }
            }
        } 

        return listaConsulta;
    }
    
    public List<Resumo> getLista(){
        return resumoList;
    }
}