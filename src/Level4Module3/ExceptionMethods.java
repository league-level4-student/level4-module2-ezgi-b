package Level4Module3;

public class ExceptionMethods {
	public static double divide(double one, double two) throws IllegalArgumentException{
		if(two == 0.0) {
			throw new IllegalArgumentException();
		}
		return one/two;
	}
	
	public static String reverseString(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		String output = "";
		for(int i = s.length()-1; i>=0; i--) {
			output += s.charAt(i);
		}
		return output;
	}
}