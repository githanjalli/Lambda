
package basic.nested.staticnested;

public class StaticNestedClassTest {
	
	public static void main(String[] args) {
		
		//creating instance of static nested class
		OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
		
		//accessing outer class static member
		System.out.println(nested.getName()); 
	}

}
