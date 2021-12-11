package example03;

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면, java.lang.cloneable인터페이스를 구현해야 가능해진다.
public class Product implements Cloneable{   // coloneable인터페이스 안에는 아무런 메소드가 존재하지 않는다.
	                                         // 단지 이 클래스가 복제가 될 수 있다는 것을 명시해준다.
	private String id;
	private String name;
	private int price;
	private int[] arr;
	
	public Product(String id, String name, int price, int[] arr) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return arr;
	}

	@Override
	public String toString() {
		return "상품의 id : " + this.getId() + 
				"\n name : " + this.getName() + 
				"\n price : " + this.getPrice() +
				"\n 배열값 : " + Arrays.toString(this.arr);
	}
	
//	@Override
//		protected Object clone() throws CloneNotSupportedException {
//
//			return super.clone();
//		}
	
	public Product getProduct() {
		Product cloned = null;
		try {
			// 얕은 복제가 여기서 일어난다. 왜냐하면 참조변수의 값들은 번지 수를 공유하기 때문이다.
			cloned = (Product)this.clone();   //this는 Product객체가 아닌 Object객체를 가리키는 것이다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
	 
}
