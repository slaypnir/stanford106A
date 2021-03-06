/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class RaiseToPower extends ConsoleProgram {
	public void run() {
		/* Sit in a loop reading bases and exponents and printing out the values
		 * produced by raising the base to the exponent.
		 */
		while (true) {
			double base  = readDouble("Enter base: ");
			int exponent = readInt("Enter exponent: ");
			println(base + " ^ " + exponent + " = " + raiseToPower(base, exponent));
		}
	}
	
	private double raiseToPower(double base, int exponent) {
		/* TODO: Delete this comment and replace the implementation of this method
		 * with the correct implementation.
		 */
		double result=1;
		
//		if (exponent==0) {
//			result = 1;
//		}
		if (exponent>0) {
			for (int i=0;i<exponent;i++) {
				result*=base;
			}
		}
		else if (exponent<0){
			for (int i=0;i<-exponent;i++) {
				result/=base;
			}
		}
		return result;
	}
}
