/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.costos;

/**
 *
 * @author Juanfec
 */
public class Valor {
    double precioDeVenta;
    int manoDeObra;
    int diferencia;
    
    public Valor(){
        
    }

    public Valor(double precioDeVenta , int manoDeObra , int diferencia ) {
        this.diferencia = diferencia;
        this.manoDeObra = manoDeObra;
        this.precioDeVenta = precioDeVenta;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getManoDeObra() {
        return manoDeObra;
    }

    public void setManoDeObra(int manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }
    
    
}
