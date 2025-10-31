import java.util.Arrays;

/*
public class MiniParkingSystemFunction{

	public static void main(String [] args){
	
	int[] carPark = new int[20];
	int[] carParkSlotNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

	System.out.print(parkCar(carPark, 1));
	//System.out.printf(Arrays.toString(carParkSlotNumber), Arrays.toString(carPark));



	}// end of main method

	public static String parkCar(arrays arrayInput, int userInput){
		String output = "";
		for (int count = 0; count < 20; count++){
			if (userInput == count+1 && arrayInput[count] == 0){
				arrayInput[count] = 1;
				output = "Car parked successfully";
				break;
			}

			if (userInput == count+1 && arrayInput[count] == 1){
				arrayInput[count] = 1;
				output = "The selected slot is occupied, choose another slot";
				break;
			}
		}
		return output;

	} 

*/
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

/*
	public static String parkCar(int input, array arrayInput){

		arrayInput[input] = 1;
		String message = "Car parked successfully";
		return message;

	}
*/
}