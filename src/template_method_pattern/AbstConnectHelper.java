package template_method_pattern;

public abstract class AbstConnectHelper {
	// 노출이 안되기때문에 하위클래스에서만 사용가능하도록 proteced 선언

	protected abstract String doSecurity(String string);					// 보안 과정: 보안 관련 부분을 처리
	protected abstract boolean authentication(String id, String password);	// 인증 과정: userName과 password가 일치하는지 확인
	protected abstract int authorization(String userName);					// 권한 과정: 접속자가 유료 회원인지 무료 회원인지 게임 마스터인지 확인
	protected abstract String connection(String info);						// 접속 과정: 접속자에게 커넥션 정보를 넘긴다.

	
	// 템플릿 메서드
	public String requestConnection(String encodedInfo) {

		String decodedInfo = doSecurity(encodedInfo);		// 보안 작업 -> 암호화 된 문자열을 복호화 코드
		
		String id = "aaa";		// 반환된 것을 가지고 아이디,암호를 할당한다. 여기선 임의로 지정.
		String password = "bbb";

		// 인증 작업
		if (!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}

		String userName = "";
		int i = authorization(userName);
		switch (i) {
		case -1:
			throw new Error("셧다운");

		case 0:
			System.out.println("게임 메니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한없음");
			break;
		default:
			break;

		}

		return connection(decodedInfo);
	}

}