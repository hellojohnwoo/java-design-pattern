package factory_method_pattern;

/*
 	What is Factory?
 	
 	< # Factory Pattern >
 	1. Role : instantiate a class
 				//객체 생성을 담당하는 클래스를 따로 만들고 
 	
 	2. Point : loosing coupling between Creator and Product
 				// 생성하는 클래스와 사용하는 클래스 간의 연관관계를 무력화 시켜라.
 				  	 
 	3. Benefit : no effect from changing of creation way for Product
 	
 	
 	
 */


class Product {
	public Product(String s) { }
}

class Factory{
	public static Product getInstance() {
		return Product("car");
	}

	private static Product Product(String string) {
		
		return null;
	}

}

class UserA {
	public void doSomething() {
		Product p = Factory.getInstance();
	}
}
// 시스템에 관련된 것들을 임의의 클래스가 사용할 수 있다는 건
// 상당히 위험한 것이다. ex) 리소스 부족, 메모리 부족, DB 커넥션, IO 등등... 
// system low level에 관련된 것들은 개발자에게 직접적인 접근하지 못하게 한다.
// Factory Class를 만들어서, getInstance 로 접근하게 한다.




public class Lecture01 {

}
