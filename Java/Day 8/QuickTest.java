import java.util.*;

public class QuickTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList <String> name = new ArrayList <String>();
		name.add("Ade");
		name.add("Shola");
		name.add("Michael");

		ArrayList <String> subject = new ArrayList <String>();
		subject.add("English");
		subject.add("Maths");

		int[][] studentsScore = {
			{23,50},
			{50, 60},
			{60, 40},
		};
	
		ArrayList <Integer> position = new ArrayList <Integer> ();
		


		String line = """
		====================================================
		""";
		
		String menu1 = """
				Student Grades
		====================================================
		""";
		System.out.println(menu1);
		System.out.print("Subject	");
		for (String sub : subject){
			System.out.print(sub + "	");
		}
		System.out.print("TOT	AVG	RMK	POS");
		System.out.println();
		System.out.println(line);

		printArray(name,studentsScore);

		printOtherSummary(getTotal(studentsScore), getTotalAverage(studentsScore));

	
	



	}

	public static void printArray(ArrayList<String> name, int[][] arrayName){
		int avg = 0;
		int position = 1;
		int eachStudenttotal = 0;

		int [] matchPosition = new int[arrayName.length];
		int [] StudentsTotalScore = new int[arrayName.length];

		for (int count = 0; count < arrayName.length; count++){
			matchPosition[count] = count+1;
		}


		for (int row = 0; row < arrayName.length; row++){
			System.out.print(name.get(row) + "	");
			for (int column = 0; column < arrayName[row].length; column++){
				System.out.printf("%d	",arrayName[row][column] );
				eachStudenttotal += arrayName[row][column];
			}
			System.out.print(eachStudenttotal);
			avg = eachStudenttotal/arrayName[row].length;
			System.out.print("	" + avg);
			if (avg < 50){System.out.print("	Pass");}
			else if (avg > 50 && avg <= 60){System.out.print("	Good");}
			else if (avg > 60 && avg <= 70){System.out.print("	very Good");}
			else {System.out.print("	Exclnt");}
			System.out.print("	" + matchPosition[row]);
			StudentsTotalScore[row] = eachStudenttotal;
			eachStudenttotal = 0;
			System.out.println();
		}
		System.out.print(Arrays.toString(StudentsTotalScore));
		
	}
	public static int getTotal(int[][] arrayName){
		int total = 0;
 		for (int row = 0; row < arrayName.length; row++) {
 			for (int column = 0; column < arrayName[row].length; column++) {
 				total += arrayName[row][column];
 			}
 		}
		return total;
	}

	public static int getTotalAverage(int[][] arrayName){
		int total = 0; int count = 0;
		int average = 0;
 		for (int row = 0; row < arrayName.length; row++) {
 			for (int column = 0; column < arrayName[row].length; column++) {
 				total += arrayName[row][column];
				count++;
 			}
 		}
		average = total / count;
		return average;
	}

	public static void printOtherSummary( int input1, int input2){
		
		String display = """

		===================================================
		Best graduating student is: -- scoring --
		---------------------------------------------------
		Worse graduating student is: -- scoring 
		---------------------------------------------------

		===================================================
		Class total score 1s: %d
		---------------------------------------------------
		Class Average score is : %d
		===================================================
		""";
		System.out.printf(display, input1, input2);
	}


}