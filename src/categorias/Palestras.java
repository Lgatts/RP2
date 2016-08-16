
package categorias;


public class Palestras {
    
    private String titulo;
    private String situacao;
    private String autor;
    private String resumo;
    private String abstracText;
    private String duracao;
    private String curriculo;
    private String numero;
    
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
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAbstracText() {
        return abstracText;
    }

    public void setAbstracText(String abstracText) {
        this.abstracText = abstracText;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
}
