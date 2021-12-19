package example02;

public class EqualsEx {

	public static void main(String[] args) {
		String str1 = new String("미뇽");
		String str2 = "미뇽";
		String str3 = "미뇽";
		
		// 주소비교 연산자 ==
		if(str1 == str2) {
			System.out.println("str1과 str2주소는 같습니다");
		} else {
			System.out.println("str1과 str2주소는 다릅니다");
		}
		if(str2 == str3) {
			System.out.println("str2와 str3주소는 같습니다");
		} else {
			System.out.println("str2와 str3주소는 다릅니다");
		}
		
		// 값을 비교하는 메소드 .equals()
		// String클래스는 Object클래스의 equals()오버라이딩해놨다.

		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 값은 같습니다");
		} else {
			System.out.println("str1과 str2의 값은 다릅니다");
		}
		if(str2.equals(str3)) {
			System.out.println("str2와 str3의 값은 같습니다");
		} else {
			System.out.println("str2와 str3의 값은 다릅니다");
		}
		
		
		
		
	}

}
