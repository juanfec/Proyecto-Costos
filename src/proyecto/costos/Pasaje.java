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
            case "Bucaramanga - Gamarra	" : 
                row = sheet1.getRow(2);
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
                //System.out.println(" "+this.valor.getCostoConductor()+" "+ this.valor.getDiferencia());
                break;
            case "Bucaramanga - Aguachica	" :
                row = sheet1.getRow(3);
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
                this.valor.setDiferencia(v);;
            break;
            case "Bucaramanga - Santa Rosa	" :
                row = sheet1.getRow(4);
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
                this.valor.setDiferencia(v);;
            break;
            case "Bucaramanga - San Pablo	" :
                row = sheet1.getRow(5);
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
                this.valor.setDiferencia(v);;
            break;
            case "Santa Rosa - San Pablo	" :
                row = sheet1.getRow(6);
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
                this.valor.setDiferencia(v);;
            break;
            case "San Pablo - Simití	" :
                row = sheet1.getRow(7);
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
                this.valor.setDiferencia(v);;
            break;
            case " Bucaramanga - Puerto Wilches 	" :
                row = sheet1.getRow(8);
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
                this.valor.setDiferencia(v);;
            break;
            case "Santa Rosa - Cerro de Burgos	" :
                row = sheet1.getRow(9);
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
                this.valor.setDiferencia(v);;
            break;
            case "Santa Rosa - Simití	" :
                row = sheet1.getRow(10);
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
                this.valor.setDiferencia(v);;
            break;
            default: ;
            break;
        }
        return this.valor;
    }
    
    
}
