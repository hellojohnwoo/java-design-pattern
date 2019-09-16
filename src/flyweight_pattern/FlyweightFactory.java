package flyweight_pattern;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {
	
	Map<String, Flyweight> pool; 
	
	public FlyweightFactory() {
		pool = new TreeMap<>();
	}
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = pool.get(key);
		
		if(flyweight == null) {
			flyweight =  new Flyweight(key);
			pool.put(key, flyweight);
			System.out.println("[ New Product] : " +key);
			System.out.println();
			
		}else {
			System.out.println(">> Re-Use : " + key);
			System.out.println();
		}
		
		return flyweight;
	}

	
}
