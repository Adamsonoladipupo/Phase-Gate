public class WarmUpFunction{

	public static double GetYearWhenPriceTurnZero( int NumberOfItems){

		double tempVar = 0;
		double numberOfYears = 0;
		int price = 50000;
		int priceAndNumberOfItems = NumberOfItems * 50000;
		while (price == 0){
			tempVar = price * 0.08;
			price -= tempVar;
			numberOfYears ++;
			tempVar = 0;
		}
		return numberOfYears;
	}
}