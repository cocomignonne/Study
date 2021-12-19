package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
//		ArrayList�� ���׸�Ÿ���̱� ������ Warning�� ���.
		ArrayList list = new ArrayList(); // �⺻������ ������ ���� ������.
		System.out.println("list�� �� ũ�� : " + list.size()); // ����� ��ü�� �ϳ��� ��� 0�� ������
		
		// ��ü �߰��ϱ� (�������߰�)
		list.add("1111");
		list.add("2222");
		list.add("3333");
		list.add("4444");
		
		list.add(3333); // Integer�� �Էµ�

		System.out.println("list�� �� ũ�� : " + list.size());
		System.out.println("ArrayList�� �ּ� : " + list.hashCode());
		System.out.println("ArrayList�� �� : " + list.toString());
		
		list.add(0, "3333");		
		
		System.out.println("ArrayList�� �� : " + list.toString());

	
//		��ü �����ϱ�    if ������ ���� �ִٸ� �տ������� �˻��ؼ� ����� �� �ϳ��� ������ �Ѵ�. 
		list.remove("3333");
		System.out.println("ArrayList�� �� : " + list.toString());
		
		System.out.println(list.remove("3333"));
		System.out.println("ArrayList�� �� : " + list.toString());
		
		System.out.println(list.remove("3333"));
		System.out.println("ArrayList�� �� : " + list.toString());
		
		// ��ü ���� �����ϱ�
		// 1. list.clear();
		// 2���� ���� �������� �ʴ´�!! �ֳ��ϸ� 1���ε����� �����Ǹ� 2���ε������� 1���ε����� �Ǳ� ������ 
		// 2. for(int i = 0; i<list.size(); i++) {
		//        list.remove(i);
		// 	   }
		// 3��ó�� �ڿ� �ִ� �ε������� �����ϸ� ���� �����ȴ�.
		// 3. for(int i = list.size() - 1; i >= 0; i--) {
		//        list.remove(i);
		// 	   }
	}
}
