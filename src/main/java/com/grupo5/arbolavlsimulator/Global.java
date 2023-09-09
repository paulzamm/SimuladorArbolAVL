package com.grupo5.arbolavlsimulator;
/**
 * Clase Comun contiene los metodos globales a todos los controladores
 * @author Bertha Mazon
 * @date 2018/08/04
 * @version 1.0
 */
import java.io.File;

/**
 * Clase usada para obtener la ruta del proyecto
 * @author mmall
 */
public class Global {
    
    /**
     * Retorna el String del path del proyecto
     * @return 
     */
    public static String getPath(){
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path=path.substring(0,path.length()-2);
        path+="\\src\\main\\java\\";
        return path;
    }
}
