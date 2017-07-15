package FinancePartner.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Guido
 */
public class Gasto {

    private String nombre;
    private Date fecha;
    private double monto;
    
    public Gasto(String nombre, int dia, int mes, int anio, double monto ){
        this.nombre = nombre;
        int mesAux=mes-1;
        this.fecha = new Date(anio,mesAux,dia);
        this.monto = monto;
    }
    
    public int hashCode(){
        int primo = 7;
        return nombre.hashCode() + fecha.hashCode() + ((int)monto*primo);
    }
    
    public boolean equals(Object gasto){
        if(this == gasto){
            return true;
        }
        if(gasto == null){
            return false;
        }
        if(this.getClass() != gasto.getClass()){
            return false;
        }
        Gasto otro= (Gasto) gasto;
        return this.nombre.equals(otro.nombre) && this.fecha.equals(otro.fecha) && (this.monto == otro.monto);
    }
    
    public String toString(){
        String s = nombre  + "\t" + fecha.toString() + "\t" + monto;
        return s;
    }
}
