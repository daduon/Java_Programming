package Homework;

public class Average {

	public static void main(String[] args) {
		int i =1;
		int sum =0;
		int odd = 0;
		 do{
			if(i % 2 != 0) {
				sum += i;
				odd++;
			}
			i++;
		}while (i <= 50);
		System.out.println("The average of odd number: " +sum / odd);
	}

}
