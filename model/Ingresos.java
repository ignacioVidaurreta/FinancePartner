package FinancePartner.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingresos {
    private double sueldo;
    private ArrayList<Ingreso> transacciones;
    private Scanner scanner;
    public Ingresos(double saldoInicial) {
        this.sueldo = saldoInicial;
        transacciones = new ArrayList<Ingreso>();
        scanner = new Scanner(System.in);
    }

    public void agregarIngreso(){
        System.out.println("Ingrese una descripcion del Ingreso");
        String desc= scanner.nextLine();
        System.out.println("Ingrese el monto que gasto");
        Double amount = scanner.nextDouble();
        System.out.println("Ingrese el dia el que vence la factura");
        int dia = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el mes el que vence la factura");
        int mes = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el año el que vence la factura");
        int anio = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        transacciones.add(new Ingreso(desc,amount,dia,mes,anio));
        sueldo+=amount;
    }

    public void imprimirIngresos(){
        for (Ingreso in :transacciones){
            System.out.println(in);
        }
        System.out.println("");
    }

    public double getSueldo(){
        return sueldo;
    }

    public void ingresosMenu() {
        int option;
        do {
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Mostrar ingresos");
            System.out.println("2. Agregar un ingreso");
            System.out.println("3. Volver");
            option = scanner.nextInt();
            while (validarMenuOpcion(option)) {
                System.out.print("Valor inválido, ingrese otro: ");
                option = scanner.nextInt();
            }
            if (option == 1) {
                scanner.nextLine();
                imprimirIngresos();
            }
            if (option == 2) {
                scanner.nextLine();
                agregarIngreso();
            }
        }while(option != 3);
    }
    private boolean validarMenuOpcion(int i){
        return i!=1 && i!=2 && i!=3;

    }
}
