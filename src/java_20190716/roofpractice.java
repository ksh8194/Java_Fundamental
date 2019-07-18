package java_20190716;

import java.util.Scanner;

public class roofpractice {
	public static void main(String[] args) {
		int input = 0 , answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은수로 다시 시도해 보세요");
			}else if(input<answer) {
				System.out.println("더 큰 수로 다시 시도해 보세요");
			}
		}while(input!=answer);
		
		System.out.println("정답입니다!");
		
		
		
		
		
		
		
	}
}
/*for(int i=1;i<=5;i++) {
for(int j=1;j<=5;j++) {
	if(i==j) {
		System.out.printf("[%d,%d]",i,j);
	}else {
		System.out.printf("%5c",' ');
	}
}
System.out.println();
} */
/*for(int i=1;i<=5;i++) {
for(int j=1;j<=10;j++) {
	System.out.print("*");
}
System.out.printf("\n");
}
*/

/*for(int i=1;i<=5;i++) {
for(int j=1;j<=i;j++) {
	System.out.print("*");
	
}
System.out.println();
}
*/
/*for(int i=2;i<=9;i++) {
for(int j=1;j<=9;j++) {
	System.out.printf("%d * %d = %d\n",i,j,i*j);
}
} */