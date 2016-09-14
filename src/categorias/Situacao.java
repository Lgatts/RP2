/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author Junior
 */
public enum Situacao {
    APROVADO("Aprovado"),
    REPROVADO("Reprovado"),
    SOBAVALIACAO("Sob avaliação");
    
    private final String situacao;
    
    private Situacao(String situacao){
        this.situacao = situacao;
    }

    /**
     * retorna a situação
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Método para verficar se o parâmetro enviado é 
     * válido de acordo com as opções do enum.
     * @param situacao - Valor enviado
     * @return - Retorna a situação do parâmetro enviado.
     */
    public static Situacao verificarSituacao(String situacao){
        
        if(Situacao.APROVADO.getSituacao().equals(situacao)){
            return Situacao.APROVADO;
        } else if (Situacao.REPROVADO.getSituacao().equals(situacao)){
            return Situacao.REPROVADO;
        } else if (Situacao.SOBAVALIACAO.getSituacao().equals(situacao)){
            return Situacao.SOBAVALIACAO;
        } else {
            return null;
        }
        
    }
}
