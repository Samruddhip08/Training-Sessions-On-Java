package sam2;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if(i==5 && j>2) {
					
					System.out.print(n);
					n--;
					
				}
				else {
					System.out.print(j);
				}
				}
			
			System.out.println();
		}
	}
}

