package sam2;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		String answer;
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Project is working fine");

		System.out.println("Enter the Price : ");
		float price = sc.nextFloat();
		
		System.out.println("Enter the Quantity : ");
		int quantity = sc.nextInt();
		
		double total = price*quantity;
		System.out.println("The total is : " +total);
		
		System.out.println("Do you want to perform again ? ");
		answer = sc.next();
	
		}while(answer.equals("yes"));
	}

}
