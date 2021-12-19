package example02;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���!!!";

		try {
			// ���ڵ� (��谡 �˾ƺ��� ���ϰ� ��ȯ�ϴ� ����)
			byte[] bytes1 = str.getBytes("EUC-KR");
			System.out.println("bytes1(EUC-KR)�� ���� : " + bytes1.length);
			// ���ڵ� (�ΰ��� �˾ƺ��� ���ϰ� ��ȯ�ϴ� ����)
			String str1 = new String(bytes1, "EUC-KR");
			System.out.println("EUC-KR�� ���ڵ��� ���ڿ� : " + str1);
			
			// ���ڵ� (��谡 �˾ƺ��� ���ϰ� ��ȯ�ϴ� ����)
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("bytes1(UTF-8)�� ���� : " + bytes1.length);
			// ���ڵ� (�ΰ��� �˾ƺ��� ���ϰ� ��ȯ�ϴ� ����)
			String str2 = new String(bytes2, "UTF-8");
			System.out.println("UTF-8�� ���ڵ��� ���ڿ� : " + str2);
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		

	}

}
