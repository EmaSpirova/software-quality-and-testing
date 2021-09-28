import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;



class PalindromTest {

	private Palindrom palindromeChecker;
	
	@BeforeEach
	public void setup(){
		palindromeChecker = new Palindrom();
	}

	public static Collection<Object[]> palindromi() {
		return Arrays.asList(new Object[][] {
		{ "*racecar*", true },
		{ "Cdkjd", false },
		{ "ANA", true },
		{ "2#test", false },  
		{ "level", true },  
		{ "Madam", true }     
		});
	}

	
	@ParameterizedTest
	@MethodSource("palindromi")
	
	public void testPrimeNumberChecker (String wordInput,boolean expectedResult) {
	System.out.println("Parameterized Word is : "+ wordInput);
	assertEquals(expectedResult,palindromeChecker.palindrome(wordInput));
	}

}
