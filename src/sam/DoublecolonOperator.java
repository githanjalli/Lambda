package sam;
import java.util.stream.*; 

public class DoublecolonOperator { 
	public static void main(String[] args) 
	{ 

		// Get the stream 
		Stream<String> stream 	= Stream.of("Test", "this", "new", "Lambda", "of", "Java 8"); 

		// Print the stream using lambda
		//stream.forEach(s -> System.out.println(s)); 
				
		// Print the stream 
        // using double colon operator 
        stream.forEach(System.out::println); 
	} 
} 
