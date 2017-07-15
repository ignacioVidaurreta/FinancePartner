package FinancePartner.model;

import java.util.ArrayList;

public class Ingresos {
    private double sueldo;
    private ArrayList<Double> transacciones;
    public Ingresos(double saldoInicial) {
        this.sueldo = saldoInicial;
        transacciones = new ArrayList<Double>();
    }

    public void addIncome(double inc){
        sueldo+=inc;
        transacciones.add(inc);
    }

    public double getSueldo(){
        return sueldo;
    }

}
