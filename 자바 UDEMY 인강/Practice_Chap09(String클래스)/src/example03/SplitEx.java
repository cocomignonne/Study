package example03;

public class SplitEx {

	public static void main(String[] args) {
		
		String str1 = "Ä¡Å²,ÃÖ°í¾ß/»Ñ¸µÅ¬&Â¯/¶óºä";
		
		String[] strArr = str1.split(",|/|&");
		
		for(String str : strArr) {
			System.out.println(str);
		}
		
	}

}
