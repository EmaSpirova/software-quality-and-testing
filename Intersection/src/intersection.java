import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;

public class intersection {

	public static Set intersection(Set a, Set b) {
		
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		
		if(a==b) {
			return a;
		}
			// To find intersection
			Set<Integer> intersectionSet = new HashSet<Integer>(a);
			intersectionSet.retainAll(b);
			return intersectionSet;

	}

	public static void emptySet(Set a, Set b) throws Exception {
		if(a.isEmpty() || b.isEmpty()) {
			throw new Exception();
		}
	}
	
}
