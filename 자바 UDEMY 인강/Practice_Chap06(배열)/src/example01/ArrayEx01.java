package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		//int[] score; // 스택에 메모리공간만 생김
		int[] score = null; // score는 int배열타입의 참조변수이다.
		score = new int[5];// 초기화 5개의 방을 heap영역에 생성하고 있다
		
		for(int i =0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		score[0] = 109;
		
		for(int i =0; i < score.length; i++) {
			score[i] = i + 109; 
		}
		for(int i =0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
	}

}
