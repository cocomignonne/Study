package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// Arrays.asList()는 컬렉션이 아닌 배열형식인 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("미뇽", "코코");
		
		System.out.println(list1.toString()); 
		
		System.out.println();
		
		list1.add("코코미뇽");
		
		System.out.println(list1.toString()); // UnsupportedOperationException발생
		// 왜냐하면 list1은 컬렉션이 아닌 배열형식이기 때문에 메소드가 적용되지 않는다.
	}

}
