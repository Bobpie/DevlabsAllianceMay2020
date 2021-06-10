package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Nilam");
	list.add("Rahul");
	list.add("Ramya");
	list.add("Rahul");
	list.add(0, "Preeti");
	list.set(1, "Sonia");
	list.remove("Ramya");
	
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(1));
	System.out.println("**********************");
	for (int i = list.size()-1; i >=0 ; i--) {
		System.out.println(list.get(i));
	}
	System.out.println("**********************");
	Collections.sort(list);
	for (String eachName : list) {
		System.out.println(eachName);
	}
}
}
