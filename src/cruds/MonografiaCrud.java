/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Submissao;
import java.util.ArrayList;
import java.util.List;
import persistenciaDados.ObjectCrud;

/**
 * Classe que implementa ações como Criar, Exluir, Editar, e Consultar, sobre
 * varias monografias.
 *
 * @author Lucas
 */
public class MonografiaCrud implements ListaSubmissoes {

    private static List<Submissao> listaMonografias = new ArrayList();

    public static List<Submissao> getListaMonografias() {
        return listaMonografias;
    }

    public static void setListaMonografias(List<Submissao> listaMonografias) {
        MonografiaCrud.listaMonografias = listaMonografias;
    } 
    
    @Override
    public boolean incluir(Submissao submissao) {
        listaMonografias.add(submissao);
        ObjectCrud.saveObject(submissao, "Monografias");
        return true;
    }

    //<editor-fold defaultstate="collapsed" desc="Consultas">
    /**
     * Método para buscar uma monografia a partir de um título ela pode buscar
     * apenas uma parte do título
     *
     * @param titulo
     * @return uma lista com todos os objetos monografia com titulos
     * correspondentes
     */
    @Override
    public List<Submissao> consultarTitulo(String titulo) {
        //Declaração da lista que irá ser retornada;
        List<Submissao> listaConsulta = new ArrayList();

        for (Submissao submissao : listaMonografias) {
            if (submissao.getTituloSubmissao().toUpperCase().contains(titulo.toUpperCase())) {
                listaConsulta.add(submissao);
            }
        }

        return listaConsulta;
    }

    @Override
    public List<Submissao> consultarAutor(String autor) {
        return null;
    }
    //</editor-fold>

    @Override
    public boolean editar(String titulo, Submissao submissao) {
        
        for(Submissao submissaoAnterior : listaMonografias){
            if(submissaoAnterior.getTituloSubmissao().equals(titulo)){
                submissaoAnterior = submissao;
                ObjectCrud.saveObject(submissaoAnterior, "Monografias");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean excluir(String titulo) {
         for (Submissao submissao : listaMonografias) {
            if (submissao.getTituloSubmissao().equals(titulo)) {
                listaMonografias.remove(submissao);
                ObjectCrud.deleteObject(submissao, "Monografias");
                return true;
            }
        }
        return false;
    }

}
