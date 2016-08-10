/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaDados;

import categorias.Monografia;
import java.io.File;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class CrudMonografiaToTxt {
    public static void write(String txtName, List<Monografia> list){
        
//        File file = new File(txtName).isFile()
//                file.createNewFile();
//        
//        for(Monografia element: list){
//            
//        }
    }
    public static void read(String txtName, List list){
        
    }
    
    public static String VerifyFile(String fileName, boolean writer) {

        String filePath = null;

        if (writer == true) {

            filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + fileName;

        } else if (new File(System.getenv("APPDATA") + "\\.RP2" + "\\" + fileName).exists()) {

            filePath = System.getenv("APPDATA") + "\\.RP2" + "\\" + fileName;

        }
        return filePath;

    }
    
    
}
