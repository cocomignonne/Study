package example03;

public class ReverseEx {

	public static void main(String[] args) {

		String str = "안녕하세요";
		String reverse = "";
		
		int count = 0;
		
		count = str.length();
		
		System.out.println("문자열의 길이 : " + count);
		
		for(int i=0; i < count; i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
			System.out.println(reverse.hashCode());
		} // 역순 처리하는 과정에서 객체가 너무 많이 생겨서 메모리 낭비가 너무 심함
		// 그래서 reverseString()메서드를 만들어서 처리해줄 것이다.
		System.out.println(reverse);
		
		System.out.println();
		
		String reverseStr = reverseString(str);
		System.out.println("reverseString메소드로 역순 정렬 : " + reverseStr);
		System.out.println("reverseString메소드로 역순 정렬 후 문자열 길이 : " + reverseStr.length());
	}
	
	public static String reverseString(String str) {
		return (new StringBuilder(str)).reverse().toString();
	}
	

}
