package example02;

public class ToLoweUpperEx {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println("대문자 : " + str1.toUpperCase());
		System.out.println("소문자 : " + str1.toLowerCase());

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 구분없이 비교
	}

}
