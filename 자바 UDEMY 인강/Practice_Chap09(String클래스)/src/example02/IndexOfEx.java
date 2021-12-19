package example02;

public class IndexOfEx {
	public static void main(String[] args) {
		
		// indexOf메서드는 찾기 기능을 할 때, 자주 쓰인다.
		String str = "오늘은 자바공부가 하고 싶은 날이다";
		int index = str.indexOf("공부");
		System.out.println("공부 시작 인덱스 번호 : " + index);
		
		if(str.indexOf("공부") != -1) {
			System.out.println("공부와 관련된 내용입니다.");
		} else {
			System.out.println("공부와 관련없는 내용입니다.");
		}
		
		
	}
}
