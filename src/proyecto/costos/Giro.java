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
        File file = new File("L_MATRIZ_GIROS.xlsx");//importa archivo de giros
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
            row = sheet1.getRow(2);
            cell =row.getCell(2);
            v=cell.getNumericCellValue();
            this.valor.setPrecioDeVenta(v);
            return this.valor;
        }else if(valor<=100000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(3);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=150000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(4);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=200000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(5);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=250000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(6);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=300000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(7);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=350000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(8);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor<=400000)
        {
            row = sheet1.getRow(2);
            cell =row.getCell(9);
            this.valor.setPrecioDeVenta((int) cell.getNumericCellValue());
        }else if(valor>400000)
        {
            // TODO: preguntar porcentaje
            
        }
                
        return null;
    }
}
