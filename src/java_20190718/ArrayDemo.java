package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열 선언
		int[] a = new int[4];
		//배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//배열 출력
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			int temp = a[i];
			sum+=temp;
			System.out.println(temp);
		}
	System.out.println(sum);
	
	//배열 생성과 할당이 동시에 이루어짐
	int[] b = {1000,2000,3000,4000};

	
	//배열의 출력
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	System.out.println(b[3]);
	
	System.out.println();
	
	//배열의 출력
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
	}

}
