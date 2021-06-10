package week2.day2;

public class Program3 {
public static void main(String[] args) {
	String text = "sandeep sharma is sitting on a sofa which has six legs";
	String[] split = text.split(" ");
	for (int i = 0; i < split.length; i++) {
		if(split[i].startsWith("s")) {
			System.out.println(split[i]);
		}
	}
}
}
