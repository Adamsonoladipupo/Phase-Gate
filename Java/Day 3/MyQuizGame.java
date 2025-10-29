import java.util.Scanner;
import java.util.Arrays;

public class MyQuizGame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int userScore = 0;
		int attemptedQuestion = 0;

		String mainMenu = """
		WElcome to My Quiz Game App
		
		a. Start Game
		b. Exit Game 
		""";
		System.out.println(mainMenu);
		System.out.print("Make a Selcetion: ");
		String main = input.nextLine();
		switch(main){
			case "a"-> {
				for (int count = 1; count <=5; count++){

					String[] testQuestion = {"Which of these is a fruit?", "a. Amala","b. Apple","c. Boku Bread"};
					//GameFunction.getQuestion();
					for (String item : testQuestion){System.out.println(item);}
					attemptedQuestion++;
					System.out.print("Selcet an option: ");
					String userInput = input.nextLine();
					if(userInput.equalsIgnoreCase("b")){
						System.out.print("Correct!");
						userScore++;
					} else{System.out.print("Wrong!");}
					System.out.printf("Your score is %d out of %d \n", userScore, attemptedQuestion);
				}
				String finalResult = """

	Game Completed!
	Your Final Scores is:
	%d out of %d questions

				""";
				System.out.printf(finalResult, userScore, attemptedQuestion);
			}

			case "b"-> {System.out.print("Thank you for using my App. \nGoodbye");}
			default-> {System.out.print("Invalid input, select from the option above");}
		}

		
	} // end of main method

}

