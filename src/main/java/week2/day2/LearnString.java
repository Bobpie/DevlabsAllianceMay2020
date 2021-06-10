package week2.day2;

public class LearnString {
	public static void main(String[] args) {
		/*
		 * int var = 5; String text1 = "    Dev    labs     "; // String literal String
		 * text2 = new String("Devlabs"); // String object
		 * 
		 * int length = text1.length(); System.out.println(length);
		 * System.out.println(text1); String trim = text1.trim();
		 * System.out.println(trim);
		 */
		
		



		/*
		 * String text1 = "Devlabs";
		String text2 = "Devlabs is in India";
		if(text2.contains(text1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		 * if(text1.equals(text4)) { System.out.println("Same"); } else {
		 * System.out.println("Not Same"); }
		 * 
		 * if(text1.equalsIgnoreCase(text4)) {
			System.out.println("Same");
		}
		else {
			 System.out.println("Not Same"); 
		}
		 */

		/*
		 * String text = "Devlabs"; String upperCase = text.toUpperCase();
		 * System.out.println(upperCase); String lowerCase = upperCase.toLowerCase();
		 * System.out.println(lowerCase);
		 */
		
		
		
		
		
		/*
		 * 
		 * String text = "tweet";
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		 * for(int i = 0; i < text.length();i++) { char secondChar = text.charAt(i);
		 * System.out.println(secondChar); }
		 */
		
		
		/*
		 * String text = "Devlabs,is,located,in,India"; String[] split =
		 * text.split(","); for (int i = 0; i < split.length; i++) {
		 * System.out.println(split[i]); }
		 */
		
		/*
		 * String text = "Devlabs"; String substring = text.substring(3);
		 * System.out.println(substring); String substring2 = text.substring(1, 4);
		 * System.out.println(substring2);
		 */
		
		
		/*
		 * String text = "Devlabs"; boolean startsWith = text.startsWith("dev");
		 * System.out.println(startsWith);
		 * 
		 * boolean endsWith = text.endsWith("bs"); System.out.println(endsWith);
		 */
		
		
		/*
		 * String text = "sandeep sharma"; String replace = text.replace('a', '@');
		 * System.out.println(replace);
		 */
		
		String text = "RE is Estb 1901 during the second world war";
		String replaceAll = text.replaceAll("\\D", "");
		System.out.println(replaceAll);
		
		
		
		
		
		
		
		
	}
}
