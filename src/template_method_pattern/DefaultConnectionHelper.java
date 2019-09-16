package template_method_pattern;

public class DefaultConnectionHelper extends AbstConnectHelper {
	
	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드 작업");
		//string을 디코드 하여 반환
		//수정!!
		System.out.println("강화된 알고리즘 디코딩 작업");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		//확인 후 맞으면 true 틀리면 false boolean 변수로 작업 여기서는 그냥 무조건 맞다고 true로 처리
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		//수정: 서버에서 유저 나이를 가져오고 
		//나이 확인 후 성인이 아니고 10시가 지났다면 
		//권한이 없는 것으로 넘겨준다.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단게!");
		return info;
	}

}


