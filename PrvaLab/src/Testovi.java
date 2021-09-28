import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Testovi {

	@Test
	public void test() {
		Palindrom palin = new Palindrom();
		boolean output = palin.palindrome("racecar");
		assertEquals(true, output);
	}
     @Test
	public void test2() {
		Palindrom palin = new Palindrom();
		boolean output = palin.palindrome("TeSt");
		assertEquals(false, output);
	}
     
     @Test
 	public void test3() {
 		Palindrom palin = new Palindrom();
 		boolean output = palin.palindrome("testc@se");
 		assertEquals(false, output);
 	}
     
     @Test
 	public void test4() {
 		Palindrom palin = new Palindrom();
 		boolean output = palin.palindrome("151");
 		assertEquals(true, output);
 	}
     @Test
  	public void test5() {
  		Palindrom palin = new Palindrom();
  		boolean output = palin.palindrome("eyE");
  		assertEquals(true, output);
  	}
     
     @Test
     public void shouldRecognizeOneCharacterPalindrome() {
    	 Palindrom palin = new Palindrom(); 
  		boolean output = palin.palindrome("a");
         assertEquals(true, output);   
     }

     @Test
     public void shouldRecognizeTwoCharacterPalindrome() {
    	 Palindrom palin = new Palindrom();
   		boolean output = palin.palindrome("bb");
          assertEquals(true, output);
     }

     @Test
     public void shouldNotRecognizeTwoCharacterPalindrome() {
    	 Palindrom palin = new Palindrom();
   		boolean output = palin.palindrome("ab");
          assertEquals(false, output);
     }
}
