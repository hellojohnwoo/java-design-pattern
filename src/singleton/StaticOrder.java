package singleton;

public class StaticOrder {
	static int counter=1;

	public static void main(String[] args) {
		counter++;
		System.out.println("static method (static main) : " +counter + " th");
	}

	// entry point�� �Ǵ� main()�޼ҵ� �� �ռ��� ���� ��, �ѹ��� ����ȴ�.
	static {
		counter++;
		System.out.println("static initializer (static block) : " + counter + " th");
	}
	
}
