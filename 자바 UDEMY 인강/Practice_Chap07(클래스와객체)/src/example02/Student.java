package example02;

public class Student {
	String name;
	int age;
	
	// this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ�� �ȴ� / Student st = new Student();)
	// ��, this�� static�޼��峪 Ŭ�����ȿ� ����Ҽ� ����.
	@Override
	public String toString() {
		return "Student [�̸� :" + this.name + ", ���� : " + this.age + "]";
	}
	
	
}
