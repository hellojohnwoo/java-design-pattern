package template_method_pattern;

public abstract class AbstConnectHelper {
	// ������ �ȵǱ⶧���� ����Ŭ���������� ��밡���ϵ��� proteced ����

	protected abstract String doSecurity(String string);					// ���� ����: ���� ���� �κ��� ó��
	protected abstract boolean authentication(String id, String password);	// ���� ����: userName�� password�� ��ġ�ϴ��� Ȯ��
	protected abstract int authorization(String userName);					// ���� ����: �����ڰ� ���� ȸ������ ���� ȸ������ ���� ���������� Ȯ��
	protected abstract String connection(String info);						// ���� ����: �����ڿ��� Ŀ�ؼ� ������ �ѱ��.

	
	// ���ø� �޼���
	public String requestConnection(String encodedInfo) {

		String decodedInfo = doSecurity(encodedInfo);		// ���� �۾� -> ��ȣȭ �� ���ڿ��� ��ȣȭ �ڵ�
		
		String id = "aaa";		// ��ȯ�� ���� ������ ���̵�,��ȣ�� �Ҵ��Ѵ�. ���⼱ ���Ƿ� ����.
		String password = "bbb";

		// ���� �۾�
		if (!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}

		String userName = "";
		int i = authorization(userName);
		switch (i) {
		case -1:
			throw new Error("�˴ٿ�");

		case 0:
			System.out.println("���� �޴���");
			break;
		case 1:
			System.out.println("���� ȸ��");
			break;
		case 2:
			System.out.println("���� ȸ��");
			break;
		case 3:
			System.out.println("���Ѿ���");
			break;
		default:
			break;

		}

		return connection(decodedInfo);
	}

}