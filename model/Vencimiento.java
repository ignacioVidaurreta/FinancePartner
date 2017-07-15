package FinancePartner.model;
import java.util.Date;

public class Vencimiento {


    protected String nombre;
    protected Date fechaVencimiento;

    public Vencimiento(String nombre,int dia, int mes, int anio){

        this.nombre = nombre;
        int mesAux=mes-1;
        fechaVencimiento =  new Date(anio, mes, dia);
    }

    public String obtenerNombre() {
        return nombre;
    }



    public Date obtenerFechaVencimiento(){
        return fechaVencimiento;
    }


}

