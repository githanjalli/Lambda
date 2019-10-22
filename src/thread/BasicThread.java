package thread;

import java.util.concurrent.TimeUnit;

public class BasicThread {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts!");

		//new TestThread1().start();

		new TestThread2();

		System.out.println("Main Thread Ends!");

	}
}

class TestThread1 extends Thread {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("<"+ id + "> Try" + i);
		}

		try {
			TimeUnit.MICROSECONDS.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public TestThread1()
	{
		this.id = ++count;
	}
}

class TestThread2 implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("<"+ id + "> Try" + i);
		}

		try {
			TimeUnit.MICROSECONDS.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public TestThread2()
	{
		this.id = ++count;
		new Thread(this).start();
	}
}
