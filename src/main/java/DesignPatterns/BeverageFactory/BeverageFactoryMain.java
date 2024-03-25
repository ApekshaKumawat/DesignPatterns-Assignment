package DesignPatterns.BeverageFactory;

interface Beverage{
	void consume();
}

class Juice implements Beverage{

	@Override
	public void consume() {
		
		System.out.println("Drinking Juice");
		
	}
	
}

class Coffee implements Beverage{

	@Override
	public void consume() {
		
		System.out.println("Drinking Coffee");
		
	}
	
}

class Tea implements Beverage{

	@Override
	public void consume() {
		
		System.out.println("Drinking Tea");
		
	}
	
}

class Shake implements Beverage{

	@Override
	public void consume() {
		
		System.out.println("Drinking Shake");
		
	}
	
}

class Smoothies implements Beverage{

	@Override
	public void consume() {
		
		System.out.println("Having Smoothies");
		
	}
	
}

class BeverageFactory{
	private static  BeverageFactory instance;
	
	private BeverageFactory() {}
	
	public static synchronized BeverageFactory getInstance() {
		if(instance == null) {
			instance = new BeverageFactory();
		}
		return instance;
		
	}
	
	public Beverage prepareBeverage(String beverageType) {
		switch(beverageType) {
		case "juice":
			return new Juice();
		case "coffee":
			return new Coffee();
		case "smoothies":
			return new Smoothies();
		case "tea":
			return new Tea();
		case "shake":
			return new Shake();
		default:
			throw new IllegalArgumentException("Sorry, Not available!");			
		}
	}
	
}

public class BeverageFactoryMain 
{
    public static void main( String[] args )
    {
        BeverageFactory factory = BeverageFactory.getInstance();
        
        Beverage tea = factory.prepareBeverage("tea");
        tea.consume();
        
        Beverage coffee = factory.prepareBeverage("coffee");
        coffee.consume();
        
        Beverage smoothies = factory.prepareBeverage("smoothies");
        smoothies.consume();
        
        Beverage juice = factory.prepareBeverage("juice");
        juice.consume();
        
        Beverage shake = factory.prepareBeverage("shake");
        shake.consume();
    }
}
