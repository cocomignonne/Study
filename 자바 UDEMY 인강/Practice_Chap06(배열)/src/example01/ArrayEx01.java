package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		//int[] score; // ���ÿ� �޸𸮰����� ����
		int[] score = null; // score�� int�迭Ÿ���� ���������̴�.
		score = new int[5];// �ʱ�ȭ 5���� ���� heap������ �����ϰ� �ִ�
		
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
