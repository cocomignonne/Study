package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) { //throws Exception { // 2번. jvm에 Exception을 던진다 
		// byte배열생성
		byte[] bytes = new byte[100];
//		System.out.println(bytes[99]);
		
		System.out.println("입력 : ");
		int readBytesNo = 0;
		
		// read(byte[])은 사용자가 키보드(표준입력)로 입력한 것을 byte배열에 집어 넣어서 
		// 입력받은 바이트 수를 int타입으로 반환해줌
// 		System.in.read(bytes); //예외가 생긴다 IOException
		
//		1번. try/catch문을 사용
		try {
			readBytesNo = System.in.read(bytes);
			// 문자셋 EUC-KR 한글완성형(영어 1바이트, 한글 2바이트, 엔터키 2바이트)
			String str1 = new String(bytes, 0, readBytesNo - 2, "EUC-KR");
			
			// 문자셋 UTF-8 (영어 1바이트, 한글 3바이트, 엔터키 2바이트)
			String str2 = new String(bytes, 0, readBytesNo - 2, "UTF-8");
			System.out.println("EUC-KR str1 : " + str1);
			System.out.println("UTF-8 str2 : " + str2);
			System.out.println("입력받은 바이트 수 : " + readBytesNo);
			
			byte[] b1 = str1.getBytes("EUC-KR");
			byte[] b2 = str2.getBytes("UTF-8");
			System.out.println("EUC-KR b1.length : " + b1.length);
			System.out.println("UTF-8 b2.length : " + b2.length);
			
			
		} catch (IOException e) {
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
