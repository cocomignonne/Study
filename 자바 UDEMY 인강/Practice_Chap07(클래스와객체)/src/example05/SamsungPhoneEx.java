package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		
		sam.setCompany("�Ｚ");
		sam.setModel("������s21");
		sam.setRelease(2021);
		sam.setColor("����");
		
		System.out.println(sam.toString());
		
		SamsungPhone sam1 = new SamsungPhone();
		
		sam1.setCompany("LG");
		sam1.setModel("G6");
		sam1.setRelease(2017);
		sam1.setColor("����");
		
		System.out.println(sam1.toString());

	}

}
