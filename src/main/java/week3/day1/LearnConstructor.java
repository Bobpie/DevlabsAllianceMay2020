package week3.day1;

public class LearnConstructor {
	// Constructor
public LearnConstructor() {
	// Gateway to the class -> Access to the class
	System.out.println("I am from constructor");
}
public static void main(String[] args) {
	LearnConstructor obj = new LearnConstructor();
	System.out.println("I am from main method");
	// new -> new memory to store access/reference into the heap memory
	// constructor -> provides the access/reference to the class
	// obj -> contains the memory reference of the access of the class
}
}
