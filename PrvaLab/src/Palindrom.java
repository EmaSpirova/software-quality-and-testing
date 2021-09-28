

public class Palindrom {
	
	
	public Boolean palindrome (String word) {
		 for(int i = 0; i < word.length(); i++) {
		        if(word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) {
		            return false;
		        }
		       
		    }
		
		 
		    return true;
	}
	
	/*
	 * An empty string is a string instance of zero length, whereas a null string has no value at all. 
	 * An empty string is represented as "" . It is a character sequence of zero characters. A null string
	 *  is represented by null . It can
	 *  be described as the absence of a string instance.
	 */
	
	public void empty(String word) throws Exception  {
		if(word == "") {
			throw new Exception("Emppty String");
		}
		
	}
	
	public void nullString(String word) {
		if(word == null) {
			throw new NullPointerException();
		}
	}
}
