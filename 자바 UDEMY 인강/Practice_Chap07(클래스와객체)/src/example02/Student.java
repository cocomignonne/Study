package example02;

public class Student {
	String name;
	int age;
	
	// this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화가 된다 / Student st = new Student();)
	// 단, this는 static메서드나 클래스안에 사용할수 없다.
	@Override
	public String toString() {
		return "Student [이름 :" + this.name + ", 나이 : " + this.age + "]";
	}
	
	
}
