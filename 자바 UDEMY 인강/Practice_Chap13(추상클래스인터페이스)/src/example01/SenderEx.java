package example01;

public class SenderEx {

	public static void main(String[] args) {

//		ContentSender contentSender = new ContentSender();  �߻�Ŭ������ �ν��Ͻ��� ������ �� ����
		
//		�߻�Ŭ������ �����̴ϱ� �ʵ��� �������� ����ȴ�.
		ContentSender contentSender = new KakaoSender("īī����", "�����", "���� �ʳ�ó�� �Ḹ �ڰ� �ʹ�");
		
		contentSender.sendMessage("���ڹ̴�");
		
		System.out.println("============================");

		ContentSender contentSender2 = new SmsSender("SMS", "�����", "���� �� ����");
		
		contentSender2.sendMessage("�����");
	}

}
