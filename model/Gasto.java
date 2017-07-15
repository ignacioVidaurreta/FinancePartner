package FinancePartner.model;

import java.util.ArrayList;
import java.util.Date;

public class Gasto {

    private String nombre;
    private Date fecha;
    private double monto;
    private ArrayList<String> tags;

    public Gasto(String nombre, int dia, int mes, int anio, double monto ){
        this.nombre = nombre;
        this.fecha = new Date(anio,mes,dia);
        this.monto = monto;
        tags = new ArrayList<String>();
    }

    private void agregarTag(String tag){
        tags.add(tag);
    }

    private boolean tagsEquals(ArrayList<String> tags){
        for(String tag: tags){
            if(!this.tags.contains(tag))
                return false;
        }
        return true;
    }

    private int tagsHashCode(){
        int total = 0;
        for(String tag: this.tags){
            total += tag.hashCode();
        }
        return total;
    }

    public int hashCode(){
        int primo = 7;
        return nombre.hashCode() + fecha.hashCode() + ((int)monto*primo) + this.tagsHashCode();
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
        return this.nombre.equals(otro.nombre) && this.fecha.equals(otro.fecha) && (this.monto == otro.monto) && this.tagsEquals(otro.tags);
    }
}
