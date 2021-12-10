package example01;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		int[] ball = new int[5];
		for(int i = 0; i < ball.length; i++) {
			ball[i] = (int)(Math.random()*20)+1;
		}
		int[] ball2 = new int[5];
		for(int i = 0; i < ball2.length; i++) {
			ball2[i] = (int)(Math.random()*20)+1;
		}
		
		System.out.println("정렬 전");
		for(int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}
		
		System.out.println();
		// 버블정렬을 위해서는 반드시 1차원배열이라도 더블루프가 필요하고
		// 조건문 하나가 들어와야 한다.
		for(int i = 0; i < ball.length; i++) {
			for(int j = 0; j < ball.length-1; j++) {
				// 버블정렬 ( 오름차순 : >    내림차순 : < )
				if (ball[j] < ball[j+1]) {
					int temp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}
		
		// sort메소드 쓰기 & 반복문없이 출력하기
		Arrays.sort(ball2);
		System.out.println(Arrays.toString(ball2));
		
		
	}
}
