package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
//		ArrayList는 제네릭타입이기 때문에 Warning이 뜬다.
		ArrayList list = new ArrayList(); // 기본적으로 열개의 방을 생성함.
		System.out.println("list의 총 크기 : " + list.size()); // 저장된 객체가 하나도 없어서 0을 리턴함
		
		// 객체 추가하기 (순차적추가)
		list.add("1111");
		list.add("2222");
		list.add("3333");
		list.add("4444");
		
		list.add(3333); // Integer로 입력됨

		System.out.println("list의 총 크기 : " + list.size());
		System.out.println("ArrayList의 주소 : " + list.hashCode());
		System.out.println("ArrayList의 값 : " + list.toString());
		
		list.add(0, "3333");		
		
		System.out.println("ArrayList의 값 : " + list.toString());

	
//		객체 삭제하기    if 동일한 값이 있다면 앞에서부터 검색해서 가까운 값 하나만 삭제를 한다. 
		list.remove("3333");
		System.out.println("ArrayList의 값 : " + list.toString());
		
		System.out.println(list.remove("3333"));
		System.out.println("ArrayList의 값 : " + list.toString());
		
		System.out.println(list.remove("3333"));
		System.out.println("ArrayList의 값 : " + list.toString());
		
		// 객체 전부 삭제하기
		// 1. list.clear();
		// 2번은 전부 삭제되지 않는다!! 왜냐하면 1번인덱스가 삭제되면 2번인덱스값이 1번인덱스가 되기 때문임 
		// 2. for(int i = 0; i<list.size(); i++) {
		//        list.remove(i);
		// 	   }
		// 3번처럼 뒤에 있는 인덱스부터 삭제하면 전부 삭제된다.
		// 3. for(int i = list.size() - 1; i >= 0; i--) {
		//        list.remove(i);
		// 	   }
	}
}
