package example02;

public class IndexOfEx {
	public static void main(String[] args) {
		
		// indexOf�޼���� ã�� ����� �� ��, ���� ���δ�.
		String str = "������ �ڹٰ��ΰ� �ϰ� ���� ���̴�";
		int index = str.indexOf("����");
		System.out.println("���� ���� �ε��� ��ȣ : " + index);
		
		if(str.indexOf("����") != -1) {
			System.out.println("���ο� ���õ� �����Դϴ�.");
		} else {
			System.out.println("���ο� ���þ��� �����Դϴ�.");
		}
		
		
	}
}
