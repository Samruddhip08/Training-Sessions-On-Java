package sam2;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Project is working fine");

		System.out.println("Enter the Price : ");
		float price = sc.nextFloat();
		
		System.out.println("Enter the Quantity : ");
		int quantity = sc.nextInt();
		
		double total = price*quantity;
		System.out.println("The total is : " +total);
		
		sc.close();
		}
		
		
	}


