/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author YuryAlencar
 */
public class ShortCourse {
    
    private String title;
    private String situation;
    private String resumoText;
    private String abstractText;
    private String duration;
    private String resources;
    private String methodology;
    private String[] author = new String [3];
    
    /**
     *
     * @param title
     * @param situation
     * @param resumoText
     * @param abstractText
     * @param duration
     * @param resources
     * @param methodology
     * @param nameAuthor
     * @param nameAuthor1
     * @param nameAuthor2
     */
public ShortCourse(String title, String situation, String resumoText, String abstractText, String duration, String resources, String methodology, String nameAuthor, String nameAuthor1, String nameAuthor2){
        this.title = title;
        this.situation = situation;
        this.resumoText = resumoText;
        this.abstractText = abstractText;
        this.duration = duration;
        this.resources = resources;
        this.methodology = methodology;
        this.author[0] = nameAuthor;
        this.author[1] = nameAuthor1;
        this.author[2] = nameAuthor2;
    }

    /**
     *
     * @return
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     *
     * @return
     */
    public String getSituation(){
        return this.situation;
    }
    
    /**
     *
     * @return
     */
    public String getResumoText(){
        return this.resumoText;
    }
    
    /**
     *
     * @return
     */
    public String getAbstractText(){
        return this.abstractText;
    }
    
    /**
     *
     * @return
     */
    public String getDuration(){
        return this.duration;
    }
    
    /**
     *
     * @return
     */
    public String getResources(){
        return this.resources;
    }
    
    /**
     *
     * @return
     */
    public String getMethodology(){
        return this.methodology;
    }
    
    /**
     *
     * @return 
     */
    private String[] getAuthor(){
        return this.author;
                
    }
    
    /**
     *
     * @param title
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     *
     * @param situation
     */
    public void setSituation(String situation){
        this.situation = situation;
    }
    
    /**
     *
     * @param resumoText
     */
    public void setResumoText(String resumoText){
        this.resumoText = resumoText;
    }
    
    /**
     *
     * @param abstractText
     */
    public void setAbstractText(String abstractText){
        this.abstractText = abstractText;
    }
    
    /**
     *
     * @param duration
     */
    public void setDuration(String duration){
        this.duration = duration;
    }
    
    /**
     *
     * @param resources
     */
    public void setResources(String resources){
        this.resources = resources;
    }
    
    /**
     *
     * @param methodology
     */
    public void setMethodology(String methodology){
        this.methodology = methodology;
    }
    
    /**
     *
     * @param nameAuthor
     * @param nameAuthor1
     * @param nameAuthor2
     */
    private void setAuthor(String nameAuthor, String nameAuthor1, String nameAuthor2){
        this.author[0] = nameAuthor;
        this.author[1] = nameAuthor1;
        this.author[2] = nameAuthor2;
    }
}
