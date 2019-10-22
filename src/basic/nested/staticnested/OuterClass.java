
package basic.nested.staticnested;

/**
 * static is a keyword used to describe how objects are managed in memory. 
 * It means that the static object belongs specifically to the class, instead of instances of that class. 
 * Variables, methods, and nested classes can be static.
 * 
 * The only benefit -> encapsulation. 
 * If the static nested class works only with the outer class then we can keep nested class as static to keep them close.
 * 
 * @author Githanjalli E
 *
 */

public class OuterClass {

	private static String name = "OuterClass";

	// static nested class
	static class StaticNestedClass {
		private int a;

		public int getA() {
			return this.a;
		}

		public String getName() {
			return name;
		}
	}
}
