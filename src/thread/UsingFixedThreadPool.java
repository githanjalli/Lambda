package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Starts!");

		ExecutorService execService = Executors.newFixedThreadPool(6);

		execService.execute(new SimpleThread());
		execService.execute(new SimpleThread());
		execService.execute(new SimpleThread());
		execService.execute(new SimpleThread());
		execService.execute(new SimpleThread());
		execService.execute(new SimpleThread());
		
		execService.shutdown();
		
		System.out.println("Main Thread Ends!");

	}
}

