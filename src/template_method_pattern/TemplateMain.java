package template_method_pattern;

public class TemplateMain {
	
	public static void main(String[] args) {
		AbstConnectHelper helper = new DefaultConnectionHelper();
		
		helper.requestConnection("아이디, 암호 등 접속 정보 : ");
	}
	

}
