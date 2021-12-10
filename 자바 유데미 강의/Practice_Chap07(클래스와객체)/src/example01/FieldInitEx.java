package example01;

public class FieldInitEx {

	public static void main(String[] args) {
		// 붕어빵, 제품을 만들 고 있음
		
//		new연산자가 클래스에 있는 멤버들의 바이트 크기만큼 힙에
//		메모리 할당을 하며 동시에 초기화를 시켜준다
		FieldInit fi = new FieldInit();
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		System.out.println(fi.arrField);
		
		System.out.println(fi.toString());  // Object의 매소드인 toString()
	}

}
