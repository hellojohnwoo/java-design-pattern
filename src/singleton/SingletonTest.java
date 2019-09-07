package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		/*
		Singleton s  = new Singleton();
		Singleton s2 = new Singleton();
		
		System.out.println(s);
		System.out.println(s2);
		*/
		
		// s.~
		
		Singleton s11 = Singleton.getSingleton();
		Singleton s22 = Singleton.getSingleton();
		System.out.println(s11);
		System.out.println(s22);
	}

}
