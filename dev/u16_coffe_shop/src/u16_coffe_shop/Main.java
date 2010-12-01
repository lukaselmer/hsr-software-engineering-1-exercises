package u16_coffe_shop;

import u16_coffe_shop.coffee_decorators.Decaf;
import u16_coffe_shop.coffee_decorators.WhippedCream;
import u16_coffe_shop.coffees.CoffeeMocha;

/**
 *
 * @author Lukas Elmer
 */
public class Main {

    public static void main(String[] args) {
        Coffee moccaWhithCreamAndDecof = new Decaf(new WhippedCream(new CoffeeMocha()));
        System.out.println(moccaWhithCreamAndDecof.getDescription());
        System.out.println(moccaWhithCreamAndDecof.getCost());
    }
}
