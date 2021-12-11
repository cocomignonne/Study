package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product product1 = new Product("1223", "아이패드", 900000, new int[] {100, 200});
		
		Product cloned = product1.getProduct();  //  얕은 복사를 한 객체를 리턴한다.
		
		int[] Arr = product1.getArr();
		int[] clonedArr = cloned.getArr();
		
		System.out.println("Arr 배열주소 : " + Arr);
		System.out.println("clonedArr 배열주소 : " + clonedArr);
		
		clonedArr[0] = 777;
		
		System.out.println();
		System.out.println(product1);
		System.out.println(cloned);
	}

}
