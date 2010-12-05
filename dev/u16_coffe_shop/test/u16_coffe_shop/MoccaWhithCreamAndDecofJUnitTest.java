package u16_coffe_shop;

import u16_coffe_shop.coffee_decorators.Decaf;
import u16_coffe_shop.coffee_decorators.WhippedCream;
import u16_coffe_shop.coffees.CoffeeMocha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoccaWhithCreamAndDecofJUnitTest {

    Decaf moccaWhithCreamAndDecof;

    @Before
    public void setUp() throws Exception {
        moccaWhithCreamAndDecof = new Decaf(new WhippedCream(new CoffeeMocha()));
    }

    @Test
    public void testAmount() {
        assertEquals(90 + 355, moccaWhithCreamAndDecof.getCost());
    }

    @Test
    public void testDescription() {
        assertEquals("CoffeeMocha with WhippedCream, Decaf", moccaWhithCreamAndDecof.getDescription());
    }
}
