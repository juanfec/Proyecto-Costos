/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.costos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Juanfec
 */
public class BuscadorArchivos {

    public BuscadorArchivos( )  {
        
        
    }
    
    public XSSFWorkbook abrirArchivo(File file) 
    {
        try {
            
         if (file.exists()) {
                FileInputStream sp = new FileInputStream(file);
                
                XSSFWorkbook wb = new XSSFWorkbook(sp);
                return wb;
        }else
         {
             System.out.println("No se encontro el archivo");
         }
             
        } catch (IOException ex) {
            Logger.getLogger(BuscadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
}
