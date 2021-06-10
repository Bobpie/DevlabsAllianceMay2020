package week2.day1;

public class LearnMethods {

	public int cvv = 609;
	private String password = "Dev@123";
	boolean stillAlive = true;

	public void printName() {
		System.out.println("Devlabs");
	}

	private int getCreditCardPIN() {
		int pin = 1234;
		return 1234;
	}

	int addTwoNumbers(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// ClassName object = new ClassName();
		LearnMethods object = new LearnMethods();
		// object.methodName();
		object.printName();
		int pin = object.getCreditCardPIN();
		System.out.println(pin);
		int result = object.addTwoNumbers(99, 1);
		System.out.println(result);
		System.out.println(object.cvv);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
