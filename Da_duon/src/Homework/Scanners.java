package Homework;
import java.util.Scanner;
public class Scanners {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner string = new Scanner(System.in);
		System.out.println("Enter A or a to display 10 entities per page");
		System.out.println("Enter B or b to display 20 entities per page");
		System.out.println("Enter C or c to display 50 entities per page");
		System.out.println("Enter D or d to display 100 entities per page");
		System.out.println("Enter E or e to display 200 entities per page");
		System.out.println("----------------------------------------------");
		System.out.println("Enter:");
		String word = string.nextLine(); 
		String sentance = "========================================";
		String text = "Entities:150";
		String test = "| Page";
		String texts = "Entities To Display Per Page:";
		int a = 10, b = 20, c = 50, d = 100, e = 200, defaults = 5;
	    switch (word) {
	        case "a":
	        case "A":
	            System.out.println(text);
	            System.out.println(texts + a);
	            System.out.println(sentance);
	            
	           for(int j = 1; j <= 150 / a; j++) {
	        	   System.out.print(test + j+ ":" + a);
	           }
	           System.out.println("|");
	            break;
	        case "b":
	        case "B":
	        	 System.out.println(text);
		            System.out.println(texts+b);
		            System.out.println(sentance);
		           for(int k = 1; k <= 150 / b; k++) {
		        	   if(k < 150 / b) {
		        		   System.out.print(test+ k +":"+b);
		        	   }else {
		        		   System.out.print(test+ k +":"+b+"|"+"page8:"+a);
		        	   }
		           }
		           System.out.println("|");
		            break;
	        case "c":
	        case "C":
	        	 System.out.println(text);
		            System.out.println(texts+c);
		            System.out.println(sentance);
		           for(int j = 1;j<=150/c;j++) {
		        	   System.out.print(test+j+":"+c);
		           }
		           System.out.println("|");
		            break;
	        case "d":
	        case "D":
	        	 System.out.println(text);
		            System.out.println(texts+d);
		            System.out.println(sentance);
		            System.out.println(d);
		           System.out.println("|");
		            break;
	        case "e":
	        case "E":
	        	 System.out.println(text);
		            System.out.println(texts+e);
		            System.out.println(sentance);
		            System.out.print(test+(e-c));
		            System.out.println("|");
		            break;
	        default:
	        	 for(int j = 1;j<=150/defaults;j++) {
		        	   System.out.print(test+j+":"+defaults);
		           }
		           System.out.println("|");
		           
	            break;
	    }


		
	}

}
