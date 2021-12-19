package example02;

public class ReplaceEx {

	public static void main(String[] args) {
		// replace() 문자열을 대체하는 메소드
		String oldstr = "자바는 객체지향언어입니다";
		
		String newstr = oldstr.replace("자바", "JAVA");
		
		System.out.println(newstr);

		System.out.println("oldstr.hashCode() : " + oldstr.hashCode());
		System.out.println("newstr.hashCode() : " + newstr.hashCode());
		
	}

}
