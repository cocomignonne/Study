package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arr1 = new int[10]; // 40바이트가 힙에 생성되었다.
		
		 //배열에 난수 10개를 대입하고 있다.
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10)+1; //1~10
			System.out.println(arr1[i]);
		}
		// 주소값이 출력된다. (주소타입 : 타입@16진수
		System.out.println(arr1);
		System.out.println(arr1.toString()); 
		// Arrays클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스이다.
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("===================================================");
		
		char[] chArr = new char[] {'a', 'b', 'c'};
		System.out.println(chArr);   // 유일하게 char타입만 주소값이 출력되는 것이 아니라 값이 출력된다.
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr.toString());   // 주소값을 출력하기 위해서는 toString()메소드를 사용해야 한다.		
		
		
		
		
		
	}

}
