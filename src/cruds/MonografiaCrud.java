/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Monografia;
import java.util.List;
import javax.swing.DefaultListModel;
import main.Main;

/**
 *
 * @author Lucas
 */
public class MonografiaCrud {

    private static List<Monografia> monografiaList = Main.getMonografiaList();
    private static DefaultListModel listModel = new DefaultListModel();

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

    public static void listar(javax.swing.JList<String> jList) {

        jList.setModel(listModel);

    }

    public static void consultar(String tipoConsulta, String textoConsulta) {

        listModel.clear();

        switch (tipoConsulta) {
            case "Título":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getTitulo().equals(textoConsulta)) {
                        listModel.addElement(monografia.getTitulo());
                    }
                }
                break;
            case "Autor":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getAutor().equals(textoConsulta)) {
                        listModel.addElement(monografia.getTitulo());
                    }
                }
                break;
            case "Orientador":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getOrientador().equals(textoConsulta)) {
                        listModel.addElement(monografia.getTitulo());
                    }
                }
                break;
            case "Curso":
                for (Monografia monografia : monografiaList) {
                    if (monografia.getCurso().equals(textoConsulta)) {
                        listModel.addElement(monografia.getTitulo());
                    }
                }
                break;
            default:
                for (Monografia monografia : monografiaList) {

                    listModel.addElement(monografia.getTitulo());

                }
                break;
        }

    }

}
