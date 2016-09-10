
package categorias;

import java.util.List;


public class Palestras extends SubmissaoApresentacao{
    
    private String curriculo;
    
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

   /*Construtor*/
    
 
    public  Palestras(String titulo, Situacao situacao, List <String> nomeAutores, String resumo, String abstracText, int duracao, String curriculo) {
        super(titulo, duracao, 1, resumo, abstracText);
        super.setAutores(nomeAutores);
        this.curriculo = curriculo;
        
    }
   
   /*Getter and Setter*/
   
    /**
     * 
     * @return 
     */
    public String getCurriculo() {
        return curriculo;
    }
    /**
     * 
     * @param curriculo 
     */
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
}
