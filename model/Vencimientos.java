import java.util.ArrayList;
import java.util.Date;


public class Vencimientos {


    protected ArrayList<Vencimiento> vencimientos;
    protected Date fechaActual;

    public void agregarVencimiento(Vencimiento unVencimiento){


        vencimientos.add(unVencimiento);

    }

    public void mostrarVencimiento(){

        System.out.println("Tus vencimientos:");

        for (Vencimiento unVencimiento: vencimientos){
                   procesarVencimiento(unVencimiento);
        }
    }

    private void procesarVencimiento(Vencimiento unVencimiento) {

        System.out.print("Servicio:");
        System.out.println(unVencimiento.obtenerNombre());
        System.out.println("Fecha de vencimiento:");
        System.out.println(unVencimiento.obtenerFechaVencimiento());

    }
}
