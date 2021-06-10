package week3.day1;

public class Prime {
public static void main(String[] args) {
	int count = 0;
	for (int i = 1; i < 101; i++) {
		for (int j = 1; j <= i; j++) {
			if(i%j == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime Number "+i);
		}
		count = 0;
	}
}
}
