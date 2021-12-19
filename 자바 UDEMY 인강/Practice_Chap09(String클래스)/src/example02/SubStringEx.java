package example02;

public class SubStringEx {

	public static void main(String[] args) {
		
		String phoneNum = "01056781234";
		
		// subString()은 문자열을 잘라내어 String으로 반환
		String str1 = phoneNum.substring(3);
		System.out.println(str1);

		// 마지막 인덱스는 미포함
		String str2 = phoneNum.substring(1,5);
		System.out.println(str2);

	}

}
