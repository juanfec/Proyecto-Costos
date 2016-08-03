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
    double manoDeObra;
    double diferencia;
    double costoConductor;
    double costoEmpresa;
    String utilidad;
    double fleteFijo;
    double fleteManejo;
    
    public Valor(){
        
    }

    public Valor(double precioDeVenta , double manoDeObra , double diferencia ) {
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

    public double getManoDeObra() {
        return manoDeObra;
    }

    public void setManoDeObra(double manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public double getCostoConductor() {
        return costoConductor;
    }

    public void setCostoConductor(double costoConductor) {
        this.costoConductor = costoConductor;
    }

    public double getCostoEmpresa() {
        return costoEmpresa;
    }

    public void setCostoEmpresa(double costoEmpresa) {
        this.costoEmpresa = costoEmpresa;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public double getFleteFijo() {
        return fleteFijo;
    }

    public void setFleteFijo(double fleteFijo) {
        this.fleteFijo = fleteFijo;
    }

    public double getFleteManejo() {
        return fleteManejo;
    }

    public void setFleteManejo(double fleteManejo) {
        this.fleteManejo = fleteManejo;
    }
    
    
}
