/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Monografia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class MonografiaCrud {

    private static List<Monografia> monografiaList = new ArrayList();   

    public static void adicionar(Monografia monografia) {

        monografiaList.add(monografia);

    }

    public static void excluir(String titulo) {
        for (Monografia monografia : monografiaList) {
            if (monografia.getTitulo().equals(titulo)) {
                monografiaList.remove(monografia);
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
