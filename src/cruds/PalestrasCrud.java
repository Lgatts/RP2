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

    private static List<Palestras> PalestrasLista = new ArrayList<>();

    public static void inserirpalestra(String titulo, String situacao, String autor, String resumo, String abstracText, String duracao, String curriculo) {
        Palestras palestra = new Palestras(titulo, situacao, autor, resumo, abstracText, duracao, curriculo);
        PalestrasLista.add(palestra);

    }

    public static List<String> listarpalestra(String titulo) {
        List<String> consultaLista = new ArrayList();

        if (titulo.trim().equals("")) {
            for (Palestras palestra : PalestrasLista) {
                consultaLista.add(palestra.getTitulo());
            }
        } else {
            for (Palestras palestra : PalestrasLista) {
                if(palestra.getTitulo().trim().equalsIgnoreCase(titulo)){
                palestra.getTitulo().trim().equalsIgnoreCase(titulo);
                consultaLista.add(palestra.getTitulo());
                }
                }

        }
        return consultaLista;
    }

}

