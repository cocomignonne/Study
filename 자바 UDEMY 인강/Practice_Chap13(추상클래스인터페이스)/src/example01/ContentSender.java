package example01;

// 추상클래스 : 1개 이상의 추상메소드를 포함하는 클래스
public abstract class ContentSender {

	private String title;
	private String name;
	
//	생성자
	public ContentSender(String title, String name) {
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
//	추상메서드를 만들 때는 접근제한자는 항상 public으로 하기
//	추상메서드는 상속을 통해서 재정의 되어져야만 인스턴스를 생성할 수 있다.
	public abstract void sendMessage(String content);
	
	
}
