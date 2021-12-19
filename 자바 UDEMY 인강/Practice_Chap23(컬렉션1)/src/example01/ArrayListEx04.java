package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx04 {

	public static void main(String[] args) {
		List<Integer> list2 = Arrays.asList(100, 200, 300);
		
		// 리스트 컬렉션을 가지고 배열을 직접 만들기
		Integer[] arr = (Integer[]) list2.toArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); 
		}
	}

}
