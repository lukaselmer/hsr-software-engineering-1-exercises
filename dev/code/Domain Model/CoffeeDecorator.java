

/**
 * @author Lukas Elmer
 * @version 1.0
 * @created 01-Dez-2010 14:11:20
 */
public abstract class CoffeeDecorator implements Coffee {

	public Coffee m_Coffee;

	public CoffeeDecorator(){

	}

	public void finalize() throws Throwable {

	}

	public float getCoast(){
		return null;
	}

	public String getDescription(){
		return "";
	}

}