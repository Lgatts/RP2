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

        createDirectories();
        new Inicial().setVisible(true);

    }

    private static void createDirectories() {
        //Criação diretório principal
        if (new File(System.getenv("APPDATA") + "\\.RP2").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2").mkdir();
        }

        //Criação diretório Monografias
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Monografias").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Monografias").mkdir();
        }

        //Criação diretorio Artigos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Artigos").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Artigos").mkdir();
        }

        //Criação diretório Palestras
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Palestras").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Palestras").mkdir();
        }

        //Criação diretorio MiniCursos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\MiniCursos").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\MiniCursos").mkdir();
        }
        
        //Criação diretorio Resumos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Resumos").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Resumos").mkdir();
        }


    }

}
