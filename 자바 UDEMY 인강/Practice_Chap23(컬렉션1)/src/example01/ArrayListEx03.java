package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// Arrays.asList()�� �÷����� �ƴ� �迭������ �÷����� �����Ѵ�.
		List<String> list1 = Arrays.asList("�̴�", "����");
		
		System.out.println(list1.toString()); 
		
		System.out.println();
		
		list1.add("���ڹ̴�");
		
		System.out.println(list1.toString()); // UnsupportedOperationException�߻�
		// �ֳ��ϸ� list1�� �÷����� �ƴ� �迭�����̱� ������ �޼ҵ尡 ������� �ʴ´�.
	}

}
