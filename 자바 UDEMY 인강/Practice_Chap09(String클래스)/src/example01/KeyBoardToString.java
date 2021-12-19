package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) { //throws Exception { // 2��. jvm�� Exception�� ������ 
		// byte�迭����
		byte[] bytes = new byte[100];
//		System.out.println(bytes[99]);
		
		System.out.println("�Է� : ");
		int readBytesNo = 0;
		
		// read(byte[])�� ����ڰ� Ű����(ǥ���Է�)�� �Է��� ���� byte�迭�� ���� �־ 
		// �Է¹��� ����Ʈ ���� intŸ������ ��ȯ����
// 		System.in.read(bytes); //���ܰ� ����� IOException
		
//		1��. try/catch���� ���
		try {
			readBytesNo = System.in.read(bytes);
			// ���ڼ� EUC-KR �ѱۿϼ���(���� 1����Ʈ, �ѱ� 2����Ʈ, ����Ű 2����Ʈ)
			String str1 = new String(bytes, 0, readBytesNo - 2, "EUC-KR");
			
			// ���ڼ� UTF-8 (���� 1����Ʈ, �ѱ� 3����Ʈ, ����Ű 2����Ʈ)
			String str2 = new String(bytes, 0, readBytesNo - 2, "UTF-8");
			System.out.println("EUC-KR str1 : " + str1);
			System.out.println("UTF-8 str2 : " + str2);
			System.out.println("�Է¹��� ����Ʈ �� : " + readBytesNo);
			
			byte[] b1 = str1.getBytes("EUC-KR");
			byte[] b2 = str2.getBytes("UTF-8");
			System.out.println("EUC-KR b1.length : " + b1.length);
			System.out.println("UTF-8 b2.length : " + b2.length);
			
			
		} catch (IOException e) {
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
