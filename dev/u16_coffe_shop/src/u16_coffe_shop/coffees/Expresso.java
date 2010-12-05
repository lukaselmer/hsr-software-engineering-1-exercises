package u16_coffe_shop.coffees;

import u16_coffe_shop.Coffee;

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public class Expresso implements Coffee {

    long cost = 355;
    String description = this.getClass().getSimpleName();

    public Expresso() {
    }

    public long getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
