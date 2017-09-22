package IT7320;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	
	CalcImplementation obj;
	int x;
	int y;
	
	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		x = 7;
		y = 10;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		
		when(mockObj.add(x, y)).thenReturn(x+y);	
		when(mockObj.substract(x, y)).thenReturn(x-y);
		when(mockObj.multiply(x, y)).thenReturn(x*y);
		when(mockObj.divide(x, y)).thenReturn((double) x / (double) y);
		
		obj.setIntObj(mockObj);
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
	}

	public void testAddTwoNums() {
		assertEquals(17,obj.addTwoNums(x, y));
	}
	
	public void testSubstractTwoNums() {
		assertEquals(-3,obj.substractTwoNums(x, y));
	}
	
	public void testMultiplyTwoNums() {
		assertEquals(70,obj.multiplyTwoNums(x, y));
	}
	
	public void testDivideTwoNums() {
		assertEquals(0.7,obj.divideTwoNums(x, y));
	}

}
