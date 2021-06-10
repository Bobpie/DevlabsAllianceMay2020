package week3.day2;

import java.util.*;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("Sonia");
	set.add("Joey");
	set.add("Rachel");
	set.add("Sully");
	set.add("Ramya");
	set.add("Sonia");
	set.add("Mangesh");
	System.out.println(set);
	for (String eachName : set) {
		System.out.println(eachName);
	}
	List<String> list = new ArrayList<String>();
	list.addAll(set);
}
}
