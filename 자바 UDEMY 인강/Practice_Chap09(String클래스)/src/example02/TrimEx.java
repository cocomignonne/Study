package example02;

public class TrimEx {

	public static void main(String[] args) {

		String tel1 = "     010";
		String tel2 = "-2654    ";
		String tel3 = "    -3943  ";
		
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		 
		// trim()�� �¿� ���鸸 ����
		// �߰��� �ִ� ������ �����Ϸ��� �����ڰ� �ڵ带 �ۼ��ؼ� ó���ؾ��Ѵ�.
	}

}
