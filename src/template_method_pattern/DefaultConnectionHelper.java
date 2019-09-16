package template_method_pattern;

public class DefaultConnectionHelper extends AbstConnectHelper {
	
	@Override
	protected String doSecurity(String string) {
		System.out.println("���ڵ� �۾�");
		//string�� ���ڵ� �Ͽ� ��ȯ
		//����!!
		System.out.println("��ȭ�� �˰��� ���ڵ� �۾�");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		//Ȯ�� �� ������ true Ʋ���� false boolean ������ �۾� ���⼭�� �׳� ������ �´ٰ� true�� ó��
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		//����: �������� ���� ���̸� �������� 
		//���� Ȯ�� �� ������ �ƴϰ� 10�ð� �����ٸ� 
		//������ ���� ������ �Ѱ��ش�.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���� �ܰ�!");
		return info;
	}

}


