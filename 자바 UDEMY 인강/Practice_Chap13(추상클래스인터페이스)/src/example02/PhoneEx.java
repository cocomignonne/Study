package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
//		Phone phone = new Phone(); �߻�Ŭ������ �ν��Ͻ����� �Ұ�
	
		Phone smartPhone1 = new SmartPhone(28243, "ȫ�浿", "LG-V50");
		smartPhone1.showInfo();
		smartPhone1.turnOn();
		smartPhone1.turnOff();
		
		System.out.println();
		
		SmartPhone smartPhone11 = new SmartPhone(34213, "�ƺ���", "LG-Gro0");
		smartPhone11.showInfo();
		smartPhone11.turnOn();
		smartPhone11.turnOff();
		smartPhone11.internetSearch();
		
		System.out.println();
		
		Phone smartPhone2 = new FolderblePhone(43231, "�����", "SM-Fldo");
		smartPhone2.showInfo();
		smartPhone2.turnOn();
		smartPhone2.turnOff();
		
		System.out.println();
		
		FolderblePhone smartPhone22 = new FolderblePhone(31234, "�Ͷ�����", "SM-Walalla");
		smartPhone22.showInfo();
		smartPhone22.turnOn();
		smartPhone22.turnOff();
		smartPhone22.foldOn();
		smartPhone22.foldOff();
	
	}

}
