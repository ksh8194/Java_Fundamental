package java_20190731;

public class TryCatchDemo {
	public static double getAvg(int korean, int english) {
		int sum = korean + english;
		double avg = (double) sum / (double) 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			double average = getAvg(korean,english);
			System.out.printf("평균은 :%f",average);
	}catch(NumberFormatException e1) {
		//System.out.println("예외 메시지 : "+e1.getMessage());
		System.err.println("문자 말고 숫자를 입력하시오");
	}catch(ArrayIndexOutOfBoundsException e2) {
		System.err.println("2개 넣으시오");
	} finally {
		//무조건 수행되는 블럭 자주씀
		System.out.println("finally");
	}
	}
		
	

}

