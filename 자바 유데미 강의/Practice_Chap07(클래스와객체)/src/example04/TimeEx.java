package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();

		System.out.println(t1);
		
		// �� ����
		t1.setHour(10);
		
		// �� ����
		t1.setMinute(30);
		
		// �� ����
		t1.setSecond(12);
		
		System.out.println(t1);	// �ڵ������� toStringȣ�� 	
	}
}
