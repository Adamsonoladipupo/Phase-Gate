import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class CheckoutSystemApp{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		
		ArrayList <String> productsList = new ArrayList <String>();
		ArrayList <Integer> priceList = new ArrayList <Integer>();
		//products.add("mango");
		
		System.out.println("Welcome to M-Super Market");

		System.out.print("Enter product name or type 'done' to finish: ");
		String productName = inputCollector.nextLine();
		productsList.add(productName);
		System.out.print(productsList);

		System.out.print("Enter price for Laptop: ");
		int productPrice = inputCollector.nextInt();
		priceList.add(productPrice);
		System.out.print(priceList);

		
		
	}
}