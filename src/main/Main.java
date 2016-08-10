/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import frames.Inicial;
import java.io.File;

/**
 *
 * @author Lucas
 */
public class Main {       
    
    public static void main(String[] args) { 
        
        createDirectory();        
        new Inicial().setVisible(true);
        
    }
    
    private static void createDirectory(){
        if(new File(System.getenv("APPDATA") + "\\.RP2").exists()){
            
        }
        else{
            new File(System.getenv("APPDATA") + "\\.RP2").mkdir();
        }
    }
    
    
    
}
