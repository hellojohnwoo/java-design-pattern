package factory_method_pattern;

/*
 	What is Factory?
 	
 	< # Factory Pattern >
 	1. Role : instantiate a class
 				//��ü ������ ����ϴ� Ŭ������ ���� ����� 
 	
 	2. Point : loosing coupling between Creator and Product
 				// �����ϴ� Ŭ������ ����ϴ� Ŭ���� ���� �������踦 ����ȭ ���Ѷ�.
 				  	 
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
// �ý��ۿ� ���õ� �͵��� ������ Ŭ������ ����� �� �ִٴ� ��
// ����� ������ ���̴�. ex) ���ҽ� ����, �޸� ����, DB Ŀ�ؼ�, IO ���... 
// system low level�� ���õ� �͵��� �����ڿ��� �������� �������� ���ϰ� �Ѵ�.
// Factory Class�� ����, getInstance �� �����ϰ� �Ѵ�.




public class Lecture01 {

}
