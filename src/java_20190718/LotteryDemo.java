package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		// Math.random() = > 0보다 크거나 같고 1보다 작은 양수를 double 값의 형태로 반환한다.
		
		int bigyo= 0 ;
		
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			double random = Math.random();
			int temp= (int)(random*45)+1;
			
			if(i==0) {
				lotto[i]=temp;
			
			}else {
				boolean isExisted = false;
				//i==1 아래의 for loop는 1번 반복
				//i==2 아래의 for loop는 2번 반복
				//i==3 아래의 for loop는 3번 반복
				for(int j=0;j<i;j++) {
					if(lotto[j]==temp) {
						//새로 생성한 temp와 이전 배열의 값을 비교해서 같은 값이 존재하면 
						isExisted=true;
						break;
					}
				}
				if(!isExisted){
					lotto[i] = temp;
				}else {
					i--;
				}
			}
		/*
			while(bigyo==lotto[i]) {
				random = Math.random();
				temp = (int)(random*45)+1;
				lotto[i]=temp;
			}
			lotto[i]=temp;
			
			
		 }*/
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}

}
