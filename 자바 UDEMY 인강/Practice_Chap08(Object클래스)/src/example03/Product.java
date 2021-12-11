package example03;

import java.util.Arrays;

// Ŭ������ ������ �����ϰ� �Ϸ���, java.lang.cloneable�������̽��� �����ؾ� ����������.
public class Product implements Cloneable{   // coloneable�������̽� �ȿ��� �ƹ��� �޼ҵ尡 �������� �ʴ´�.
	                                         // ���� �� Ŭ������ ������ �� �� �ִٴ� ���� ������ش�.
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
		return "��ǰ�� id : " + this.getId() + 
				"\n name : " + this.getName() + 
				"\n price : " + this.getPrice() +
				"\n �迭�� : " + Arrays.toString(this.arr);
	}
	
//	@Override
//		protected Object clone() throws CloneNotSupportedException {
//
//			return super.clone();
//		}
	
	public Product getProduct() {
		Product cloned = null;
		try {
			// ���� ������ ���⼭ �Ͼ��. �ֳ��ϸ� ���������� ������ ���� ���� �����ϱ� �����̴�.
			cloned = (Product)this.clone();   //this�� Product��ü�� �ƴ� Object��ü�� ����Ű�� ���̴�.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
	 
}
