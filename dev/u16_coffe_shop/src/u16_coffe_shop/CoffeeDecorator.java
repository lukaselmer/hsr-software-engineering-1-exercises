package u16_coffe_shop;

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public long getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    protected boolean isFirstDecorator() {
        return !(decoratedCoffee instanceof CoffeeDecorator);
    }

    protected String getSeperator() {
        return (isFirstDecorator() ? " with " : ", ");
    }
}
