package example01;

import java.util.Arrays;

//설계도, 붕어빵틀을 만드는 작업
public class FieldInit {
		//기본형 변수
	
		byte byteField;     //1
		short shortField;   //2
		int intField;       //4(디폴트 타입)
		long longField;     //8
		
		boolean boolField;  //1
		char charField;     //2
		
		float floatField;   //4
		double doubleField; //8
		
		//참조형변수
		
		int[] arrField;     //4
		String strField; 
		
		// annotation 컴파일러에게 강한 컴파일을 요구
		// 필드의 값들을 우리가 수시로 확인할 때나 원하는 형식으로 멤버변수들을 출력하고자 할 때 사용
		
		
		@Override
		public String toString() {
			return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
					+ ", longField=" + longField + ", boolField=" + boolField + ", charField=" + charField
					+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
					+ Arrays.toString(arrField) + ", strField=" + strField + "]";
		}
		
}
