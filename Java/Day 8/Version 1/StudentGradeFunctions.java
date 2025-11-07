import java.util.*;

public class StudentGradeFunctions{
	public static String savingDisplay(){
		String message = "Saving >>>>>>>>>>>>>>>>>>>>>> \nSaved successfully.";
		return message;
	}
	public static ArrayList<String> getStudentsName(ArrayList<String> arrayList, String input){
		input = input.toUpperCase();
		arrayList.add(input);
		return arrayList;
	}
	public static ArrayList<String> getSubjectssName(ArrayList<String> arrayList, String input){
		input = input.toUpperCase();
		arrayList.add(input);
		return arrayList;
	}

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
		int position = 0;
		int eachStudenttotal = 0;


		int [] matchPosition = new int[arrayName.length];
		int [] StudentsTotalScore = new int[arrayName.length];


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
			else if (average > 60 && average <= 70){System.out.print("	V. Good");}
			else {System.out.print("	Exclnt");}
			
			StudentsTotalScore[row] = eachStudenttotal;

			eachStudenttotal = 0;
			System.out.println();
		}
		System.out.println(Arrays.toString(StudentsTotalScore));

		
	}

	
	public static void printOtherSummary(ArrayList<String> subjectName, ArrayList<String> studentName, int[][] arrayName){

		int totalforEachStudent = 0; int classTotal = 0; double classAverage = 0;
		int makecount = 0;
		int[] listSumOfEachStusent = new int[studentName.size()];
		String name = "";
		System.out.println("===================================================");
		for (int count = 0; count < studentName.size(); count++){
			for (int counta = 0; counta < subjectName.size(); counta++){
				totalforEachStudent += arrayName[count][counta];
				makecount++;
			}
			listSumOfEachStusent[count] = totalforEachStudent;
			classTotal += totalforEachStudent;
			totalforEachStudent = 0;
			
		}
		System.out.println("Class total score 1s: " + classTotal);
		classAverage = classTotal/makecount;
		System.out.println("Class total Average 1s: " + classAverage);
		System.out.println("---------------------------------------------------");

		int highest = listSumOfEachStusent[0]; int lowest = listSumOfEachStusent[0];
		for (int count = 0; count < listSumOfEachStusent.length; count++){
			if (listSumOfEachStusent[count] > highest){
				highest = listSumOfEachStusent[count];
				name = studentName.get(count);
			}
			if (listSumOfEachStusent[count] < lowest){
				lowest = listSumOfEachStusent[count];
				name = studentName.get(count);
			}
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("The best graduating student is : " + name + " scoring " +  highest);
		System.out.println("The worse graduating student is : " + " scoring " +  lowest);

		System.out.println("===================================================");

	}


	public static void printSubjectSummary(ArrayList<String> subjectName, ArrayList<String> studentName, int[][] arrayName){
		String subject = ""; int counter ; String name = "";
		int higest = 0; int pass = 0; int fail = 0;
		int totalScore = 0;

		int[] listSumOfEachSubject = new int[studentName.size()];
		int highest = listSumOfEachSubject[0]; int lowest = listSumOfEachSubject[0];


		System.out.println("------------------------------------");
		for ( int count = 0; count < subjectName.size(); count++){
			System.out.println("Subject summary of " + subjectName.get(count));
			for (counter = 0; counter < studentName.size(); counter++){
				totalScore += arrayName[counter][count];

				listSumOfEachSubject[counter] = arrayName[counter][count];

				if (arrayName[counter][count] < 50){
					fail++;
				}
				if (arrayName[counter][count] >= 50){pass++;}
			} 
			System.out.println("Number of pass: " + pass); pass = 0;
			System.out.println("Number of fail: " + fail); fail = 0;
			System.out.println("totalScore: " + totalScore);
			System.out.println("AverageScore: " + totalScore/counter);
			totalScore = 0;
			//System.out.println(Arrays.toString(listSumOfEachSubject));
			for (int kount = 0; kount < counter; kount++){
				if (listSumOfEachSubject[kount] > highest){
					highest = listSumOfEachSubject[kount];
					name = studentName.get(kount);
				}
				if (listSumOfEachSubject[kount] < lowest){
					lowest = listSumOfEachSubject[kount];
					name = studentName.get(kount);
				}
				if (listSumOfEachSubject[kount] < lowest){
					lowest = listSumOfEachSubject[kount];
					name = studentName.get(kount);
				}
			}

			System.out.println("The highest scoring student is : " + name + " scoring " +  highest);
			//System.out.println("The lowest scoring student is : " + name + " scoring " +  lowest);

			System.out.println("------------------------------------");

			listSumOfEachSubject = new int[studentName.size()];
			
		}

	}

}