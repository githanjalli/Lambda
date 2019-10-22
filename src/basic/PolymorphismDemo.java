
package basic;

import java.util.Arrays;

/**
 * Method overloading/ Overriding -> polymorphism concept
 * Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism (easier to fix).
 * @author Githanjalli E
 *
 */
class Processor {

	/*
	 * The process() method is overloaded in the Processor class.
	 */
	public int process(int i, int j) {
		//System.out.printf("Processing two integers:%d, %d", i, j);
		return i + j;
	}

	public void process(int[] ints) {
		System.out.println("Adding integer array:" + Arrays.toString(ints));
	}

	public void process(Object[] objs) {
		System.out.println("Adding integer array:" + Arrays.toString(objs));
	}
}

class MathProcessor extends Processor {

	/*
	 * The process() method is overridden in the child class MathProcessor.
	 */

	@Override
	public int process(int i, int j) {

		/**
		 * When invoking a superclass version of an overridden method the super keyword is used.
		 */
		int x = super.process(i, j);
		return i + j + x;
	}

	@Override
	public void process(int[] ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		System.out.println("Sum of integer array elements is " + sum);
	}

}

public class PolymorphismDemo {

	public static void main(String args[]) {

		Processor b = new MathProcessor();  
		System.out.println("return" + b.process(3, 5));   
	}
}
