

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public class Decaf extends CoffeeDecorator {

	public Decaf(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getCoast(){
		return null;
	}

	public String getDescription(){
		return "";
	}

}