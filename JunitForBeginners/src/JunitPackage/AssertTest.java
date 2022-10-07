package JunitPackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class AssertTest {
	 
	@Test
	public void test() {
		boolean condn= true;
		assertEquals(true,condn);
		assertTrue(condn);
		
	}

}
