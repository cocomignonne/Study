package example04;

import java.util.Arrays;

// Ŭ������ ������ �����ϰ� �Ϸ���, java.lang.cloneable�������̽��� �����ؾ� ����������.
public class Product implements Cloneable{   // coloneable�������̽� �ȿ��� �ƹ��� �޼ҵ尡 �������� �ʴ´�.
	                                         // ���� �� Ŭ������ ������ �� �� �ִٴ� ���� ������ش�.
	private String id;
	private String name;
	private int price;
	private int[] arr;
	private Apple apple;
	
	public Product(String id, String name, int price, int[] arr, Apple apple) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
		this.apple = apple;
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

	public Apple getApple() {
		return apple;
	}

	@Override
	public String toString() {
		return "��ǰ�� id : " + this.getId() + 
				"\n name : " + this.getName() + 
				"\n price : " + this.getPrice() +
				"\n �迭�� : " + Arrays.toString(this.arr) + 
				"\n Apple�� : " + this.apple.price;
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
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// ���� ������ ���� �ؾ��Ѵ� �⺻�� ������ �����ؾ��ϱ� ������
			Product cloned = (Product)super.clone(); // Object�� clone()
			// �������� �����ϴ� ���� ����
			cloned.arr = Arrays.copyOf(this.arr, this.arr.length); // �迭����
			cloned.apple = new Apple(this.apple.price);  // Ŭ��������
			
			return cloned;
		}
	 
}
