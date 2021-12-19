package example01;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		byte[] b1 = str.getBytes("EUC-KR");
		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(ch));
		
		
		sc.close(); // 리소스가 새는 것을 막는다.
	}

}
