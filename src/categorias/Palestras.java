
package categorias;


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
    
 
    public  Palestras(String titulo, Situacao situacao, String autor, String resumo, String abstracText, int duracao, String curriculo) {
        super(titulo, duracao, 1, resumo, abstracText);
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
