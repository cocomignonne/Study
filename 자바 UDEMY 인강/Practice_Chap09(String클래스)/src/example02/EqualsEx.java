package example02;

public class EqualsEx {

	public static void main(String[] args) {
		String str1 = new String("�̴�");
		String str2 = "�̴�";
		String str3 = "�̴�";
		
		// �ּҺ� ������ ==
		if(str1 == str2) {
			System.out.println("str1�� str2�ּҴ� �����ϴ�");
		} else {
			System.out.println("str1�� str2�ּҴ� �ٸ��ϴ�");
		}
		if(str2 == str3) {
			System.out.println("str2�� str3�ּҴ� �����ϴ�");
		} else {
			System.out.println("str2�� str3�ּҴ� �ٸ��ϴ�");
		}
		
		// ���� ���ϴ� �޼ҵ� .equals()
		// StringŬ������ ObjectŬ������ equals()�������̵��س���.

		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� �����ϴ�");
		} else {
			System.out.println("str1�� str2�� ���� �ٸ��ϴ�");
		}
		if(str2.equals(str3)) {
			System.out.println("str2�� str3�� ���� �����ϴ�");
		} else {
			System.out.println("str2�� str3�� ���� �ٸ��ϴ�");
		}
		
		
		
		
	}

}
