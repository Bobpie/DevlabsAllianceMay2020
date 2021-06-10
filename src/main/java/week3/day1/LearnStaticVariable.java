package week3.day1;

public class LearnStaticVariable {
int b = 5;
static int a = 5;
void up() {
	b = b+1;
}
static void grow() {
	a++;
}
public static void main(String[] args) {
	LearnStaticVariable obj = new LearnStaticVariable();
	System.out.println(obj.b);
	obj.up();
	System.out.println(obj.b);
	LearnStaticVariable obj1 = new LearnStaticVariable();
	System.out.println(obj1.b);
	System.out.println(LearnStaticVariable.a);
	LearnStaticVariable.grow();
	System.out.println(LearnStaticVariable.a);
	
}
}
