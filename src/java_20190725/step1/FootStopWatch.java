package java_20190725.step1;

//1. 요구일은 밀리 세컨드로 경과 시간을 만들어주세요

public class FootStopWatch {
	long startTime;
	long endTime;
	
	
	long startNanotime;
	long endNanoTime;
	
public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}

public double getElapsedNanoTime() {
	return (double)(endNanoTime - startNanotime)/(double)1000000000;
}
	
	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		
		//currentTimeMillis() = > 1970 1 1 일부터 지금까지 시간을 밀리세컨드로 반환한다.
		f1.startTime = System.nanoTime();
		for(long i = 0 ; i < 30000000000L;i++) {
			
		}
		
		f1.endNanoTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
