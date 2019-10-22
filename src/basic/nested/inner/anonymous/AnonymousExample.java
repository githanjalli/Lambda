
package basic.nested.inner.anonymous;

public class AnonymousExample {

	//nested anonymous class
	public static Hello hello = new Hello() {
		
		@Override
		public void sayHello() {
			System.out.println("Hello nested anonymous class");
			
		}
	};
	
	public static void main(String[] args) {
		
		//anonymous class inside method
		Hello h = new Hello() {

			@Override
			public void sayHello() {
				//System.out.println("Hello anonymous class");
			}
		};
		
		h.sayHello();
		
		AnonymousExample.hello.sayHello();
	}

}
