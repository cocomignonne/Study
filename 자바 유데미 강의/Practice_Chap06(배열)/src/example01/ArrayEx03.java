package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arr1 = new int[10]; // 40����Ʈ�� ���� �����Ǿ���.
		
		 //�迭�� ���� 10���� �����ϰ� �ִ�.
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10)+1; //1~10
			System.out.println(arr1[i]);
		}
		// �ּҰ��� ��µȴ�. (�ּ�Ÿ�� : Ÿ��@16����
		System.out.println(arr1);
		System.out.println(arr1.toString()); 
		// ArraysŬ������ �迭�� �����ϱ� ���� ����� ���� ��ƿ��Ƽ Ŭ�����̴�.
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("===================================================");
		
		char[] chArr = new char[] {'a', 'b', 'c'};
		System.out.println(chArr);   // �����ϰ� charŸ�Ը� �ּҰ��� ��µǴ� ���� �ƴ϶� ���� ��µȴ�.
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr.toString());   // �ּҰ��� ����ϱ� ���ؼ��� toString()�޼ҵ带 ����ؾ� �Ѵ�.		
		
		
		
		
		
	}

}
