/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.Submissao;
import java.util.List;
/**
 *
 * @author yuryalencar
 */
public interface ListaSubmissoes {
    
    /**
     * Método para incluir uma submissão 
     * @param submissao - Recebe o objeto submissão pronto
     * @return - true caso consiga fazer a inserção e false caso nao consiga
     */
    public boolean incluir(Submissao submissao);
    
    /**
     * Método de pesquisa por submissão utilizando o título
     * @param titulo - da submissão a ser procurada
     * @return as submissões econtradas caso a utilização de contains, caso a
     * utilização seja do equals retornará somente uma Submissão ou mais se a mesma 
     * estiver sido duplicada.
     */
    public List<Submissao> consultarTitulo(String titulo);
    
    /**
     * Método para consultar por autor, 
     * @param autor
     * @return uma Lista de submissões do determinado autor informado
     */
    public List<Submissao> consultarAutor(String autor);
    
    /**
     * Método que edita uma submissão
     * @param titulo - recebe seu antigo titulo para fazer a edição
     * @param submissao - recebe a submissao já editada
     * @return true caso consiga executar a edição e false caso nao consiga encontrar
     */
    public boolean editar(String titulo, Submissao submissao);
    
    /**
     * Método para excluir uma submissão, sendo esta exclusão por títulos
     * @param titulo - título da submissão a ser excluída
     * @return true caso consiga excluir e false caso não consiga
     */
    public boolean excluir(String titulo);
    
}
