package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product product1 = new Product("1223", "�����е�", 900000, new int[] {100, 200});
		
		Product cloned = product1.getProduct();  //  ���� ���縦 �� ��ü�� �����Ѵ�.
		
		int[] Arr = product1.getArr();
		int[] clonedArr = cloned.getArr();
		
		System.out.println("Arr �迭�ּ� : " + Arr);
		System.out.println("clonedArr �迭�ּ� : " + clonedArr);
		
		clonedArr[0] = 777;
		
		System.out.println();
		System.out.println(product1);
		System.out.println(cloned);
	}

}
