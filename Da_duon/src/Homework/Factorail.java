package Homework;

public class Factorail {

	public static void main(String[] args) {
		int num = 5;
		int mul= 1;
		for (int i =1; i <= num; i++) {
			mul *= i;
			
		}
		System.out.println("Factorail number of 5 is: "+mul);
	}

}
