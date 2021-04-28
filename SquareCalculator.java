import java.util.Scanner;
import java.util.InputMismatchException;
public class SquareCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		
		try {
			System.out.println("What is the length of the side of the square?");
			int side = keyboard.nextInt(); //this method throws InputMismatchException if an integer is not entered
			if(side < 0) {
				//System.out.println("Error! Side cannot be negative!");
				throw new NegativeSideException("Error! Side cannot be negative!"); //creating an object of the Exception class and throwing it to the catch block
			}
			//else {
			int area = side * side;
			System.out.println("Area: " + area);
			//}
		}
		catch(InputMismatchException e1) { 
			System.out.println("You did not not enter an integer!");
		}
		catch(NegativeSideException e2) { //e2 is called a catch-block parameter which becomes a reference to the object that was thrown 
			System.out.println(e2.getMessage());
		}
	}

}