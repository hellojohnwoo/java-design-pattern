package singleton;

public class Singleton {
	// �� �ȿ� ����� JVM�� ����Ʈ �����ڸ� ������ش�.
	// public Singleton() { };
	// �ٵ�, �츮�� JVM�� ����Ʈ������ �����鵵�� ����� private���� ���������.
	// �׷��� ���� ������ Ŭ���������� ������ ���� ����. 
	private Singleton() { }
	
	// Singleton instance = new Singleton(); // non-static�� ��ü������ ���ؼ��� ����.
										  // s. ~ �� �� �����Ѵ�.
	
	private static Singleton instance = new Singleton(); // OOP�� Ư¡�̶� private �� �����.
	
												// 1. �ν��Ͻ������� �����ϴ¹�� = �޼ҵ� in OOP.
	public static Singleton getSingleton() {	// 2. �ű⿡ "static" �ٿ��� = ��ü�������� �� �� �ְ�~
		return instance;						// 3. static ������ non-static�� ���� ���ϴϱ�, �� �������� "static" 
	}											
	
}
