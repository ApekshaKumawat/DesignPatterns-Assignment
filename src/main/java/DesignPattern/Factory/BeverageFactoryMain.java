package DesignPattern.Factory;

class Tea implements IBeverage {
    @Override
    public void consume() {
        System.out.println("Drinking tea");
    }
}

class Coffee implements IBeverage {
    @Override
    public void consume() {
        System.out.println("Drinking coffee");
    }
}

class Juice implements IBeverage {
    @Override
    public void consume() {
        System.out.println("Drinking juice");
    }
}


abstract class BeverageFactory {
    public abstract IBeverage createBeverage();
}

class TeaFactory extends BeverageFactory {
    @Override
    public IBeverage createBeverage() {
        return new Tea();
    }
}

class CoffeeFactory extends BeverageFactory {
    @Override
    public IBeverage createBeverage() {
        return new Coffee();
    }
}

class JuiceFactory extends BeverageFactory {
    @Override
    public IBeverage createBeverage() {
        return new Juice();
    }
}

public class BeverageFactoryMain {
    public static void main(String[] args) {
    	
        BeverageFactory teaFactory = new TeaFactory();
        IBeverage tea = teaFactory.createBeverage();
        tea.consume();  
        
        BeverageFactory coffeeFactory = new CoffeeFactory();
        IBeverage coffee = coffeeFactory.createBeverage();
        coffee.consume();  
        
        BeverageFactory juiceFactory = new JuiceFactory();
        IBeverage juice = juiceFactory.createBeverage();
        juice.consume(); 
        
    }
}