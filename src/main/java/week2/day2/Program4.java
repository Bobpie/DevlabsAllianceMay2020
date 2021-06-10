package week2.day2;

public class Program4 {
public static void main(String[] args) {
	String text = "Tenet is a 2020 science fiction action-thriller film written and directed by Christopher Nolan, who produced it with Emma Thomas. A co-production between the United Kingdom and United States, it stars John David Washington, Robert Pattinson, Elizabeth Debicki, Dimple Kapadia, Michael Caine, and Kenneth Branagh.";  
		
	String[] split = text.split("[.]");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}

}
}
