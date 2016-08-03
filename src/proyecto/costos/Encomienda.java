/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.costos;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Juanfec
 */
public class Encomienda {
    private Sheet sheet1;
    private Valor valor = new Valor();

    public Encomienda() {
        File file = new File("ANEXO-N-MATRIZ-ENCOMIENDAS.xlsx");//importa archivo de giros
        BuscadorArchivos buscarArchivoGiros = new BuscadorArchivos();
        Workbook wb = buscarArchivoGiros.abrirArchivo(file);
        this.sheet1 = wb.getSheetAt(6); //importa la hoja 5 del archivo de giros donde se encuentran los valores necesitados
    }
    
    public Valor encontrarValor(double ancho, double largo, double alto, double peso, double valorDeclarado, String origenDestino)
    {
        Row row;
        Cell cell;
        double v;
        double volumen;
        volumen = ancho*largo*alto;
        volumen = volumen*400;//se transforma volumen en peso
        double precio;
        this.valor.setFleteManejo(valorDeclarado*0.006);
        switch(origenDestino)
        {
            case "Bucaramanga - Santa Rosa" :
                precio=establecerValores(3);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
                break;
            case "Bucaramanga - San Pablo" :
                precio=establecerValores(4);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Bucaramanga - Simití" :
                precio=establecerValores(5);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Bucaramanga - Puerto Wilches" :
                precio=establecerValores(6);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Puerto Wilches - Santa Rosa" :
                precio=establecerValores(7);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "San Pablo - Santa Rosa" :
                precio=establecerValores(8);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Bucaramanga - Aguachica" :
                precio=establecerValores(9);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Bucaramanga - Gamarra" :
                precio=establecerValores(10);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Aguachica - Santa Rosa" :
                precio=establecerValores(11);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
            break;
            case "Gamarra - Santa Rosa":
                precio=establecerValores(11);
                if(volumen>peso)
                {
                    this.valor.setFleteFijo(volumen*precio);
                }else
                {
                    this.valor.setFleteFijo(peso*precio);
                }
                break;
            default: ;
            break;
        }
        return this.valor;
    }
    
    public double establecerValores(int n)
    {
        Row row;
        Cell cell;
        double v;
        row = sheet1.getRow(n);
        cell =row.getCell(3);
        v=cell.getNumericCellValue();
       return v;
    }
    
    
}
