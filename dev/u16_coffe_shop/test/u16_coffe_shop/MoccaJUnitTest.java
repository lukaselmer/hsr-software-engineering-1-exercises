package u16_coffe_shop;

import u16_coffe_shop.coffees.CoffeeMocha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoccaJUnitTest {

    Coffee coffee;

    @Before
    public void setUp() throws Exception {
        coffee = new CoffeeMocha();
    }

    @Test
    public void testAmount() {
        assertEquals(355, coffee.getCost());
    }

    @Test
    public void testDescription() {
        assertEquals("CoffeeMocha", coffee.getDescription());
    }
}
