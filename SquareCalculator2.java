import java.util.Scanner;
import java.util.InputMismatchException;
public class SquareCalculator2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	
		try {
			System.out.println("What is the length of the side of the square?");
			int side = keyboard.nextInt();
			int area = calculateArea(side);
			System.out.println("Area: " + area);
		}
		catch(InputMismatchException e1) {
			System.out.println("You did not enter an integer!");
		}
		catch(NegativeSideException e2) { //e2 is a catch block parameter which becomes a reference to the Exception object that is thrown to the catch block
			System.out.println(e2.getMessage());
		}

	}
	
	//if the side of the square is greater than or equal to 0 
	//calculate the area and return the area
	//else throw an exception with the message "Error! Side cannot be negative!"
	public static int calculateArea(int side) throws NegativeSideException { //this method may throw an Exception
		if(side < 0) {
			throw new NegativeSideException("Error! Side cannot be negative!"); //this is when it actually throws the Exception
		}
	
		int area = side * side;
		return area;
	}

}
