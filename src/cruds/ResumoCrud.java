/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Resumo;
import categorias.Situacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class ResumoCrud {

    private static List<Resumo> resumoLista = new ArrayList();

   /**
    * 
    * @param novoResumo 
    */
    public static void incluir (Resumo novoResumo){
       resumoLista.add(novoResumo);
    }
    
  /**
   * 
   * @param textoConsulta
   * @return 
   */
    public static List<String> consultar(String textoConsulta) {

        List<String> listaConsulta = new ArrayList();

        if (textoConsulta.trim().equals("")) {
            for (Resumo resumo : resumoLista) {
                    listaConsulta.add(resumo.getTituloSubmissao());
            }
        } else {
            for (Resumo resumo : resumoLista) {
                if (textoConsulta.trim().equalsIgnoreCase(resumo.getTituloSubmissao().trim())) {
                    listaConsulta.add(resumo.getTituloSubmissao());
                }
            }
        } 

        return listaConsulta;
    }
    
    /**
     * Método para Editar um item da lista, escolhido a partir do titulo
     * @param tituloEditar
     * @param titulo
     * @param situacao
     * @param instituicao
     * @param palavraChave
     * @param autor 
     */
    public static void editar(String tituloEditar, 
            String titulo, Situacao situacao, List<String> instituicao, 
            List<String> palavraChave, List<String> autor){
        for (Resumo resumo : resumoLista) {
            if(tituloEditar.equals(resumo.getTituloSubmissao())){
                resumo.setAutores(autor);
                resumo.setInstituicao(instituicao);
                resumo.setPalavraChave(palavraChave);
                resumo.setSituacaoSubmissao(situacao);
                resumo.setTituloSubmissao(titulo);
                break;
            }
        }
    }

    
    /**
     * Método para excluir um Resumo da lista
     * @param titulo 
     */
    public static void deletar(String titulo){
        for (Resumo resumo : resumoLista) {
            if(titulo.equals(resumo.getTituloSubmissao())){
                resumoLista.remove(resumo);
                break;
            }
        }
    }

    
    /**
     * Método para retornar a lista de resumos para a automatização dos campos
     * quando for editar
     * @return 
     */
    public static List<Resumo> getLista(){
        return resumoLista;
    }
}