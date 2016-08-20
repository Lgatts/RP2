/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.ShortCourse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author YuryAlencar
 */
public class ShortCourseCrud {
    
    private static List<ShortCourse> shortCourseList = new ArrayList<>();
    
    /**
     * 
     * @param nameAuthor
     * @param title 
     */
    public static List advancedConsult(String title, String nameAuthor){
        
        List<String> displayList = new ArrayList<>();
        
        for(ShortCourse course: shortCourseList){
            if(course.getAuthor()[0].toUpperCase().trim().contains(nameAuthor.toUpperCase().trim()) || course.getAuthor()[1].toUpperCase().trim().contains(nameAuthor.toUpperCase().trim()) || course.getAuthor()[2].toUpperCase().trim().contains(nameAuthor.toUpperCase().trim())){
                if(course.getTitle().toUpperCase().trim().contains(title.toUpperCase().trim())){
                    displayList.add(course.getTitle());
                }
            }
        }
        
        return displayList;
    }
    
    /**
     * 
     * @param typeConsult
     * @param textConsult 
     */
    public static List consult(String typeConsult, String textConsult){
        
        List<String> displayList = new ArrayList<>();        
        
        switch(typeConsult){
            case "Autor":
                for(ShortCourse course: shortCourseList){
                    if(course.getAuthor()[0].toUpperCase().trim().contains(textConsult.toUpperCase().trim()) || course.getAuthor()[1].toUpperCase().trim().contains(textConsult.toUpperCase().trim()) || course.getAuthor()[2].toUpperCase().trim().contains(textConsult.toUpperCase().trim())){
                        displayList.add(course.getTitle());
                    }
                }
                break;
            case "Titulo":
                for(ShortCourse course: shortCourseList){
                    if(course.getTitle().toUpperCase().trim().contains(textConsult.toUpperCase().trim())){
                        displayList.add(course.getTitle());
                    }
                }
                break;
            default:
                for(ShortCourse course: shortCourseList){
                        displayList.add(course.getTitle());
                }
                break;
        }

        return displayList;
    }
    
    /**
     * 
     * @param title
     * @param situation
     * @param resumoText
     * @param abstractText
     * @param duration
     * @param resources
     * @param methodology
     * @param author
     * @param author1
     * @param author2 
     */
    public static void insertCourse(String title, String situation, String resumoText, String abstractText, String duration, String resources, String methodology, String author, String author1, String author2){
        ShortCourse course = new ShortCourse(title, situation, resumoText, abstractText, duration, resources, methodology, author, author1, author2);
        shortCourseList.add(course);
    }
    
    /**
     * 
     * @param editName
     * @param title
     * @param situation
     * @param resumoText
     * @param abstractText
     * @param duration
     * @param resources
     * @param methodology
     * @param author
     * @param author1
     * @param author2 
     */
    public static void editCourse(String editName, String title, String situation, String resumoText, String abstractText, String duration, String resources, String methodology, String author, String author1, String author2){
        for(ShortCourse course : shortCourseList){
            if(editName.equals(course.getTitle())){
                course.setTitle(title);
                course.setSituation(situation);
                course.setResumoText(resumoText);
                course.setAbstractText(abstractText);
                course.setDuration(duration);
                course.setMethodology(methodology);
                course.setResources(resources);
                course.setAuthor(author, author1, author2);
            }
        }
    }
    
    /**
     * 
     * @param deleteName 
     */
    public static void deleteCourse(String deleteName){
        for(ShortCourse course : shortCourseList){
            if(deleteName.equals(course.getTitle())){
                shortCourseList.remove(course);
                break;
            }
        }
    }
    
    public static List<ShortCourse> getShortCourseList(){
        return shortCourseList;
    }
}