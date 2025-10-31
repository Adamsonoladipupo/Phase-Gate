import java.util.Arrays;
import java.util.Scanner;

public class MiniParkingSystem{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		int[] carPark = new int[20];
		int[] carParkSlotNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		while (true){
		
		System.out.print(displayMenu());
		System.out.print("Make a selection :");
		int mainMenuInput =  inputCollector.nextInt();
		switch(mainMenuInput){
			case 1 -> {
				System.out.printf(getCarParkAndSlots(), Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));
				System.out.print("Select a parking slot: ");

				int userInput =  inputCollector.nextInt();

				for (int count = 0; count < carPark.length; count++){
					if (userInput == count+1 && carPark[count] == 0){
						carPark[count] = 1;
						System.out.println("Car parked successfully");
						break;
					}

					if (userInput == count+1 && carPark[count] == 1){
						carPark[count] = 1;
						System.out.println("The selected slot is occupied, choose another slot");
						break;
					}
				}
				System.out.printf(getCarParkAndSlots(), Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));


			}// end of case 1
			case 2 -> {
				System.out.printf(getCarParkAndSlots(), Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));
				System.out.print("Select the slot your car was parked: ");

				int userInput =  inputCollector.nextInt();

				for (int count = 0; count < carPark.length; count++){
					if (userInput == count+1 && carPark[count] == 1){
						carPark[count] = 0;
						System.out.println("Car taken sucessfully");
						break;
					}
					else{
						System.out.println("Wrong slot selected, no car was parked here");
						break;
					}
				}
				System.out.printf(getCarParkAndSlots(), Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));




			} // of of case 2
			case 3 -> {
				System.out.printf(getCarParkAndSlots(), Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));
			}
			case 4 -> {break;}
			default-> {System.out.print("Wrong input, select from the options ");}
		}// end of switch case
		} // end of while loop
		
	}

	public static String getCarParkAndSlots(){
	
		String carPark = """
		Slot Numbers : %s
		Parking Slots : %s
		""";
		return carPark;

	}

	public static String displayMenu(){
	
		String mainMenu = """

		Welcome to Semi Parking System
		>> Park your cars with ease <<	

		1. Park your car.
		2. Take your parked car.
		3. Check available slot

		""";
		return mainMenu;

	}
}