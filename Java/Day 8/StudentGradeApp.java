import java.util.*;

public class StudentGradeApp{
	public static void main(String[] args){
		Scanner inputCollector  = new Scanner(System.in);
		Scanner inputCollectorTwo  = new Scanner(System.in);
		Scanner inputCollectorThree  = new Scanner(System.in);

		System.out.print("Enter your school name: ");
		String schoolName = inputCollector.nextLine();
	
		System.out.print("Enter number of student(s): ");
		int numberOfStudents = inputCollector.nextInt();

		System.out.print("Enter number of subject(s) offer: ");
		int numberOfSubjects = inputCollector.nextInt();

		System.out.print(StudentGradeFunctions.savingDisplay());

		ArrayList <String> studentNamesList = new ArrayList <String>();
		ArrayList <String> subjectNamesList = new ArrayList <String>();

		int[][] studentScore = new int[numberOfStudents][numberOfSubjects];
		//ArrayList <Integer> studentScore = new ArrayList <Integer>();

		String mainMenuSelection = "";
		while(!mainMenuSelection.equalsIgnoreCase("8")){
		String welcomeDisplay = """
		
			-- > Welcome to %s < --

			. Number of Students: %d
			. Number of Subjects: %d

			1. Enter student names
			2. Enter subject names
			3. Enter stuent's subject score
			4. Check overal Students Grade
			5. Check subject summary
			6. Check student summary
			7. Other summary
			8. Exit

		""";
		System.out.printf(welcomeDisplay,schoolName,numberOfStudents, numberOfSubjects);
		
		System.out.print("Select from the option: ");
		mainMenuSelection = inputCollectorThree.nextLine();
		switch(mainMenuSelection){
			case "1"->{
				for (int count = 0; count < numberOfStudents; count++){
					System.out.printf("Enter name for student %d: ", count+1);
					String AllNames = inputCollectorTwo.nextLine();
					StudentGradeFunctions.getStudentsName(studentNamesList,AllNames);
				}
				System.out.print(StudentGradeFunctions.savingDisplay());
			}// end of case 1

			case "2"->{
				if (studentNamesList.size() < 1){
					System.out.print("Empty students name database");
					break;
				}
				for (int count = 0; count < numberOfSubjects; count++){
					System.out.printf("Enter name for subjects %d: ", count+1);
					String AllNames = inputCollectorTwo.nextLine();
					StudentGradeFunctions.getSubjectssName(subjectNamesList,AllNames);
				}
				System.out.print(StudentGradeFunctions.savingDisplay());
			}// end of case 2
			
			case "3"->{
				if (studentNamesList.size() < 1 || subjectNamesList.size() < 1){
					System.out.print("Empty students or subject database");
					break;
				}
				for (int count = 0; count < numberOfStudents; count++){
					System.out.printf("-----> Entering %s's Score %n", studentNamesList.get(count));
					for (int counter = 0; counter < numberOfSubjects; counter++){
						System.out.printf("Enter Score for %s :", subjectNamesList.get(counter));
						int score = inputCollectorTwo.nextInt();
						while (score < 0 || score > 100){
							System.out.println("Please, input a valid score (0 - 100)");
							score = inputCollectorTwo.nextInt();
						}
						//StudentGradeFunctions.getScore(studentScore, score);
						studentScore[count][counter] = score;
					}

				}
				System.out.print(StudentGradeFunctions.savingDisplay());
			}// end of case 3

			case "4"->{
				if (studentNamesList.size() < 1 || subjectNamesList.size() < 1 || studentScore.length < 1){
					System.out.print("Empty database");
					break;
				}
				String overalStudentGradeTOP = """
				======================  STUDENT's GRADE  ======================
				""";
				System.out.print(overalStudentGradeTOP);
				String line = """
				===============================================================
				""";
				System.out.print("Subject	");
				for (String subject : subjectNamesList){
					System.out.print(subject + "	");
				}
				System.out.print("TOT	AVG	REMARK	POS");
				System.out.println();
				System.out.print(line);
				System.out.println();
				StudentGradeFunctions.printStudentGrade(studentNamesList, studentScore);

				System.out.print(line);
				//System.out.print(line);
				//System.out.print(line);
				
			}// end of case 4
			case "5"->{
				if (studentNamesList.size() < 1 || subjectNamesList.size() < 1 || studentScore.length < 1){
					System.out.print("Empty database");
					break;
				}
				System.out.print("Computing, please wait  . . . . . .");

			}// end of case 5
			case "6"->{
				if (studentNamesList.size() < 1 || subjectNamesList.size() < 1 || studentScore.length < 1){
					System.out.print("Empty database");
					break;
				}
				System.out.print("Computing, please wait  . . . . . .");

			}// end of case 6
			case "7"->{
				if (studentNamesList.size() < 1 || subjectNamesList.size() < 1 || studentScore.length < 1){
					System.out.print("Empty database");
					break;
				}
				
				int total = StudentGradeFunctions.getTotalTotal(studentScore);
				double average = StudentGradeFunctions.getTotalAverage(studentScore, (numberOfSubjects*numberOfStudents));
				//System.out.print(total);
				StudentGradeFunctions.printOtherSummary(total, average);


			}// end of case 7
			case "8"->{
				System.out.print("Thank you for schooling with us");
				break;
			}
			default ->{
				System.out.print("Invalid input, make the right selection");
			}

		} //end of switch case
		}// end of while loop




	} // end of Main method

}