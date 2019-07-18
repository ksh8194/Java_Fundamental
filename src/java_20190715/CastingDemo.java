package java_20190715;

public class CastingDemo {
	public static void main(String[] args) {
		// overflow 발생하여 컴파일 에러
		//byte b1 = 250;
		
		byte b1 = (byte)250; // circuit발생 , 권장X
		System.out.println(b1);
		
		int i1 = (int)123.45; //cut 발생
		System.out.println(i1);
		
		double d1 = 123.45f; // 자동 Casting
	}

}
