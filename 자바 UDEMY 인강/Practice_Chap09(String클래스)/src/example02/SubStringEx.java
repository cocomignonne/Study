package example02;

public class SubStringEx {

	public static void main(String[] args) {
		
		String phoneNum = "01056781234";
		
		// subString()�� ���ڿ��� �߶󳻾� String���� ��ȯ
		String str1 = phoneNum.substring(3);
		System.out.println(str1);

		// ������ �ε����� ������
		String str2 = phoneNum.substring(1,5);
		System.out.println(str2);

	}

}
