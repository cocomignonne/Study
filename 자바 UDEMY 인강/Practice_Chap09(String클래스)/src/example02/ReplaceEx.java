package example02;

public class ReplaceEx {

	public static void main(String[] args) {
		// replace() ���ڿ��� ��ü�ϴ� �޼ҵ�
		String oldstr = "�ڹٴ� ��ü�������Դϴ�";
		
		String newstr = oldstr.replace("�ڹ�", "JAVA");
		
		System.out.println(newstr);

		System.out.println("oldstr.hashCode() : " + oldstr.hashCode());
		System.out.println("newstr.hashCode() : " + newstr.hashCode());
		
	}

}
