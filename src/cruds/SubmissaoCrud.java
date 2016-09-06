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
 * Classe que implementa ações como Criar, Exluir, Editar, e Consultar, sobre a
 * lista de submissoes.
 *
 * @author Lucas
 */
public class SubmissaoCrud implements ListaSubmissoes {

    //Declaração Lista genérica de submissoes
    private List<Submissao> listaSubmissao = new ArrayList();
    private String tipoSubmissao;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public SubmissaoCrud(String tipoSubmissao) {
        this.tipoSubmissao = tipoSubmissao;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get set da lista de submissoes">
    public List<Submissao> getListaSubmissao() {
        return listaSubmissao;
    }

    public void setListaSubmissao(List<Submissao> listaSubmissao) {
        this.listaSubmissao = listaSubmissao;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Incluir">
    /**
     * Método que inclui um objeto do tipo submissao na lista genérica
     *
     * @param submissao Submissao que foi criada na interface
     * @return True caso inclua com sucesso, falso caso contrário
     */
    @Override
    public boolean incluir(Submissao submissao) {
        listaSubmissao.add(submissao);
        ObjectCrud.saveObject(submissao, "Monografias");
        return true;
    }
    //</editor-fold>

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

        for (Submissao submissao : listaSubmissao) {
            if (submissao.getTituloSubmissao().toUpperCase().contains(titulo.toUpperCase())) {
                listaConsulta.add(submissao);
            }
        }

        return listaConsulta;
    }

    /**
     * Método para realizar a consulta na lista de autores da submissao
     *
     * @param autor String contendo o nome completo ou parte do nome do autor
     * @return Lista contendo todas submissoes correspondentes a pesquisa
     */
    @Override
    public List<Submissao> consultarAutor(String autor) {
        //Declaração da lista que irá ser retornada;
        List<Submissao> listaConsulta = new ArrayList();

        //Retornando a lista com autores
        for (Submissao submissao : listaSubmissao) {
            //Peguisando na lista de autores se algum contem parte do autor enviado
            List<String> autores = submissao.getAutores();
            for (String autorLista : autores) {
                //Se conter adicona a lista e continua o for
                if (autorLista.toUpperCase().contains(autor.toUpperCase())) {
                    listaConsulta.add(submissao);
                    break;
                }
            }

        }
        return listaConsulta;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Editar">
    /**
     * Método que recebe a Submissao editada e através do título anterior a
     * substitui na lista
     *
     * @param titulo título anterior da submissão editada
     * @param submissao Objecto contendo a submissao editada
     * @return true caso subsitua com sucesso falso caso contrário
     */
    @Override
    public boolean editar(String titulo, Submissao submissao) {

        for (Submissao submissaoAnterior : listaSubmissao) {
            if (submissaoAnterior.getTituloSubmissao().equals(titulo)) {
                int index = listaSubmissao.indexOf(submissaoAnterior);
                
                ObjectCrud.deleteObject(submissaoAnterior, this.tipoSubmissao);
                listaSubmissao.set(index, submissao);                
                ObjectCrud.saveObject(submissao, this.tipoSubmissao);
                return true;
            }
        }
        return false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Excluir">
    /**
     * Método que busca na lista através do título a submissao e a exclui caso
     * exista ou retorna false caso não encontre o título.
     *
     * @param titulo String contendo o título completo da monografia
     * @return true se a submissao foi exluida com sucesso ou falso caso não
     */
    @Override
    public boolean excluir(String titulo) {
        for (Submissao submissao : listaSubmissao) {
            if (submissao.getTituloSubmissao().equals(titulo)) {
                listaSubmissao.remove(submissao);
                ObjectCrud.deleteObject(submissao, this.tipoSubmissao);
                return true;
            }
        }
        return false;
    }
    //</editor-fold>
}
