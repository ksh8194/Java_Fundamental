package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		
			int[] lotto = new int[6];

			for (int i = 0; i < lotto.length; i++) {
				double random = Math.random();
				int temp = (int) (random * 45) + 1;

				if (i == 0) {
					lotto[i] = temp;
				} else {
					boolean isExisted = false;

					for (int j = 0; j < i; j++) {
						if (lotto[j] == temp) {
							isExisted = true;
							break;
						}
					}
					if (!isExisted) {
						lotto[i] = temp;
					} else {
						i--;
					}
				}
			}

			for (int i = 0; i < lotto.length; i++) {
				for (int j = 0; j < lotto.length - (i + 1); j++) {
					if (lotto[j] > lotto[j + 1]) {
						int temp = lotto[j];
						lotto[j] = lotto[j + 1];
						lotto[j + 1] = temp;
					}
				}
			}
			
			for(int i = 0 ; i<lotto.length;i++) {
		
				System.out.printf(lotto[i] + "\t");
			}
			System.out.println();
		}
	}

