package singleton;

/*
 	< # Singleton >
 	
 	why? Too man cooks spoil the stew
 	- Absolutely One, Only One
 	
 	
 	# How to make?
 	[ Fully understanding 'static' keyword ]
 	
 	- No access to Constructor
 	- Declare class's object as Staic Member Variable
 						(Of Course no access to this object)
 						
    - Instantiate class's own instance inside class
    - Provide static method that can acess object	
    
 */

public class StaticVariable {
	
	// int i;
	static int i;
	
	// main���� static ������, Ŭ���� �������� ��Ʈ�� ����Ʈ�� ��ã��. ��ü������ ���� ����� �Ѵ�. 
	// * static�� ���� ū Ư¡ : �ν��Ͻ� ������ �ƴ϶�, Ŭ���� ����! : �׷��� �ν��Ͻ� ������ �����ϴ�.
	public static void main(String args[]) {	
		
		// StaticVariable sv = new StaticVariable();
		
		System.out.println("Variable i is " + i);
		
		// sv.method();
		method();
	}
	
	public static void method() {
		
	}

}
