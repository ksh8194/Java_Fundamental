package java_20190718;

public class LotteryPractice {
	public static void main(String[] args) {
		
		
	int lotto[] = new int[5];
	
	for(int i=0;i<lotto.length;i++) {
		double random = Math.random();
		int temp = (int)(random * 45) + 1;
		if(i==0) {
			lotto[i] = temp;
		}else {
			boolean isExisted = false;
			
			for(int j=0;j<i;j++) {
				if(lotto[j] == temp) {
				isExisted = true;
				break;
				}
			}
			if(!isExisted) {
				lotto[i] = temp;
				i--;
			}
		  
		}
		
		
	}
	}

}
