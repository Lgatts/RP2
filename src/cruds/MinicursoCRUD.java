/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Minicurso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author YuryAlencar
 */
public class MinicursoCRUD {
    
    private static List<Minicurso> minicursos = new ArrayList<>();
    
    /**
     * Consulta avançada ele recebe como parâmetros o nome do autor e o título 
     * e a partir dele  faz a pesquisa
     * @param nomeAutor
     * @param titulo
     */
    public static List consultaAvancada(String titulo, String nomeAutor){
        
        List<String> visualizarLista = new ArrayList<>();
        
        for(Minicurso minicurso: minicursos){
            if(minicurso.getAutor()[0].toUpperCase().trim().contains(nomeAutor.toUpperCase().trim()) || minicurso.getAutor()[1].toUpperCase().trim().contains(nomeAutor.toUpperCase().trim()) || minicurso.getAutor()[2].toUpperCase().trim().contains(nomeAutor.toUpperCase().trim())){
                if(minicurso.getTitulo().toUpperCase().trim().contains(titulo.toUpperCase().trim())){
                    visualizarLista.add(minicurso.getTitulo());
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
                    if(minicurso.getAutor()[0].toUpperCase().trim().contains(textoConsulta.toUpperCase().trim()) || minicurso.getAutor()[1].toUpperCase().trim().contains(textoConsulta.toUpperCase().trim()) || minicurso.getAutor()[2].toUpperCase().trim().contains(textoConsulta.toUpperCase().trim())){
                        visualizarLista.add(minicurso.getTitulo());
                    }
                }
                break;
            case "Titulo":
                for(Minicurso minicurso: minicursos){
                    if(minicurso.getTitulo().toUpperCase().trim().contains(textoConsulta.toUpperCase().trim())){
                        visualizarLista.add(minicurso.getTitulo());
                    }
                }
                break;
            default:
                for(Minicurso minicurso: minicursos){
                        visualizarLista.add(minicurso.getTitulo());
                }
                break;
        }

        return visualizarLista;
    }
    
    /**
     * Método para inserir o curso, recebendo todos os parâmetros para a criação
 de um objeto do tipo Minicurso, e depois o inserre na lista
     * 
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
    public static void inserirMinicurso(String titulo, String situacao, String resumoTexto,
                                        String abstractTexto, String duracao, String recursos,
                                        String metodologia, String autor, String autor1, 
                                        String autor2){
        Minicurso minicurso = new Minicurso(titulo, situacao, resumoTexto, abstractTexto,
                                            duracao, recursos, metodologia, autor, autor1,
                                            autor2);
        minicursos.add(minicurso);
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
    public static void editarMinicurso(String editName, String titulo, String situacao, 
            String resumoTexto, String abstractTexto, String duracao, String recursos, 
            String metodologia, String autor, String autor1, String autor2){
        for(Minicurso minicurso : minicursos){
            if(editName.equals(minicurso.getTitulo())){
                minicurso.setTitulo(titulo);
                minicurso.setSituacao(situacao);
                minicurso.setResumoTexto(resumoTexto);
                minicurso.setAbstractTexto(abstractTexto);
                minicurso.setDuracao(duracao);
                minicurso.setMetodologia(metodologia);
                minicurso.setRecursos(recursos);
                minicurso.setAuthor(autor, autor1, autor2);
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
            if(titulo.equals(minicurso.getTitulo())){
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