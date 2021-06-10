package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PractiseList {
public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Rachel");
	names.add("Sonia");
	names.add("Joey");
	names.add("Rachel");
	names.add("Sully");
	names.add("Sonia");
	names.add("Ramya");
	names.add("Mangesh");
	
	int count = 0;
	for (String eachName : names) {
		for (String verifyName : names) {
			if(eachName.equals(verifyName)) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(eachName);
		}
		count = 0;
	}
	
	
	
	
	
		/*
		 * Set<String> set1 = new LinkedHashSet<String>();
		 * 
		 * for (String eachName : names) { boolean result = set1.add(eachName);
		 * if(result == false) { System.out.println("Duplicate Names: "+eachName); } }
		 * System.out.println(set1);
		 */
}
}
