package cruds;

import categorias.Palestras;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasCorrea
 */
public class PalestrasCrud {

    private static List<Palestras> palestrasLista = new ArrayList<>();

    /**
     *
     * @param titulo
     * @param situacao
     * @param autor
     * @param resumo
     * @param abstracText
     * @param duracao
     * @param curriculo
     */
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
                if (palestra.getTitulo().trim().equalsIgnoreCase(titulo)) {
                    consultaLista.add(palestra.getTitulo());
                }
            }

        }
        return consultaLista;
    }

    //Editar - Necessita criar uma variável para locar o título//
    public static void editarPalestra(String nomeeditar, String titulo, String situacao, String autor, String resumo, String abstracText, String duracao, String curriculo) {
        for (Palestras palestra : palestrasLista) {
            if (nomeeditar.equals(palestra.getTitulo())) {
                palestra.setTitulo(titulo);
                palestra.setSituacao(situacao);
                palestra.setResumo(resumo);
                palestra.setDuracao(duracao);;
                palestra.setCurriculo(curriculo);
                palestra.setAutor(autor);
                palestra.setAbstracText(abstracText);

            }

        }

    }
    //Deletar//

    /**
     * 
     * @param deletar 
     */
    public static void deletarPalestra(String deletar) {
        for (Palestras palestra : palestrasLista) {
            if (deletar.equals(palestra.getTitulo())) {
                palestrasLista.remove(palestra);
                break;
            }
        }
    }

    public static List<Palestras> getLista() {

        return palestrasLista;

    }

}
