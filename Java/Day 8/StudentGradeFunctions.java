import java.util.*;

public class StudentGradeFunctions{
	public static String savingDisplay(){
		String message = "Saving >>>>>>>>>>>>>>>>>>>>>> \nSaved successfully.";
		return message;
	}
	public static ArrayList<String> getStudentsName(ArrayList<String> arrayList, String input){
		//input = input.toUpperCase();
		arrayList.add(input);
		return arrayList;
	}
	public static ArrayList<String> getSubjectssName(ArrayList<String> arrayList, String input){
		arrayList.add(input);
		return arrayList;
	}
/*
	public static ArrayList<Integer> getScore( int[][] arrayName, int input){
		arrayName.add(input);
		return arrayList;
	}
*/
	public static void printStudentScore(int[][] arrayName){
		for (int row = 0; row < arrayName.length; row++){
			for (int column = 0; column < arrayName[row].length; column++){
				System.out.printf("%d  ",arrayName[row][column] );
			}
			System.out.println();
		}
	}
	public static int getTotalTotal(int[][] arrayName){
		int total = 0;
 		for (int row = 0; row < arrayName.length; row++) {
 			for (int column = 0; column < arrayName[row].length; column++) {
 				total += arrayName[row][column];
 			}
 		}
		return total;
	}
	public static int getTotalAverage(int[][] arrayName, int input){
		int total = 0;
		int average = 0;
 		for (int row = 0; row < arrayName.length; row++) {
 			for (int column = 0; column < arrayName[row].length; column++) {
 				total += arrayName[row][column];
 			}
 		}
		average = total/input;
		return average;
	}

	public static void printStudentGrade(ArrayList<String> name, int[][] arrayName){
		double average = 0;
		int eachStudenttotal = 0;
		for (int row = 0; row < arrayName.length; row++){
			System.out.print(name.get(row) + "	");
			for (int column = 0; column < arrayName[row].length; column++){
				System.out.printf("%d	",arrayName[row][column] );
				eachStudenttotal += arrayName[row][column];
			}
			System.out.print(eachStudenttotal);
			average = eachStudenttotal/arrayName[row].length;
			System.out.print("	" + average);
			if (average < 20){System.out.print("	Fail");}
			else if (average > 30 && average <= 50){System.out.print("	Pass");}
			else if (average > 50 && average <= 60){System.out.print("	Good");}
			else if (average > 60 && average <= 70){System.out.print("	very Good");}
			else {System.out.print("	Exclnt");}
			eachStudenttotal = 0;
			System.out.println();
		}
	}
	
	public static void printOtherSummary( int input1, double input2){
		
		String display = """
		===============================================
		Best graduating student is: -- scoring --
		-----------------------------------------------
		Worse graduating student is: -- scoring 
		-----------------------------------------------

		===============================================
		Class total score 1s: %d
		-----------------------------------------------
		Class Average score is : %.2f
		===============================================
		""";
		System.out.printf(display, input1, input2);
	}
}