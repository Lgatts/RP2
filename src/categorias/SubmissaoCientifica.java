/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuryalencar
 */
public abstract class SubmissaoCientifica extends Submissao {
    
    protected List<String> instituicao;
    protected List<String> palavraChave;
    protected final int MAX_INSTITUICAO;
    protected final int MAX_PALAVRACHAVE;

    /**
     * Construtor somente para a criação de uma submissão por default
     * @param tituloSubmissao
     * @param MAX_AUTORES 
     */
    public SubmissaoCientifica(String tituloSubmissao, int MAX_AUTORES,
            int MAX_INSTITUICAO, int MAX_PALAVRACHAVE) {
        
        super(tituloSubmissao, MAX_AUTORES);
        
        this.MAX_INSTITUICAO = MAX_INSTITUICAO;
        this.MAX_PALAVRACHAVE = MAX_PALAVRACHAVE;

    }
    
    /**
     * Construtor para uma Submissão científica com todos os dados informados
     * @param tituloSubmissao - Titulo de submissao
     * @param palavraChave - Palavras chaves das subissões
     * @param instituicao - Instituições da submissao
     */
    public SubmissaoCientifica(String tituloSubmissao, Situacao situacaoSubmissao
            , int MAX_AUTORES, int MAX_INSTITUICAO, int MAX_PALAVRACHAVE) {
        
        super(tituloSubmissao, situacaoSubmissao, MAX_AUTORES);
        
        this.MAX_INSTITUICAO = MAX_INSTITUICAO;
        this.MAX_PALAVRACHAVE = MAX_PALAVRACHAVE;
        
    }
    
    /**
     * @return the instituicao
     */
    public List<String> getInstituicao() {
        return instituicao;
    }

    /**
     * Método para inserir ou modificar uma instituição, e já verifica caso estrapole
     * os limites pré-estabelecidos
     * @param instituicao the instituicao to set
     */
    public boolean setInstituicao(List<String> instituicao) {
        
        if(instituicao.size()>getMAX_INSTITUICAO() || instituicao.size() == 0){
            return false;
        }
        
        for(int i=0; i<instituicao.size(); i++){
            this.getInstituicao().add(instituicao.get(i));
        }
        
        return true;
    }

    /**
     * @return the palavraChave
     */
    public List<String> getPalavraChave() {
        return palavraChave;
    }

    /**
     * Método para a inserção ou edição das palavras chavesjá tratando o erro que pode
     * ter devido a quantidade excedente ou nula
     * @param palavraChave the palavraChave to set
     */
    public boolean setPalavraChave(List<String> palavraChave) {
        
        if(palavraChave.size()>getMAX_PALAVRACHAVE() || palavraChave.size() ==0){
           return false; 
        }
        
        for(int i=0; i<palavraChave.size(); i++){
            this.getPalavraChave().add(palavraChave.get(i));
        }
        
        return true;
    }
    
    /**
     * @return the MAX_INSTITUICAO
     */
    public int getMAX_INSTITUICAO() {
        return MAX_INSTITUICAO;
    }

    /**
     * @return the MAX_PALAVRACHAVE
     */
    public int getMAX_PALAVRACHAVE() {
        return MAX_PALAVRACHAVE;
    }
    
    @Override
    public String toString(){
        String dados;
        dados = super.toString();
        
        for(int i=0; i<getPalavraChave().size();i++){
            dados += "\nPalavra-chave: "+getPalavraChave().get(i);
        }
        
        for(int i=0; i<getInstituicao().size();i++){
            dados += "\nInstituição: "+getInstituicao().get(i);
        }
        
        return dados;
    }
}
