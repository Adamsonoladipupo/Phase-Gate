import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringsFromFirstChTest{
	
	ReverseStringsFromFirstChFunction reverseStringObject;

	@BeforeEach
	public void setUp(){
		reverseStringObject = new ReverseStringsFromFirstChFunction();
		String letters = "abcdefd";
		char character = 'd';
	}
	
	@Test
	public void CheckIFGetStringFunctionActuallyGetAString(){
		assertEquals("abcdefd", reverseStringObject.getString("abcdefd"));
	}

	@Test
	public void CheckIFGetCharacterFunctionActuallyGetACharacter(){
		assertEquals('d', reverseStringObject.getCharacter('d'));
	}
}