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
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Monografia").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Monografia").mkdir();
        }

        //Criação diretorio Artigos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Artigo").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Artigo").mkdir();
        }

        //Criação diretório Palestras
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Palestra").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Palestra").mkdir();
        }

        //Criação diretorio MiniCursos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Minicurso").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Minicurso").mkdir();
        }

        //Criação diretorio Resumos
        if (new File(System.getenv("APPDATA") + "\\.RP2\\Resumo").exists()) {

        } else {
            new File(System.getenv("APPDATA") + "\\.RP2\\Resumo").mkdir();
        }

    }

}
