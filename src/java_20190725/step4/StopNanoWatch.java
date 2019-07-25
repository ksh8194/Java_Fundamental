package java_20190725.step4;

public class StopNanoWatch {
	
	long start;
	long end;
	
	public void start() {
		start = System.nanoTime();
	}
	
	public void stop() {
		end = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (end - start) / (double) 1000000000;
	}
	
}
