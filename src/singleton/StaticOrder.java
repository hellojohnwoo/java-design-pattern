package singleton;

public class StaticOrder {
	static int counter=1;

	public static void main(String[] args) {
		counter++;
		System.out.println("static method (static main) : " +counter + " th");
	}

	// entry point가 되는 main()메소드 에 앞서서 먼저 단, 한번만 실행된다.
	static {
		counter++;
		System.out.println("static initializer (static block) : " + counter + " th");
	}
	
}
