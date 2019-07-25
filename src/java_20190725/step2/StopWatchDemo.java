package java_20190725.step2;



public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();

		// currentTimeMillis() = > 1970 1 1 일부터 지금까지 시간을 밀리세컨드로 반환한다.
		
		s1.startNano();
		for (long i = 0; i < 30000000000L; i++) {

		}

		s1.stopNano();

		double elapsedTime = s1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
