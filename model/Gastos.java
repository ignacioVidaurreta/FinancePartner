package FinancePartner.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Gastos {

    private ArrayList<Gasto> gastos;
    private Scanner scanner;
    public Gastos(){
        gastos= new ArrayList<Gasto>();
        scanner = new Scanner(System.in);
    }
    
    private void agregarGasto(){
        System.out.println("Ingrese el nombre del gasto");
        String nombre= scanner.nextLine();
        System.out.println("Ingrese el dia el cual fue realizado el gasto");
        int dia = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el mes el cual fue realizado el gasto");
        int mes = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el año el cual fue realizado el gasto");
        int anio = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el monto que gasto");
        double monto = scanner.nextDouble();
        scanner.nextLine(); //Limpia el buffer

        gastos.add(new Gasto(nombre,dia,mes,anio,monto));        
    }
    
    private void imprimirGastos(){
        for(Gasto g: gastos)
            System.out.println(g);
        System.out.println("");
    }
    
    private boolean validarMenuOpcion(int i){
        return i!=1 && i!=2 && i!=3;

    }
    
    public void gastosMenu(){
        int option;
        do {
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Mostrar resultados");
            System.out.println("2. Agregar gasto");
            System.out.println("3. Volver");
            option = scanner.nextInt();
            while (validarMenuOpcion(option)) {
                System.out.print("Valor inválido, ingrese otro: ");
                option = scanner.nextInt();
            }
            if (option == 1) {
                scanner.nextLine();
                imprimirGastos();
            }
            if (option == 2) {
                scanner.nextLine();
                agregarGasto();
            }
        }while(option != 3);
    }
}
