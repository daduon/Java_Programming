
package Homework;
import java.util.Scanner;
public class Scanner_with_for_loop {

	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.println("Enter:");
		String text = word.nextLine();
		int total = 150;
		int record = 5;
		switch (text) {
		case "a":
			record = 10;
			break;
		case "b":
			record = 20;
			break;
		case "c":
			record = 50;
		case "d":
			record = 100;
			break;
		case "e":
			record = 200;
			break;
		default:
			System.out.println("auto");
			break;
		}
		if(total % record == 0) {
			for (int i = 0; i < total; i++) {
				System.out.print("| page" + i +":" + record);
			}
			System.out.print("|");
		}else {
			int countPage = total/record;
			for (int i = 0; i < total/record; i++) {
				System.out.print("| page" + i +":" + record);
			}
			System.out.print("|page"+(countPage+1)+":"+total%record+"|");
		}
	}

}
