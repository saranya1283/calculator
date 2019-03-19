/**
 * 
 * @author saranya
 *
 */
public class Claculator {
	/**
	 * 
	 * @param a
	 * @param b
	 * return int addition
	 */
	public int add(int a,int b) {
		return a+b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * return int multiplication
	 */
	public int mul(int a,int b){
		return a*b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return int division and also throws exception if it divides by 0
	 */
	public int div(int a,int b){
		if(b==0)
			throw new ArithmeticException("cannot divide");
		else
			return (a/b);
	}
}
