package template_method_pattern;

public class TemplateMain {
	
	public static void main(String[] args) {
		AbstConnectHelper helper = new DefaultConnectionHelper();
		
		helper.requestConnection("���̵�, ��ȣ �� ���� ���� : ");
	}
	

}
