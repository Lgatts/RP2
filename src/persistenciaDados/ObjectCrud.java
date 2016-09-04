/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaDados;

import categorias.Monografia;
import categorias.Submissao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class ObjectCrud {

    public static void saveObject(Submissao submisao, String tipo) {
        try {
            ObjectOutputStream oos = null;
            
            String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + tipo + "\\";
            
            FileOutputStream fOutS = new FileOutputStream(filePath + submisao.getiD() + ".ser");
            oos = new ObjectOutputStream(fOutS);
            
            oos.writeObject(submisao);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(ObjectCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveObjectFromList(List<Submissao> list, String tipo) {
        
        ObjectOutputStream oos = null;
        String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + tipo + "\\";
        int i = 0;
        for (Submissao submisao : list) {
            try {

                FileOutputStream fOutS = new FileOutputStream(filePath + i + ".ser");
                oos = new ObjectOutputStream(fOutS);

                oos.writeObject(submisao);

                i++;

            } catch (IOException ex) {
                Logger.getLogger(ObjectCrud.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(ObjectCrud.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<Submissao> readObject(String tipo) {

        List<Submissao> list = new ArrayList();

        File folder = new File(System.getenv("APPDATA") + "\\.RP2\\" + tipo);
        File[] listOfFiles = folder.listFiles();

       
        
        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    String filePath = System.getenv("APPDATA") + "\\.RP2\\" + tipo + "\\" + file.getName();

                    FileInputStream fin = new FileInputStream(filePath);
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    Submissao submissao = (Submissao) ois.readObject();

                    list.add(submissao);
                    ois.close();
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(ObjectCrud.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
        return list;

    }

    public static void deleteObject(Submissao submissao, String tipo){
        File file = new File(System.getenv("APPDATA") + "\\.RP2\\" + tipo +"\\"+submissao.getiD()+".ser");
        file.delete();
    }
    
}
