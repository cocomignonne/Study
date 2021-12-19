package example01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {
//	����ϴ� �޼ҵ� �ۼ�
	public static void print(ArrayList<Integer> list1, ArrayList list2) {
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5); // �ڵ����� �ڽ̵�
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		// subList()�� ������ �ε����� �������� �ʰ� ListŸ������ �����Ѵ�.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		print(list1, list2);
		
		System.out.println();
		
		System.out.println("���� ��");
		// ����
		Collections.sort(list1); //��������
		Collections.sort(list2);
		print(list1, list2);
		
		// ���԰���
		System.out.print("list1�÷��ǿ� list2�÷����� ��� ��Ұ� ����ִ°�? : ");
		System.out.println(list1.containsAll(list2));
	
		System.out.println();
		
		list2.add(9); // �迭���簡 �Ͼ�� ����
		list2.add(10); // �迭���簡 �Ͼ�� ����
		list2.add(3, 8); // �迭���簡 �Ͼ

		System.out.print("(list2�� ��� �߰� ��)list1�÷��ǿ� list2�÷����� ��� ��Ұ� ����ִ°�? : ");
		System.out.println(list1.containsAll(list2));
		print(list1, list2);
	
		System.out.println();
		
		// ��ü�ϱ�
		list2.set(3, 6);
		
		System.out.println("��ü�ϱ� set()��� ��");
		print(list1, list2);
	
		System.out.println();
		
		// list2���� list1�� ���Ե� ������ �����ϱ�
		System.out.println("list2���� list1�� ���Ե� ���� �����ϱ�");
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1, list2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
