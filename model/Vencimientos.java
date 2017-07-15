package FinancePartner.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Vencimientos {


    private ArrayList<Vencimiento> vencimientos;
    protected Date fechaActual;
    private Scanner scanner;
    public Vencimientos() {
        vencimientos = new ArrayList<Vencimiento>();
        scanner = new Scanner(System.in);

    }
    /*
    ** Como en este caso no tenemos el acceso a la base de datos hacemos que
    ** el usuario ingrese el servicio. En la aplicación real sacaría la información
    ** de una base de datos
     */
    public void agregarVencimiento() {
        System.out.println("Ingrese el nombre del servicio");
        String nombre= scanner.nextLine();
        System.out.println("Ingrese el dia el que vence la factura");
        int dia = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el mes el que vence la factura");
        int mes = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        System.out.println("Ingrese el año el que vence la factura");
        int anio = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer
        vencimientos.add(new Vencimiento(nombre, dia, mes, anio));
    }

    public void imprimirVencimiento() {

        System.out.println("Tus vencimientos:");

        for (Vencimiento unVencimiento : vencimientos) {
            procesarVencimiento(unVencimiento);
        }
    }

    private void procesarVencimiento(Vencimiento unVencimiento) {

        System.out.print("Servicio:");
        System.out.println(unVencimiento.obtenerNombre());
        System.out.println("Fecha de vencimiento:");
        System.out.println(unVencimiento.obtenerFechaVencimiento());

    }

    public void vencimientosMenu() {
            int option;
            do {
                System.out.println("¿Que desea realizar?");
                System.out.println("1. Mostrar vencimientos");
                System.out.println("2. Agregar vencimiento");
                System.out.println("3. Volver");
                option = scanner.nextInt();
                while (validarMenuOpcion(option)) {
                    System.out.print("Valor inválido, ingrese otro: ");
                    option = scanner.nextInt();
                }
                if (option == 1) {
                    scanner.nextLine();
                    imprimirVencimiento();
                }
                if (option == 2) {
                    scanner.nextLine();
                    agregarVencimiento();
                }
            } while (option != 3);
    }
    private boolean validarMenuOpcion(int i){
        return i!=1 && i!=2 && i!=3;

    }
}
