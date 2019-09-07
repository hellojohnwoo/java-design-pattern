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
	
	// main문에 static 없으면, 클래스 레벨에서 엔트리 포인트를 못찾음. 객체생성을 따로 해줘야 한다. 
	// * static의 가장 큰 특징 : 인스턴스 레벨이 아니라, 클래스 레벨! : 그래서 인스턴스 생성과 무관하다.
	public static void main(String args[]) {	
		
		// StaticVariable sv = new StaticVariable();
		
		System.out.println("Variable i is " + i);
		
		// sv.method();
		method();
	}
	
	public static void method() {
		
	}

}
