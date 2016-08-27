/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Monografia;
import java.util.ArrayList;
import java.util.List;
import persistenciaDados.CrudMonografiaObjects;

/**
 * Classe que implementa ações como Criar, Exluir, Editar, e Consultar, sobre varias monografias.
 * @author Lucas
 */
public class MonografiaCrud {

    private static List<Monografia> monografiaList = new ArrayList();

    public static void setMonografiaList(List<Monografia> monografiaList) {
        MonografiaCrud.monografiaList = monografiaList;
    }

    /**
     *
     * @return ArrayList<Monografia> contendo todas as monografias adicionadas
     */
    public static List<Monografia> getMonografiaList() {
        return monografiaList;
    }

    /**
     * Recebe o objeto monografia e armazena em um ArrayList
     *
     * @param monografia
     */
    public static void adicionar(Monografia monografia) {

        monografiaList.add(monografia);
        CrudMonografiaObjects.saveObject(monografia, "Monografias");

    }

    /**
     * Percorre a lista e se encontar alguma monografia com o Titulo
     * correspondente, a mesma é excluida da lista, esse metodo ainda chama o metodo de exclusão do
     * objeto do hd.
     *
     * @param titulo
     */
    public static void excluir(String titulo) {
        for (Monografia monografia : monografiaList) {
            if (monografia.getTitulo().equals(titulo)) {
                monografiaList.remove(monografia);
                CrudMonografiaObjects.deleteObject(monografia, "Monografias");
                break;
            }
        }
    }

    /**
     *
     * @param tipoConsulta Especifca com qual campo será feita a consulta, pode
     * ser Titulo, Autor, Curso, Orientador, "vazio" retorna todas as
     * monografias existentes
     * @param textoConsulta Texto informado pelo usuário com o qual será
     * realizado a consulta
     * @return Lista de Strings com os titulos das monografias correspondentes
     */
    public static List<String> consultar(String tipoConsulta, String textoConsulta) {

        List<String> listaConsulta = new ArrayList();

        switch (tipoConsulta) {
            case "Título":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getTitulo().toUpperCase().contains(textoConsulta.toUpperCase())) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Autor":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getAutor().toUpperCase().contains(textoConsulta.toUpperCase())) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Orientador":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getOrientador().toUpperCase().contains(textoConsulta.toUpperCase())) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Curso":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getCurso().toUpperCase().contains(textoConsulta.toUpperCase())) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            default:
                for (Monografia monografia : monografiaList) {
                    listaConsulta.add(monografia.getTitulo());
                }
                break;
        }

        return listaConsulta;

    }

    /**
     * Função para retornar o objeto do tipo Monografia através do título
     *
     * @param titulo String Titulo da monografia desejada
     * @return Objeto Monografia
     */
    public static Monografia getMonografia(String titulo) {
        for (Monografia monografia : monografiaList) {
            if (monografia.getTitulo().equalsIgnoreCase(titulo)) {
                return monografia;
            }
        }
        return null;
    }

    /**
     * Método que recebe um objeto monografia e a partir de seu id o substitui
     * no ArrayList.
     *
     * @param monografiaEditada
     */
    public static void editar(Monografia monografiaEditada) {
        for (Monografia monografia : monografiaList) {
            if (monografia.getMonografiaId().equals(monografiaEditada.getMonografiaId())) {

                monografia.setAutor(monografiaEditada.getAutor());
                monografia.setAbstractText(monografiaEditada.getAbstractText());
                monografia.setAno(monografiaEditada.getAno());
                monografia.setCurso(monografiaEditada.getCurso());
                monografia.setInstituicao(monografiaEditada.getInstituicao());
                monografia.setOrientador(monografiaEditada.getOrientador());
                monografia.setPalavraChave(monografiaEditada.getPalavraChave());
                monografia.setResumo(monografiaEditada.getResumo());
                monografia.setSituacao(monografiaEditada.getSituacao());
                monografia.setTipo(monografiaEditada.getTipo());
                monografia.setnPaginas(monografiaEditada.getnPaginas());
                monografia.setTitulo(monografiaEditada.getTitulo());
                
                CrudMonografiaObjects.saveObject(monografia, "Monografias");
                break;

            }
        }
    }

}
