public class TaskNine{
	public static void main(String[] args){
		int multiple = 1;
		int sumOfMultiples = 0;
		for (int count = 0; count < 5; count++){
			multiple *= 4;
			sumOfMultiples += multiple;
		} 

		multiple = 1;

		for (int count = 0; count < 5; count++){
			multiple *= 8;
			sumOfMultiples += multiple;
		} 
		System.out.println(sumOfMultiples*sumOfMultiples);
	}
}