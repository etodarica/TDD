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
	public void geradeZahl() {
		boolean ergebnis = gz.testeZahl(4);
		//assertEquals(Object expected, Object actual)
		assertEquals(true, ergebnis);
	}
	
	@Test
	public void ungeradeZahl() {
		boolean ergebnis = gz.testeZahl(3);
		//assertEquals(Object expected, Object actual)
		assertEquals(false, ergebnis);
	}
	
	@Test
	public void negativeZahl() {
		boolean ergebnis = gz.testeZahl(-2);
		assertFalse(ergebnis);
	}
	


}
