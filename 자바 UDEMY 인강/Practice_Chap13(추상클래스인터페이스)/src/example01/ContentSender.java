package example01;

// �߻�Ŭ���� : 1�� �̻��� �߻�޼ҵ带 �����ϴ� Ŭ����
public abstract class ContentSender {

	private String title;
	private String name;
	
//	������
	public ContentSender(String title, String name) {
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
//	�߻�޼��带 ���� ���� ���������ڴ� �׻� public���� �ϱ�
//	�߻�޼���� ����� ���ؼ� ������ �Ǿ����߸� �ν��Ͻ��� ������ �� �ִ�.
	public abstract void sendMessage(String content);
	
	
}
