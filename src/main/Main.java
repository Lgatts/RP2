/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cruds.SubmissaoCrud;
import frames.Inicial;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import persistenciaDados.ObjectCrud;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {

        SubmissaoCrud monografiasLista = new SubmissaoCrud("Monografias");
        SubmissaoCrud minicursoLista = new SubmissaoCrud("MiniCursos");
        SubmissaoCrud palestrasLista = new SubmissaoCrud("Palestras");
        SubmissaoCrud artigosLista = new SubmissaoCrud("Artigos");
        SubmissaoCrud resumosLista = new SubmissaoCrud("Resumos");

        List<SubmissaoCrud> submissaoLista = new ArrayList();

        createDirectories();

        //Salvado objetos do hd na lista de Monografias
        monografiasLista = new SubmissaoCrud("Monografias");
        resumosLista = new SubmissaoCrud("Resumos");
        
        monografiasLista.setListaSubmissao(ObjectCrud.readObject("Monografias"));
        resumosLista.setListaSubmissao(ObjectCrud.readObject("Resumos"));
        
        submissaoLista.add(monografiasLista);
        submissaoLista.add(minicursoLista);
        submissaoLista.add(palestrasLista);
        submissaoLista.add(artigosLista);
        submissaoLista.add(resumosLista);

        new Inicial(submissaoLista).setVisible(true);

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
