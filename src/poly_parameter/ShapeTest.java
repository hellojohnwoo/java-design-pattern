package poly_parameter;

//3-4. Polymorphic Parameter

public class ShapeTest {
	public static void main(String[] args) {
		
		//Shape s = new Shape();
		Triangle t  = new Triangle();
		
		// t.draw();
		//draw(t);
	
		Rectangle r = new Rectangle();
		draw(r);		// 1. �Ķ���Ͱ� �ϳ�¥���� ������ �༮�� ��� draw()�� ã��
						// 2. �ڹٴ� �׷��� promotion�� ���Ѽ� �̿��Ѵ�.
		
		
		Shape t2 = new Triangle();		// ������ Ÿ������ = ������ �������� ��ü ****
	}
	
	public static void draw(Shape s) {	// ** �Ķ���ͷ� �Ѿ���°� ������!
		s.draw();
	}
	// <<abstract>> �� +void draw()
	// <concrete>> �� +void draw() �� ������(�������̵�)�� �����Ѵ�! **
	
	
	/*
	public static void draw(Triangle t) {
		t.draw();
	}
	*/
	
}
