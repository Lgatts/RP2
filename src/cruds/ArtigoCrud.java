package cruds;

import categorias.Artigo;
import java.util.ArrayList;
import java.util.List;

public class ArtigoCrud {

    private static List<Artigo> artigoList = new ArrayList();

    public static void incluir(String titulo, String situacao, String[] autor, String[] instituicao, String[] palavraChave, String resumo, String abstrat) {

        Artigo artigo = new Artigo();

        artigo.setTitulo(titulo);
        artigo.setSituacao(situacao);
        artigo.setAutor(autor);
        artigo.setInstituicao(instituicao);
        artigo.setPalavrachave(palavraChave);
        artigo.setResumo(resumo);
        artigo.setAbstrat(abstrat);

        artigoList.add(artigo);
    }

    public static List<String> consultar(String titulo) {

        List<String> busca = new ArrayList();

        for (Artigo artigo : artigoList) {
            //trim() apaga os espaços na frente e atras
            //equalsIgnoreCase ignora maiusculas e minusculas
            if (artigo.getTitulo().trim().equalsIgnoreCase(titulo.trim())) {

                busca.add(artigo.getTitulo());
            }
        }
        return busca;
    }

    public static List buscar(String pesquisa) {
        List<String> busca = new ArrayList<>();

        for (Artigo artigo : artigoList) {
            if (artigo.getAutor()[0].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[1].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[2].trim().equalsIgnoreCase(pesquisa.trim())) {
                busca.add(artigo.getTitulo());
            }
        }
        return busca;
    }

}
