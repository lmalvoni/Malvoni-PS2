package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime; 

	@Test
	public void testIsEven() {
		MyInteger myIntEven = new MyInteger(2);

		assertTrue(myIntEven.isEven()==true);

	}
	@Test
	public void testIsOdd() {
		MyInteger myIntOdd = new MyInteger(9);

		assertTrue(myIntOdd.isOdd()==true);


	}
	@Test
	public void testIsPrime() {
		MyInteger myIntPrime = new MyInteger(3);

		assertTrue(myIntPrime.isPrime()==true);

	}
	@Test
	public void testparseInt() {
		char[] a = {'1','3','5','8'};
		assertEquals(MyInteger.parseInt(a),1358);

	}
	@Test
	public void testparseInt2() {
		String s = "12345";
		assertEquals(MyInteger.parseInt(s),12345);

	}
}