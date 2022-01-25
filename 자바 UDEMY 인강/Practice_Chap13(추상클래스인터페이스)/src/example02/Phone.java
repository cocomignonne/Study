package example02;

// �߻�Ŭ����
public abstract class Phone {
	
	private int serial_No;
	private String owner;
	private String company;
	
	
	public Phone(int serial_No, String owner, String company) {
		this.serial_No = serial_No;
		this.owner = owner;
		this.company = company;
	}


	public int getSerial_No() {
		return serial_No;
	}


	public void setSerial_No(int serial_No) {
		this.serial_No = serial_No;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void showInfo() {
		System.out.println("�ø���ѹ� : " + this.getSerial_No());
		System.out.println("����ȸ�� : " + this.getCompany());
		System.out.println("������ : " + this.getOwner());
	}
}
