package FinancePartner.model;
public class Menu {
    public Menu(){
        Gastos gastos = new Gastos();
        Vencimientos venc = new Vencimientos();
        Informe inf = new Informe();
    }

    public void printMenu(){
        System.out.println(
        "¿Qué quiere hacer?" +
        "Presione 1 para acceder a sus gastos "+
        "Presione 2 para acceder a sus vencimientos"+
        "Presione 3 para generar un informe de sus gastos"); //TODO ver esto
    }


    public Gastos getGastos(Gastos g){
        return g;
    }

    public Vencimientos getVencimientos(Vencimientos v){
        return v;
    }


    public Informe getInforme(Informe i) {
        return i;
    }
}
