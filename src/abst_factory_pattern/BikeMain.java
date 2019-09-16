package abst_factory_pattern;

import bike_maker.SamFactory;

public class BikeMain {
	public static void main(String[] args) {
		BikeFactory fac = new SamFactory();
				
		Body body = fac.makeBody();
		Wheel wheel = fac.makeWheel();
	}

}
