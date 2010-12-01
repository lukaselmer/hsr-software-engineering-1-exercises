package u16_coffe_shop.coffees;

import u16_coffe_shop.Coffee;

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:19
 */
public class CaffeeLatte implements Coffee {

    public CaffeeLatte() {
    }

    public float getCost() {
        return 355;
    }

    public String getDescription() {
        return this.getClass().getSimpleName() + " with water";
    }
}
