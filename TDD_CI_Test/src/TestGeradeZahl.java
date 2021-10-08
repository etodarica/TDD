import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGeradeZahl {
	
	GeradeZahl gz = new GeradeZahl();
	
	/* 
	@Test
	
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	/* JUnit API documentation:
	 * https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
	 */
	@Test
	void geradeZahl() {
		boolean ergebnis = gz.testeZahl(4);
		//assertEquals(Object expected, Object actual)
		assertEquals(true, ergebnis);
	}
	
	@Test
	void ungeradeZahl() {
		boolean ergebnis = gz.testeZahl(3);
		//assertEquals(Object expected, Object actual)
		assertEquals(false, ergebnis);
	}
	
	@Test
	void negativeZahl() {
		boolean ergebnis = gz.testeZahl(-2);
		assertFails(false, ergebnis);
	}

}
