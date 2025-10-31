import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniParkingSystemTest{
	
	MiniParkingSystemFunction miniParkingSystem ;

	@BeforeEach
	public void setUp(){
		MiniParkingSystemFunction miniParkingSystem = new MiniParkingSystemFunction();

	}

	@Test
	public void TestMiniParkingSystemFunction(){


	}

	@Test
	public void TestIfParkingACarChangesTheSlotToOccupied(){
		//MiniParkingSystemFunction miniParkingSystem = new MiniParkingSystemFunction();
		int result = miniParkingSystem.parkCar(1);
		assertEquals(result, 1);

	}
}