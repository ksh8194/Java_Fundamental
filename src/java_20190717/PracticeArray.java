package java_20190717;

public class PracticeArray {
	public static void main(String[] args) {
		

		int[] iArray = new int[] {13,14,15,16};
		for(int i=0;i<iArray.length;i++) {
			System.out.println(iArray[i]);
		}
		//int[] score = new int[]{10,13,16,26};
		//int[] score = {10,20,15,361,1}; 생성과 동시에 초기화
		
		
		
		//배열이름.length 배열의길이를 나타내는 상수
		/*int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
	
	/*int[] score = new int[5]; //길이가 5인 배열 score 생성
	int k = 1;
	
	score[0]= 50;
	score[1]= 60;
	score[k+1]=70;
	score[3]=80;
	score[4]=90;
	int tmp = score[k+2] + score[4];
	
	for(int i=0;i<5;i++) {
		System.out.printf("score[%d]:%d%n", i,score[i]);
	}
	System.out.printf("tmp:%d%n",tmp);
	System.out.printf("score[%d]:%d%n",7,score[7]); */
}

}
