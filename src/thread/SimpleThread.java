package thread;

import java.util.concurrent.TimeUnit;

class SimpleThread implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		System.out.println("### <TASK- " + id + "> STARTING ###");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("<"+ id + ">" + i);
		}

		try {
			TimeUnit.MICROSECONDS.sleep((long)(Math.random() *1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("### <TASK- " + id + "> DONE ###");
	}


	public SimpleThread()
	{
		this.id = ++count;
	}
}
