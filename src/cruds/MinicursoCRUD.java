/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Minicurso;
import categorias.Situacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author YuryAlencar
 */
public class MinicursoCRUD{
    
    private static List<Minicurso> minicursos = new ArrayList<>();
    private static ArrayList<String> autores;
    
    /**
     * Consulta avançada ele recebe como parâmetros o nome do autor e o título 
     * e a partir dele  faz a pesquisa
     * @param nomeAutor
     * @param titulo
     */
    public static List consultaAvancada(String titulo, String nomeAutor){
        
        List<String> visualizarLista = new ArrayList<>();
        
        for(Minicurso minicurso: minicursos){
            if(minicurso.isAutor(nomeAutor)){
                if(minicurso.getTituloSubmissao().toUpperCase().trim().contains(titulo.toUpperCase().trim())){
                    visualizarLista.add(minicurso.getTituloSubmissao());
                }
            }
        }
        
        return visualizarLista;
    }
    
    /**
     * O Método consultar recebe como parâmetro o tipo de consulta e o texto 
     * que vai ser utilizado no tipo de consulta
     * @param tipoConsulta
     * @param textoConsulta 
     */
    public static List consultar(String tipoConsulta, String textoConsulta){
        
        List<String> visualizarLista = new ArrayList<>();        
        
        switch(tipoConsulta){
            case "Autor":
                for(Minicurso minicurso: minicursos){
                    if(minicurso.isAutor(textoConsulta)){
                        visualizarLista.add(minicurso.getTituloSubmissao());
                    }
                }
                break;
            case "Titulo":
                for(Minicurso minicurso: minicursos){
                    if(minicurso.getTituloSubmissao().toUpperCase().trim().contains(textoConsulta.toUpperCase().trim())){
                        visualizarLista.add(minicurso.getTituloSubmissao());
                    }
                }
                break;
            default:
                for(Minicurso minicurso: minicursos){
                        visualizarLista.add(minicurso.getTituloSubmissao());
                }
                break;
        }

        return visualizarLista;
    }
    
    /**
     * Método para inserir o curso, recebendo todos os parâmetros para a criação
 de um objeto do tipo Minicurso, e depois o inserre na lista
     * 
     * @param novoMinicurso
     */
    public static void inserirMinicurso(Minicurso novoMinicurso){
        minicursos.add(novoMinicurso);
    }
    
    /**
     * A edição recebe todos os parâmetros para a edição de um minicurso,
     * e também recebe um nome que é utilizado para a busca e a edição.
     * 
     * @param editName
     * @param titulo
     * @param situacao
     * @param resumoTexto
     * @param abstractTexto
     * @param duracao
     * @param recursos
     * @param metodologia
     * @param autor
     * @param autor1
     * @param autor2 
     */
    public static void editarMinicurso(String editName, String titulo,/* Situacao situacao,*/ 
            String resumoTexto, String abstractTexto, int duracao, String recursos, 
            String metodologia, ArrayList<String> autores){
 
        for(Minicurso minicurso : minicursos){
            if(editName.equals(minicurso.getTituloSubmissao())){
                minicurso.setTituloSubmissao(titulo);
                //minicurso.setSituacaoSubmissao(situacao);
                minicurso.setResumo(resumoTexto);
                minicurso.setAbstractText(abstractTexto);
                minicurso.setDuracao(duracao);
                minicurso.setMetodologia(metodologia);
                minicurso.setRecursos(recursos);
                minicurso.setAutores(autores);
                break;
            }
        }
    }
    
    /**
     * Recebe o nome do minicurso a ser excluído , faz a busca em cima do mesmo,
     * quando encontra o remove da lista
     * 
     * @param titulo 
     */
    public static void deletarMinicurso(String titulo){
        for(Minicurso minicurso : minicursos){
            if(titulo.equals(minicurso.getTituloSubmissao())){
                minicursos.remove(minicurso);
                break;
            }
        }
    }
    
    /**
     * Devolve a lista
     * 
     * @return 
     */
    public static List<Minicurso> getMinicursos(){
        return minicursos;
    }
}