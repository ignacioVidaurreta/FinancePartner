package FinancePartner.tests.model;

import FinancePartner.model.Ingresos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngresosTest {
    private static final double INIT_INCOME = 0;
    private static final double GASTO = 100;
    Ingresos ing;
    @Before
    public void Before(){
       ing = new Ingresos(INIT_INCOME);
    }

    @Test
    public void addIncomeTest(){
        double modif = INIT_INCOME + 10;
        ing.addIncome(modif - INIT_INCOME); //Sólo quiero lo que le agregué a INIT_INCOME
        assertEquals(modif, ing.getSueldo(), 0.0001);

    }

}