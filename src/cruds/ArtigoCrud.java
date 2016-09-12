package cruds;

import categorias.Artigo;
import java.util.ArrayList;
import java.util.List;
import categorias.Situacao;

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

    public static void incluir(Artigo artigo) {
        artigoList.add(artigo);
        
    }

    public static void editar(Artigo artigoEditar) {
        for (Artigo artigo : artigoList) {
            if (artigo.getTituloSubmissao().equals(artigoEditar.getTituloSubmissao())) {
                artigo.setTituloSubmissao(artigoEditar.getTituloSubmissao());
                artigo.setSituacaoSubmissao(artigoEditar.getSituacaoSubmissao());
                artigo.setAutores(artigoEditar.getAutores());
                artigo.setInstituicao(artigoEditar.getInstituicao());
                artigo.setPalavraChave(artigoEditar.getPalavraChave());
                artigo.setResumo(artigoEditar.getResumo());
                artigo.setAbstrat(artigoEditar.getAbstrat());
            }
        }
    }

    public static void excluir(String titulo) {

        for (Artigo artigo : artigoList) {
            if (artigo.getTituloSubmissao().equals(titulo)) {
                artigoList.remove(artigo);
            }
        }
    }

    public static List buscar(String tipoBusca, String pesquisa) {

        List<String> busca = new ArrayList<>();

        if (tipoBusca.equals("Todos")) {
            for (Artigo artigo : artigoList) {
                busca.add(artigo.getTituloSubmissao());
            }
        } else if (tipoBusca.equals("Titulo")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getTituloSubmissao().trim().equalsIgnoreCase(pesquisa.trim())) {
                    busca.add(artigo.getTituloSubmissao());
                }
            }
        } else if (tipoBusca.equals("Autor")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getAutores().get(0).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(1).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(2).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(3).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(4).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(5).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(6).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getAutores().get(7).trim().equalsIgnoreCase(pesquisa.trim())) {

                    busca.add(artigo.getTituloSubmissao());
                }
            }
        } else if (tipoBusca.equals("Instituição")) {
            for (Artigo artigo : artigoList) {
                if (artigo.getInstituicao().get(0).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(1).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(2).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(3).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(4).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(5).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(6).trim().equalsIgnoreCase(pesquisa.trim())
                        || artigo.getInstituicao().get(7).trim().equalsIgnoreCase(pesquisa.trim())) {

                    busca.add(artigo.getTituloSubmissao());
                }
            }
        }

        return busca;
    }
}