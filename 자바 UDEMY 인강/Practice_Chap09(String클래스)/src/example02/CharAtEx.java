package example02;

public class CharAtEx {

	public static void main(String[] args) {
		
		String ssn = "980203-2130923";
		
		char gender = ssn.charAt(7);
		
		if(gender == '2' || gender == '4') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�");
		}
		

	}

}
