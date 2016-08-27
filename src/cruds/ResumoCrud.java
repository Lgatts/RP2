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

    private static List<Resumo> resumoLista = new ArrayList();

    /**
     * Método para incluir um resumo na lista
     * @param titulo
     * @param situacao
     * @param instituicao
     * @param palavraChave
     * @param autor 
     */
    public static void incluir (String titulo, String situacao, String instituicao[], String palavraChave[], String autor[]){
       Resumo novoResumo = new Resumo(titulo, situacao, instituicao, palavraChave, autor);
       resumoLista.add(novoResumo);
    }
    
    /**
     * Método para consultar, por título do resumo
     * @param textoConsulta
     * @return 
     */
    public static List<String> consultar(String textoConsulta) {

        List<String> listaConsulta = new ArrayList();

        if (textoConsulta.trim().equals("")) {
            for (categorias.Resumo resumo : resumoLista) {
                    listaConsulta.add(resumo.getTitulo());
            }
        } else {
            for (categorias.Resumo resumo : resumoLista) {
                if (textoConsulta.trim().equalsIgnoreCase(resumo.getTitulo().trim())) {
                    listaConsulta.add(resumo.getTitulo());
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
    public static void editar(String tituloEditar, String titulo, String situacao, String instituicao[], String palavraChave[], String autor[]){
        for (Resumo resumo : resumoLista) {
            if(tituloEditar.equals(resumo.getTitulo())){
                resumo.setAutor(autor);
                resumo.setInstituicao(instituicao);
                resumo.setPalavraChave(palavraChave);
                resumo.setSituacao(situacao);
                resumo.setTitulo(titulo);
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
            if(titulo.equals(resumo.getTitulo())){
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