package flyweight_pattern;

public class FlyweightMain {
	
	public static void main(String[] args) {		// *Focus : Memory!!
	
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		
		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);
		
		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);

	}

}
