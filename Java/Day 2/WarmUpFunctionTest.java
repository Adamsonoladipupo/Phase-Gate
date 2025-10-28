import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUpFunctionTest{

	WarmUpFunction warmUpFunction;

	@BeforeEach 
	public void setUp(){
		warmUpFunction = new WarmUpFunction();
	}
	
	@Test
	public void TestGetYearWhenPriceTurnZeroFunction(){
		//assertEquals( , warmUpFunction.GetYearWhenPriceTurnZero());		
	}

	@Test
	public void TestIfGetYearWhenPriceTurnZeroFunctionReturnTheDesiredResult(){

		assertEquals(12 , warmUpFunction.GetYearWhenPriceTurnZero(1));
				
	}



}