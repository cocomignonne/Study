package example01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {
//	출력하는 메소드 작성
	public static void print(ArrayList<Integer> list1, ArrayList list2) {
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5); // 자동으로 박싱됨
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		// subList()는 마지막 인덱스를 포함하지 않고 List타입으로 리턴한다.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		print(list1, list2);
		
		System.out.println();
		
		System.out.println("정렬 후");
		// 정렬
		Collections.sort(list1); //오름차순
		Collections.sort(list2);
		print(list1, list2);
		
		// 포함관계
		System.out.print("list1컬렉션에 list2컬렉션의 모든 요소가 들어있는가? : ");
		System.out.println(list1.containsAll(list2));
	
		System.out.println();
		
		list2.add(9); // 배열복사가 일어나지 않음
		list2.add(10); // 배열복사가 일어나지 않음
		list2.add(3, 8); // 배열복사가 일어남

		System.out.print("(list2에 요소 추가 후)list1컬렉션에 list2컬렉션의 모든 요소가 들어있는가? : ");
		System.out.println(list1.containsAll(list2));
		print(list1, list2);
	
		System.out.println();
		
		// 대체하기
		list2.set(3, 6);
		
		System.out.println("대체하기 set()사용 후");
		print(list1, list2);
	
		System.out.println();
		
		// list2에서 list1에 포함된 값들을 삭제하기
		System.out.println("list2에서 list1에 포함된 값들 삭제하기");
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1, list2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
