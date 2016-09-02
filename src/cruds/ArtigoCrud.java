package cruds;

import categorias.Artigo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MauricioEscobar
 */
public class ArtigoCrud {

    private static List<Artigo> artigoList = new ArrayList();

    /**
     *
     * @return ArrayList<Artigo> lista de todos artigos
     */
    public static List<Artigo> getLista() {

        return artigoList;
    }

    public static void incluir(String titulo, String situacao, String[] autor, String[] instituicao, String[] palavraChave, String resumo, String abstrat) {

        Artigo artigo = new Artigo(titulo, situacao, autor, instituicao, palavraChave, resumo, abstrat);

        artigoList.add(artigo);
    }

    public static void excluir(String titulo) {

        for (Artigo artigo : artigoList) {
            if (artigo.getTitulo().equals(titulo)) {

                artigoList.remove(artigo);
            }
        }
    }
    
        public static void editar(Artigo artigoEditar) {
        for (Artigo artigo : artigoList) {
            if (artigo.getTitulo().equals(artigoEditar.getTitulo())) {

                artigo.setTitulo(artigoEditar.getTitulo());
                artigo.setSituacao(artigoEditar.getSituacao());
                artigo.setAutor(artigoEditar.getAutor());
                artigo.setInstituicao(artigoEditar.getInstituicao());
                artigo.setPalavrachave(artigoEditar.getPalavrachave());
                artigo.setResumo(artigoEditar.getResumo());
                artigo.setAbstrat(artigoEditar.getAbstrat());
            }
        }
    }

    public static List buscar(String tipoBusca, String pesquisa) {

        List<String> busca = new ArrayList<>();

        if (tipoBusca.equals("Todos")) {
            for (Artigo artigo : artigoList) {
                busca.add(artigo.getTitulo());
            }
        } else if (tipoBusca.equals("Titulo")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getTitulo().trim().equalsIgnoreCase(pesquisa.trim())) {
                    busca.add(artigo.getTitulo());
                }
            }
        } else if (tipoBusca.equals("Autor")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getAutor()[0].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[1].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[2].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[3].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[4].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[5].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[6].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getAutor()[7].trim().equalsIgnoreCase(pesquisa.trim())) {
                    busca.add(artigo.getTitulo());
                }
            }
        } else if (tipoBusca.equals("Instituição")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getInstituicao()[0].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[1].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[2].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[3].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[4].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[5].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[6].trim().equalsIgnoreCase(pesquisa.trim()) || artigo.getInstituicao()[7].trim().equalsIgnoreCase(pesquisa.trim())) {
                    busca.add(artigo.getTitulo());
                }
            }
        }

        return busca;
    }

}
