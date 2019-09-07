package singleton;

public class Singleton {
	// 이 안에 사실은 JVM이 디폴트 생성자를 만들어준다.
	// public Singleton() { };
	// 근데, 우리는 JVM이 디폴트생성자 못만들도록 명시적 private으로 만들어주자.
	// 그래서 밖의 임의의 클래스에서는 접근할 수가 없다. 
	private Singleton() { }
	
	// Singleton instance = new Singleton(); // non-static은 객체생성을 통해서만 접근.
										  // s. ~ 로 못 접근한다.
	
	private static Singleton instance = new Singleton(); // OOP의 특징이라서 private 로 해줘야.
	
												// 1. 인스턴스변수를 접근하는방법 = 메소드 in OOP.
	public static Singleton getSingleton() {	// 2. 거기에 "static" 붙여줘 = 객체생성없이 쓸 수 있게~
		return instance;						// 3. static 에서는 non-static에 접근 못하니까, 윗 구문에도 "static" 
	}											
	
}
