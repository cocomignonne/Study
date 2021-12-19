package example02;

public class TrimEx {

	public static void main(String[] args) {

		String tel1 = "     010";
		String tel2 = "-2654    ";
		String tel3 = "    -3943  ";
		
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		 
		// trim()은 좌우 공백만 제거
		// 중간에 있는 공백을 제거하려면 개발자가 코드를 작성해서 처리해야한다.
	}

}
