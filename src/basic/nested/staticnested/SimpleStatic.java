package basic.nested.staticnested;

class GFG { 

	// static method 
	/**
	 * The memory of a static method is fixed in the ram
	 * For this reason we don’t need the object of a class in which the static method is defined to call the static method
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sum(int a, int b) 
	{ 
		return a + b; 
	} 
	
	// non static method 
	/**
	 * the memory of non-static method is not fixed in the ram
	 * we need class object to call a non-static method
	 * @return
	 */
	public String nonstat() 
	{ 
		return "I am non-static";
	} 
} 

class SimpleStatic { 
	
	public static void main(String[] args) 
	{ 
		int n = 3, m = 6; 

		// call the static method 
		int s = GFG.sum(n, m); 
		
		System.out.println("sum is = " + s); 
		
		GFG g = new GFG();
		System.out.println(g.nonstat());
		
		
	} 
} 
