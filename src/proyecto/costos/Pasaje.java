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
public class Pasaje {
    private Sheet sheet1;
    private Valor valor = new Valor();

    public Pasaje() {
         File file = new File("ANEXO-M.-MATRIZ-PASAJES.xlsx");//importa archivo de giros
        BuscadorArchivos buscarArchivoGiros = new BuscadorArchivos();
        Workbook wb = buscarArchivoGiros.abrirArchivo(file);
        this.sheet1 = wb.getSheetAt(9); //importa la hoja 5 del archivo de giros donde se encuentran los valores necesitados
    }
    
    
    public Valor encontrarValor(String destino)
    {
        Row row;
        Cell cell;
        double v;
        switch(destino)
        {
            case "Bucaramanga - Gamarra" : 
                System.out.println("entre");
                establecerValores(2);
                break;
            case "Bucaramanga - Aguachica	" :
                establecerValores(3);
            break;
            case "Bucaramanga - Santa Rosa	" :
                establecerValores(4);
            break;
            case "Bucaramanga - San Pablo	" :
                establecerValores(5);
            break;
            case "Santa Rosa - San Pablo	" :
                establecerValores(6);
            break;
            case "San Pablo - Simití	" :
                establecerValores(7);
            break;
            case "Bucaramanga - Puerto Wilches" :
                establecerValores(8);
            break;
            case "Santa Rosa - Cerro de Burgos	" :
                establecerValores(9);
            break;
            case "Santa Rosa - Simití	" :
                establecerValores(10);
            break;
            default: ;
            break;
        }
        return this.valor;
    }
    
    public void establecerValores(int fila)
    {
        Row row;
        Cell cell;
        double v;
        String utilidad;
        row = sheet1.getRow(fila);
            cell =row.getCell(7);
                v=cell.getNumericCellValue();
                this.valor.setCostoConductor(v);
                cell =row.getCell(8);
                v=cell.getNumericCellValue();
                this.valor.setCostoEmpresa(v);
                cell =row.getCell(9);
                v=cell.getNumericCellValue();
                this.valor.setPrecioDeVenta(v);
                cell =row.getCell(10);
                v=cell.getNumericCellValue();
                this.valor.setDiferencia(v);
                cell =row.getCell(11);
                v=cell.getNumericCellValue()*100;
                utilidad=String.valueOf((int)v);
                this.valor.setUtilidad(utilidad);
    }
    
    
}
