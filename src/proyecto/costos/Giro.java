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
    
public class Giro {
    private Sheet sheet1;
    private Valor valor = new Valor();

    public Giro() {
        File file = new File("ANEXO-L_MATRIZ-_-GIROS.xlsx");//importa archivo de giros
        BuscadorArchivos buscarArchivoGiros = new BuscadorArchivos();
        Workbook wb = buscarArchivoGiros.abrirArchivo(file);
        this.sheet1 = wb.getSheetAt(4); //importa la hoja 5 del archivo de giros donde se encuentran los valores necesitados
    }
    
    public Valor  encontrarValor(int valor)
    {
        Row row;
        Cell cell;
        double v;
        if(valor<=0)
        {
            System.out.println("El valor no puede ser igual o menor a 0");
        }else if(valor<=50000)
        {
            establecerValores(2);
            return this.valor;
        }else if(valor<=100000)
        {
            establecerValores(3);
            return this.valor;
        }else if(valor<=150000)
        {
            establecerValores(4);
            return this.valor;
        }else if(valor<=200000)
        {
            establecerValores(5);
            return this.valor;
        }else if(valor<=250000)
        {
            establecerValores(6);
            return this.valor;
        }else if(valor<=300000)
        {
            establecerValores(7);
            return this.valor;
        }else if(valor<=350000)
        {
            establecerValores(8);
            return this.valor;
        }else if(valor<=400000)
        {
            establecerValores(9);
            return this.valor;
        }else if(valor>400000)
        {
            
           establecerValoresMas400(10,valor);
            return this.valor;
            
        }
                
        return null;
    }
    
    //busca los valores determinados en el archivo de  excel
    public void establecerValores(int fila)
    {
        Row row;
        Cell cell;
        double v;
        String utilidad;
        row = sheet1.getRow(fila);
            cell =row.getCell(2);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
            cell =row.getCell(3);
            v=cell.getNumericCellValue();
            this.valor.setManoDeObra(v);
            cell =row.getCell(4);
            v=cell.getNumericCellValue();
            this.valor.setDiferencia(v);
            cell=row.getCell(5);
            v=cell.getNumericCellValue()*100;
            utilidad=String.valueOf((int)v);
            this.valor.setUtilidad(utilidad);
    }
    
    public void establecerValoresMas400(int fila, int valor)
    {
        Row row;
        Cell cell;
        double v;
        String utilidad;
        row = sheet1.getRow(fila);
        cell =row.getCell(3);
        v=cell.getNumericCellValue();
        this.valor.setManoDeObra(v);
        double porcentaje = valor *0.026;
        this.valor.setPrecioDeVenta(porcentaje);
        v=this.valor.getManoDeObra()-this.valor.getPrecioDeVenta();
        this.valor.setDiferencia(v);
        v=this.valor.getPrecioDeVenta()/this.valor.getDiferencia();
        utilidad=String.valueOf((int)v);
        this.valor.setUtilidad(utilidad);
    }
}
