package example01;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		byte[] b1 = str.getBytes("EUC-KR");
		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(ch));
		
		
		sc.close(); // ���ҽ��� ���� ���� ���´�.
	}

}
