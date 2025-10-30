public class isPerfectSquare{
	public static void man(String[] args){
		int[] testList = {4, 9, 25, 49};

		for (int count = 0; count < testList.length; count++){
			int check = isPerfectSquareFunction.isPerfectSquare(testList[count]);
			testList[count] = check;
			System.out.print(check);
		}
		
		

	}	
}