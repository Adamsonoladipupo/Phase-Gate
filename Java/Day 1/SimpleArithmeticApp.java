import java.util.Scanner;
import java.util.Random;

public class SimpleArithmeticApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String docMain = """

		Welcome to My Subtraction Arithmetic App
		It helps you sharpen your subtraction knowledge

		""";
		System.out.print(docMain);

		int firstNumber = 10;
		int secondNumber = 5;
		int scores = 0;
		
		for (int count = 1; count <=10; count++){
			System.out.printf("-> Question.%d %d - %d : ", count, firstNumber, secondNumber);
			System.out.print("");
			int userInput = input.nextInt();
			if (firstNumber - secondNumber == userInput){
				System.out.println("Wow! You are correct");
				scores++;
			}
			if (firstNumber - secondNumber != userInput){
				System.out.println("Oops! You are wrong, Try again");
				System.out.printf("-> Question.%d %d - %d : ", count, firstNumber, secondNumber);
				System.out.print("");
				userInput = input.nextInt();
				if (firstNumber - secondNumber == userInput){
					System.out.println("Wow! You are correct");
					scores++;
				}
				else{
					System.out.println("Oops! You are wrong");
				}
			}
		}// end of for loop
		String docResult = """
		Congartulations! You just completed
		the Arithmetic Fun Game, here is your result.
		-->  You got %d out of 10 questions  <--

			[Total time spent ...]

		""";
		System.out.printf(docResult, scores);
	}
}