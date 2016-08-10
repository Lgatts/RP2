/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaDados;

import categorias.Monografia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class CrudMonografiaObjects {

    public static void write(String txtName, List<Monografia> list) {

        PrintWriter pw = null;
        try {
            String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + txtName;
            pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath + ".txt")));
            for (Monografia monografia : list) {
                pw.println(monografia);
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }

    }

    public static void read(String txtName, List list) {

        String filePath;

        if (new File(System.getenv("APPDATA") + "\\.RP2" + "\\" + txtName).exists()) {

            filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + txtName;

        }

    }

    public static void createObject(List<Monografia> list) {
        ObjectOutputStream oos = null;
        String txtName = "monografia";
        String filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + txtName;
        int i = 0;
        for (Monografia monografia : list) {
            try {

                FileOutputStream fout = new FileOutputStream(filePath + i + ".ser");
                oos = new ObjectOutputStream(fout);

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

    public static List<Monografia> readObject(String nameTxt) {

        List<Monografia> list = new ArrayList();

        File folder = new File(System.getenv("APPDATA") + "\\.RP2");
        File[] listOfFiles = folder.listFiles();
        String[] teste = folder.list();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    String filePath = System.getenv("APPDATA") + "\\.RP2\\" + file.getName();
                    
                    FileInputStream fin = new FileInputStream(filePath);
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    Monografia monografia = (Monografia) ois.readObject();
                    
                    list.add(monografia);
                } catch (IOException ex) {
                    Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CrudMonografiaObjects.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

//        for (String file : teste) {
//           
//                System.out.println(System.getenv("APPDATA") + "\\.RP2\\"+file);
//            
//        }
        return list;

    }

}
