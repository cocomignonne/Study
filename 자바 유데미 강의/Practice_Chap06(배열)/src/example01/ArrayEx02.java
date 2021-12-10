package example01;

public class ArrayEx02 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		
//		int[] score = {100, 343, 542}; 로 선언해도 되지만
		int[] score = new int [] {100, 303, 587};
		
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평점 : " + avg);
		
		
		
		
	}
}
