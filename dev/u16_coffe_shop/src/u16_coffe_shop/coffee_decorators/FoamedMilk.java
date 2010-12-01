package u16_coffe_shop.coffee_decorators;

import u16_coffe_shop.Coffee;
import u16_coffe_shop.CoffeeDecorator;

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public class FoamedMilk extends CoffeeDecorator {

    public FoamedMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public float getCost() {
        return super.getCost() + 150;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + seperator + this.getClass().getSimpleName();
    }
}
