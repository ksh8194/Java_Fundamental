package java_20190806;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	
	public synchronized void run() {
		for(int i=0;i<100;i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s%n", x,y,threadName);
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		
		t1.start();
		t2.start();
	}
	
}
