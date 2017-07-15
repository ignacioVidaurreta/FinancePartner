package FinancePartner.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guido
 */
public class Gastos {

    private ArrayList<Gasto> gastos;
    private Menu menu;
    
    public Gastos(){
        menu= new Menu();
        gastos= new ArrayList<Gasto>();
    }
    
    private void agregarGasto(){
        System.out.println("Ingrese el nombre del gasto");
        Scanner reader= new Scanner(System.in);        
        String nombre= reader.next();
        System.out.println("Ingrese el dia el cual fue realizado el gasto");
        int dia = reader.nextInt();
        System.out.println("Ingrese el mes el cual fue realizado el gasto");
        int mes = reader.nextInt();
        System.out.println("Ingrese el año el cual fue realizado el gasto");
        int anio = reader.nextInt();
        System.out.println("Ingrese el monto que gasto");
        double monto = reader.nextDouble();

        gastos.add(new Gasto(nombre,dia,mes,anio,monto));        
    }
    
    private void imprimirGastos(){
        for(Gasto g: gastos)
            System.out.println(g);
    }
    
    private boolean validarMenuOpcion(int i){
        if(i!=1 || i!=2 || i!=3)
            return false;
        return true;
    }
    
    public void gastosMenu(){
        int option;
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Mostrar resultados");
        System.out.println("2. Agregar gasto");
        System.out.println("3. Volver");
        Scanner reader= new Scanner(System.in);
        option= reader.nextInt();
        while(validarMenuOpcion(option)){
            option= reader.nextInt();
        }
        if(option==1)
            imprimirGastos();
        if(option==2)
            agregarGasto();
        menu.printMenu();
    }
}
