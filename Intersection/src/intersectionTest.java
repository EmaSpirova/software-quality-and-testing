import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class intersectionTest {

	@Test
	 public void test2() {
	Set<Integer> set = new HashSet<Integer>(); 
	set.addAll(Arrays.asList(new Integer[] {1})); 
			
	assertThrows(NullPointerException.class, () -> intersection.intersection(set, null));
	    }



}
