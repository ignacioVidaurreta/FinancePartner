package FinancePartner.model;

import java.util.Scanner;
import FinancePartner.views.Screens;

public class FinancePartner {
    public static void main(String[] str){
        double saldoInicial = 1000;
        double saldoTotal = saldoInicial;
        Ingresos i = new Ingresos(saldoInicial);
        Gastos g = new Gastos();
        Vencimientos v = new Vencimientos();
        Menu menu = new Menu();

        int choice;
        do {
            menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Choose: ");
                choice = Integer.parseInt(scanner.next());
                scanner.nextLine(); //In case user inputs more than one char
            } while ((choice != 1) && (choice != 2) && (choice != 3) && (choice!=4));
            switch (choice) {
                case 1:
                    g.gastosMenu();
                    break;
                case 2:
                    v.vencimientosMenu();
                    break;
                case 3:
                    i.ingresosMenu();
                    break;
            }
        }while(choice != 4);
    }

}
