package Level4Module3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		try {
			ExceptionMethods.divide(8.54, 0.0);
			fail("IllegalArgumentException not thrown");
		}catch(IllegalArgumentException i) {
			System.out.println("IllegalArgumentException thrown");
		}
		
		try {
			ExceptionMethods.divide(1.0, 0.0);
			fail("IllegalArgumentException not thrown");
		}catch(IllegalArgumentException i) {
			System.out.println("IllegalArgumentException thrown");
		}
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		try {
			ExceptionMethods.reverseString("");
			fail("IllegalStatetException not thrown");
		}catch(IllegalStateException i) {
			System.out.println("IllegalStateException thrown");
		}
		
		try {
			String s = ExceptionMethods.reverseString("racecar");
			assertEquals("racecar", s);
		}catch(IllegalStateException i) {
			System.out.println("IllegalStateException thrown");
			fail("IllegalStatetException not thrown");
		}
	}
	
	
	

}