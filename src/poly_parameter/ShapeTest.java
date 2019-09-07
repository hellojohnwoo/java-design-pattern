package poly_parameter;

//3-4. Polymorphic Parameter

public class ShapeTest {
	public static void main(String[] args) {
		
		//Shape s = new Shape();
		Triangle t  = new Triangle();
		
		// t.draw();
		//draw(t);
	
		Rectangle r = new Rectangle();
		draw(r);		// 1. 파라미터가 하나짜린데 적절한 녀석이 없어서 draw()를 찾아
						// 2. 자바는 그러면 promotion을 시켜서 이용한다.
		
		
		Shape t2 = new Triangle();		// 좌측은 타입으로 = 우측은 실질적인 객체 ****
	}
	
	public static void draw(Shape s) {	// ** 파라미터로 넘어오는게 뭐든지!
		s.draw();
	}
	// <<abstract>> 는 +void draw()
	// <concrete>> 의 +void draw() 의 재정의(오버라이드)를 강제한다! **
	
	
	/*
	public static void draw(Triangle t) {
		t.draw();
	}
	*/
	
}
