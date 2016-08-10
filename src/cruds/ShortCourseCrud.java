/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import categorias.ShortCourse;
import java.util.ArrayList;
import java.util.List;
import main.Main;

/**
 *
 * @author YuryAlencar
 */
public class ShortCourseCrud {
    
    /**
     * @param courseList
     */
    private static List<ShortCourse> shortCourseList = Main.getShortCourseList();
    
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
    public void insertCourse(String title, String situation, String resumoText, String abstractText, String duration, String resources, String methodology, String author, String author1, String author2){
        ShortCourse course = new ShortCourse(title, situation, resumoText, abstractText, duration, resources, methodology, author, author1, author2);
        shortCourseList.add(course);
        Main.setShortCourseList(shortCourseList);
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
    public void editCourse(String editName, String title, String situation, String resumoText, String abstractText, String duration, String resources, String methodology, String author, String author1, String author2){
        for(categorias.ShortCourse course : shortCourseList){
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
        Main.setShortCourseList(shortCourseList);
    }
    
    /**
     * 
     * @param deleteName 
     */
    public void deleteCourse(String deleteName){
        for(categorias.ShortCourse course : shortCourseList){
            if(deleteName.equalsIgnoreCase(course.getTitle())){
                shortCourseList.remove(course);
            }
        }
        main.Main.setShortCourseList(shortCourseList);
    }
}