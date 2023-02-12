package myfirst;
import java.util.Scanner; //import the package for getting user input
public class StarPattern {
	public static void main(String[] args) {
		
		//create a class and an object
		try (Scanner sc = new Scanner(System.in)) {
			
		//print message to get input from user
			System.out.println("Pls enter a Number ");
			
		//declaring variable
			int a = sc.nextInt();
			
		//create a for loop for reverse right triangle star pattern
			
			for(int i = 1; i<=a ; i++) {
				
				for(int j = a; j >= i; j--) { // inner loop for printing star
					
					System.out.print("*");
				
				}System.out.println();
			}
		}
		
	}
	
}
