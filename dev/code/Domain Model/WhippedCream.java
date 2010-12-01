

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public class WhippedCream extends CoffeeDecorator {

	public WhippedCream(){

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