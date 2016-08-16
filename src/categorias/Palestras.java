
package categorias;


public class Palestras {
    
    private String titulo;
    private String situacao;
    private String autor;
    private String resumo;
    private String abstracText;
    private String duracao;
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
    
 
    public Palestras(String titulo, String situacao, String autor, String resumo, String abstracText, String duracao, String curriculo) {
        this.titulo = titulo;
        this.situacao = situacao;
        this.autor = autor;
        this.resumo = resumo;
        this.abstracText = abstracText;
        this.duracao = duracao;
        this.curriculo = curriculo;
        
    }
   
   /*Getter and Setter*/
   /**
    * 
    * @return 
    */
    public String getTitulo() {
        return titulo;
    }
    /**
     * 
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * 
     * @return 
     */
    public String getSituacao() {
        return situacao;
    }
    /**
     * 
     * @param situacao 
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    /**
     * 
     * @return 
     */
    public String getAutor() {
        return autor;
    }
    /**
     * 
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * 
     * @return 
     */
    public String getResumo() {
        return resumo;
    }
    /**
     * 
     * @param resumo 
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    /**
     * 
     * @return 
     */
    public String getAbstracText() {
        return abstracText;
    }
    /**
     * 
     * @param abstracText 
     */
    public void setAbstracText(String abstracText) {
        this.abstracText = abstracText;
    }
    /**
     * 
     * @return 
     */
    public String getDuracao() {
        return duracao;
    }
    /**
     * 
     * @param duracao 
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
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
