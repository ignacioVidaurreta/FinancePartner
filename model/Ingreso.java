package FinancePartner.model;


import java.util.Date;

public class Ingreso {
    String desc;
    double valor;
    Date date;
    public Ingreso(String desc, double valor, int dia, int mes, int anio){
        this.desc=desc;
        this.valor=valor;
        int mesAux = mes-1;
        date = new Date(anio, mesAux, dia);
    }

    public String toString(){
        return desc + valor + date;
    }

    public double getValor() {
        return valor;
    }
}
