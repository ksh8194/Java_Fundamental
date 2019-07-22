package java_20190722;

public class MethodDemo {
	
	//5~8라인까지 메서드를 정의
	public boolean isLeafYear(int year) {
		//메서드의 반환값이 boolean이기떄문에 return value의 value도 boolean이어야 한다.
		return year%4 == 0 && year%100!=0 || year%400==0;
	}
	
	
	
	public char charofString(String msg, int index) {
		//String msg = "hello";
		return msg.charAt(index);
		
	}
	
	
	
	public long plus(int first, int second) {
		return (long)first+(long)second;
	}
	
	//나누기
	public double divide(double x, double y) {
		return x/y;
	}
	
	public void ascending(int[] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		MethodDemo m1 = new MethodDemo();
		//인스턴스 메서드의 사용범
		//객체 생성한 후에 reference(m1)을 이용해서 호출하면됨.
		boolean isLeafYear = m1.isLeafYear(234);
		System.out.println(isLeafYear);
		//"hello",0 --> 
		char c = m1.charofString("hello", 0);
		System.out.println(c);
		
		long sum = m1.plus(2100000000, 2100000000);
		System.out.println(sum);
		double div = m1.divide(3,5);
		System.out.println(div);
		
		int[] temp = {4,3,1,2,6,27};
		
		
		for(int a : temp) {
			System.out.print(a+"\t");
		}
		System.out.println();
		
		m1.ascending(temp);
		
		for(int a : temp) {
			System.out.print(a+"\t");
		}
		System.out.println();
	}
	

	
}

