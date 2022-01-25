package example01;

public class SenderEx {

	public static void main(String[] args) {

//		ContentSender contentSender = new ContentSender();  추상클래스라서 인스턴스를 생성할 수 없다
		
//		추상클래스도 조상이니까 필드의 다형성이 적용된다.
		ContentSender contentSender = new KakaoSender("카카오톡", "김다혜", "나도 너네처럼 잠만 자고 싶다");
		
		contentSender.sendMessage("코코미뇽");
		
		System.out.println("============================");

		ContentSender contentSender2 = new SmsSender("SMS", "김다혜", "공부 좀 하자");
		
		contentSender2.sendMessage("김다혜");
	}

}
