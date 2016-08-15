/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaDados;

import categorias.Monografia;
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
public class CrudMonografiaObjects {

    public static void saveObject(Monografia monografia, String tipo) {
        try {
            ObjectOutputStream oos = null;
            
            String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + tipo + "\\";
            
            FileOutputStream fOutS = new FileOutputStream(filePath + monografia.getMonografiaId() + ".ser");
            oos = new ObjectOutputStream(fOutS);
            
            oos.writeObject(monografia);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveObjectFromList(List<Monografia> list, String tipo) {
        
        ObjectOutputStream oos = null;
        String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + tipo + "\\";
        int i = 0;
        for (Monografia monografia : list) {
            try {

                FileOutputStream fOutS = new FileOutputStream(filePath + i + ".ser");
                oos = new ObjectOutputStream(fOutS);

                oos.writeObject(monografia);

                i++;

            } catch (IOException ex) {
                Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<Monografia> readObject(String tipo) {

        List<Monografia> list = new ArrayList();

        File folder = new File(System.getenv("APPDATA") + "\\.RP2\\" + tipo);
        File[] listOfFiles = folder.listFiles();

       
        
        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    String filePath = System.getenv("APPDATA") + "\\.RP2\\" + tipo + "\\" + file.getName();

                    FileInputStream fin = new FileInputStream(filePath);
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    Monografia monografia = (Monografia) ois.readObject();

                    list.add(monografia);
                    ois.close();
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
        return list;

    }

    public static void deleteObject(Monografia monografia, String tipo){
        File file = new File(System.getenv("APPDATA") + "\\.RP2\\" + tipo +"\\"+monografia.getMonografiaId()+".ser");
        file.delete();
    }
    
}
