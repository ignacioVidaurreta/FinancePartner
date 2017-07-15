package FinancePartner.model;
public class Menu {
    public Menu(){
        Gastos gastos = new Gastos();
        Vencimientos venc = new Vencimientos();
        Informe inf = new Informe();
    }

    public void printMenu(){
        System.out.println(
        "¿Qué quiere hacer? \n" +
        "Presione 1 para acceder a sus gastos\n"+
        "Presione 2 para acceder a sus vencimientos\n"+
        "Presione 3 para ver los ingresos\n"+
        "Presione 4 para salir");
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
