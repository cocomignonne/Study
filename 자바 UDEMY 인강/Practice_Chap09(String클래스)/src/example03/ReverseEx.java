package example03;

public class ReverseEx {

	public static void main(String[] args) {

		String str = "�ȳ��ϼ���";
		String reverse = "";
		
		int count = 0;
		
		count = str.length();
		
		System.out.println("���ڿ��� ���� : " + count);
		
		for(int i=0; i < count; i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
			System.out.println(reverse.hashCode());
		} // ���� ó���ϴ� �������� ��ü�� �ʹ� ���� ���ܼ� �޸� ���� �ʹ� ����
		// �׷��� reverseString()�޼��带 ���� ó������ ���̴�.
		System.out.println(reverse);
		
		System.out.println();
		
		String reverseStr = reverseString(str);
		System.out.println("reverseString�޼ҵ�� ���� ���� : " + reverseStr);
		System.out.println("reverseString�޼ҵ�� ���� ���� �� ���ڿ� ���� : " + reverseStr.length());
	}
	
	public static String reverseString(String str) {
		return (new StringBuilder(str)).reverse().toString();
	}
	

}
