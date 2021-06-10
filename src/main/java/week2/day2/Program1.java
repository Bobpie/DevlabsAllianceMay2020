package week2.day2;

public class Program1 {
public static void main(String[] args) {
	String text = "ENTER";
	int counter = 0;
	for (int i = 0; i < text.length(); i++) {
		if(text.charAt(i)=='E'||text.charAt(i)=='e') {
			counter++;
		}
	}
	System.out.println(counter);
	
//	int length = text.replaceAll("[^E]", "").length();
//	System.out.println(length);
	
	
	
}
}
