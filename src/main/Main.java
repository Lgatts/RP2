/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import categorias.ShortCourse;
import frames.Inicial;
import java.util.List;


/**
 *
 * @author Lucas
 */
public class Main {
    
    private static List<ShortCourse> shortCourseList;
    

    public static List<ShortCourse> getShortCourseList() {
        return shortCourseList;
    }

    public static void setShortCourseList(List<ShortCourse> shortCourseList) {
        Main.shortCourseList = shortCourseList;
    }
    
    public static void main(String[] args) {
        new Inicial().setVisible(true);
    }
    
}
