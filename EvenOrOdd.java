package squad;

import java.util.Scanner;

//practice interview question!

public class EvenOrOdd {
	
	
	Scanner scan=new Scanner(System.in);
	
	public void EvOrOd(int a) {
		if (  a % 2 == 0  ) {
			
			System.out.println( " its an even number ");
					
					
			}
			
			else if ( a % 2 == 1) { 
				
				System.out.println( " it's an Odd number ");
				
			}
			
			else {
				System.out.println(" None of them ");
			}
	}
	
	
	public void  EvenOrOdd() {
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		if (  num % 2 == 0  ) {
			
		System.out.println( " its an even number ");
				
				
		}
		
		else if ( num % 2 == 1) { 
			
			System.out.println( " it's an Odd number ");
			
		}
		
		else {
			System.out.println(" None of them ");
		}
	}

}
