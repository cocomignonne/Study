package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();

		System.out.println(t1);
		
		// 시 설정
		t1.setHour(10);
		
		// 분 설정
		t1.setMinute(30);
		
		// 초 설정
		t1.setSecond(12);
		
		System.out.println(t1);	// 자동적으로 toString호출 	
	}
}
