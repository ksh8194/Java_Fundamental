package java_20190719;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","watermelon","blueberry"};
		
		String[] temp = new String[6];
		//fruits => 원본배열
		//0 => 원본배열의 위치 즉, 원본배열의 복사할 위치
		//temp => 카피할 배열
		//0 => 카피할 배열의 위치
		//4 => 원본배열의 4개요소를 카피
		System.arraycopy(fruits, 0, temp, 0, 4);
		temp[4] = "peach";
		temp[5] = "rasberry";
		
		for (int i = 1 ; i< temp.length; i++) {
			System.out.println(temp[i]);
			
		}
		for(String $ : temp) {
			System.out.println($);
		}
	}

}
