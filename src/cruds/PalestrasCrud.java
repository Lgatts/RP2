package cruds;

import categorias.Palestras;
import categorias.Situacao;
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
     * @param titulo - Titulo da Palestra
     * @param situacao - Situação da palestras, podendo estar SobAvaliação, Apr ou Rep.
     * @param autor - Autor da palestra.
     * @param resumo    - Resumo da palestra.
     * @param abstracText   - AbstracText.
     * @param duracao   - Duracão da palestra
     * @param curriculo - Currículo da palestra.
     */
    public static void inserirPalestra(String titulo, Situacao situacao, List <String> nomeAutores, String resumo, String abstracText, int duracao, String curriculo) {
        Palestras palestra = new Palestras(titulo, situacao, nomeAutores, resumo, abstracText, duracao, curriculo);
        palestrasLista.add(palestra);

    }
    /**
     * 
     * @param titulo
     * @return 
     */
    public static List<String> listarPalestra(String titulo) {
        List<String> consultaLista = new ArrayList();

        if (titulo.trim().equals("")) {
            for (Palestras palestra : palestrasLista) {
                consultaLista.add(palestra.getTituloSubmissao());
            }
        } else {
            for (Palestras palestra : palestrasLista) {
                if (palestra.getTituloSubmissao().trim().equalsIgnoreCase(titulo)) {
                    consultaLista.add(palestra.getTituloSubmissao());
                }
            }

        }
        return consultaLista;
    }
    /**
     * 
     * @param nomeeditar
     * @param titulo
     * @param situacao
     * @param autor
     * @param resumo
     * @param abstracText
     * @param duracao
     * @param curriculo 
     */
    //Editar - Necessita criar uma variável para locar o título//
    public static void editarPalestra(String nomeeditar, String titulo, Situacao situacao, List<String> autor, String resumo, String abstracText, int duracao, String curriculo) {
        for (Palestras palestra : palestrasLista) {
            if (nomeeditar.equals(palestra.getTituloSubmissao())) {
                palestra.setTituloSubmissao(titulo);
                palestra.setSituacaoSubmissao(situacao);
                palestra.setResumo(resumo);
                palestra.setDuracao(duracao);;
                palestra.setCurriculo(curriculo);
                palestra.setAutores(autor);
                palestra.setAbstractText(abstracText);

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
            if (deletar.equals(palestra.getTituloSubmissao())) {
                palestrasLista.remove(palestra);
                break;
            }
        }
    }

    /**
     * 
     * @return 
     */
    public static List<Palestras> getLista() {

        return palestrasLista;

    }

}
