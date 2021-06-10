package week2.day2;

public class Program2 {
public static void main(String[] args) {
	String text = "automobile";
	int a=0,e=0,i=0,o=0,u=0;
	for (int j = 0; j < text.length(); j++) {
		switch (text.charAt(j)) {
		case 'a':
			a++;
			break;
		case 'e':
			e++;
			break;
		case 'i':
			i++;
			break;
		case 'o':
			o++;
			break;
		case 'u':
			u++;
			break;

		default:
			break;
		}
	}
	System.out.println("a ->"+a+"\n e ->"+e+"\n i ->"+i+"\n o ->"+o+"\n u ->"+u);
}
}
