package u16_coffe_shop.coffee_decorators;

import u16_coffe_shop.Coffee;
import u16_coffe_shop.CoffeeDecorator;

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public class Decaf extends CoffeeDecorator {

    long extraCost = 0;
    String description = this.getClass().getSimpleName();

    public Decaf(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getSeperator() + this.getClass().getSimpleName();
    }
}
