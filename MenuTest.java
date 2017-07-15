package finanzas;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {
    Menu menu;
    @Before
    public void Before(){
        menu = new Menu();
    }

    @Test
    public void inGastosTest(){
        Gastos dummy = new Gastos();
        assertEquals(dummy.getClass(),menu.getGastos(dummy).getClass());
    }

    @Test
    public void inVencimientos(){
        Vencimientos dummy = new Vencimientos();
        assertEquals(dummy.getClass(), menu.getVencimientos(dummy).getClass());
    }

    @Test
    public void inInforme(){
        Informe dummy = new Informe();
        assertEquals(dummy.getClass(), menu.getInforme(dummy).getClass());
    }

}
