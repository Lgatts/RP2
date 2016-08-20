package cruds;

import categorias.Palestras;
import categorias.ShortCourse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author LucasCorrea
 */
public class PalestrasCrud {

    private static List<Palestras> palestrasLista = new ArrayList<>();

    public static void inserirPalestra(String titulo, String situacao, String autor, String resumo, String abstracText, String duracao, String curriculo) {
        Palestras palestra = new Palestras(titulo, situacao, autor, resumo, abstracText, duracao, curriculo);
        palestrasLista.add(palestra);

    }

    public static List<String> listarPalestra(String titulo) {
        List<String> consultaLista = new ArrayList();

        if (titulo.trim().equals("")) {
            for (Palestras palestra : palestrasLista) {
                consultaLista.add(palestra.getTitulo());
            }
        } else {
            for (Palestras palestra : palestrasLista) {
                if(palestra.getTitulo().trim().equalsIgnoreCase(titulo)){
                palestra.getTitulo().trim().equalsIgnoreCase(titulo);
                consultaLista.add(palestra.getTitulo());
                }
                }

        }
        return consultaLista;
    }
    
    public static List<Palestras> getLista(){
    
        return palestrasLista;
    
    }

}

