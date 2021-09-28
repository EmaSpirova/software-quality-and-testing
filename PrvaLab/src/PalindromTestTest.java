import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromTestTest {

	
	@Test
	public void test() {
		Palindrom prazenString = new Palindrom();
		assertThrows(Exception.class, () -> prazenString.empty(""));
	}

	
	

	@Test
	public void testZaNull() {  
		Palindrom nullStr = new Palindrom();
		assertThrows(NullPointerException.class, () -> nullStr.nullString(null));
	}
}  
