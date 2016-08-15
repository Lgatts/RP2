/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Monografia;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import persistenciaDados.CrudMonografiaObjects;

/**
 *
 * @author Lucas
 */
public class MonografiaCrud {

    private static List<Monografia> monografiaList = new ArrayList();

    public static void setMonografiaList(List<Monografia> monografiaList) {
        MonografiaCrud.monografiaList = monografiaList;
    }

    public static List<Monografia> getMonografiaList() {
        return monografiaList;
    }

    /**
     * Função adicionar: Recebe os dados e cria o objeto que é inserido em uma
     * lista.
     *
     * @param titulo tipo
     * @param autor
     * @param orientador
     * @param tipo
     * @param situacao
     * @param ano
     * @param nPaginas
     * @param instituicao
     * @param curso
     * @param palavraChave
     * @param resumo
     * @param abstractText
     */
    public static void adicionar(String titulo, String autor, String orientador, String tipo, String situacao, int ano, int nPaginas, String instituicao, String curso, String[] palavraChave, String resumo, String abstractText) {

        String monografiaID = UUID.randomUUID().toString();

        Monografia monografia = new Monografia(monografiaID, titulo, situacao, tipo, autor, instituicao, orientador, curso, ano, nPaginas, palavraChave, resumo, abstractText);

        monografiaList.add(monografia);
        CrudMonografiaObjects.saveObject(monografia, "Monografias");

    }

    public static void excluir(String titulo) {
        for (Monografia monografia : monografiaList) {
            if (monografia.getTitulo().equals(titulo)) {
                monografiaList.remove(monografia);
                CrudMonografiaObjects.deleteObject(monografia, "Monografias");
                break;
            }
        }
    }

    public static List<String> consultar(String tipoConsulta, String textoConsulta) {

        List<String> listaConsulta = new ArrayList();

        switch (tipoConsulta) {
            case "Título":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getTitulo().equals(textoConsulta)) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Autor":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getAutor().equals(textoConsulta)) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Orientador":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getOrientador().equals(textoConsulta)) {
                        listaConsulta.add(monografia.getTitulo());
                    }
                }
                break;
            case "Curso":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getCurso().equals(textoConsulta)) {
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

}
