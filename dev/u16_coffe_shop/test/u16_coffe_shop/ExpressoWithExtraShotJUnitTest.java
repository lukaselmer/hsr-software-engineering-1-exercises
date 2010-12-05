package u16_coffe_shop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import u16_coffe_shop.coffee_decorators.ExtraShot;
import u16_coffe_shop.coffees.Expresso;

public class ExpressoWithExtraShotJUnitTest {

    Coffee coffee;

    @Before
    public void setUp() throws Exception {
        coffee = new ExtraShot(new Expresso());
    }

    @Test
    public void testAmount() {
        assertEquals(200 + 355, coffee.getCost());
    }

    @Test
    public void testDescription() {
        assertEquals("Expresso with ExtraShot", coffee.getDescription());
    }
}
