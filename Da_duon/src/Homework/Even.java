package Homework;

public class Even {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i <= 50) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Sum of even number: "+sum);
	}

}