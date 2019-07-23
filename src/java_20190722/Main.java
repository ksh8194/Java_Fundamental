package java_20190722;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(A>=B) {
			if(B>=C) {
				System.out.println(B);
			}else if(A>=C) {
				System.out.println(C);
			}else {
				System.out.println(A);
			}
		}else {
			if(A>=C) {
				System.out.println(A);
			}else if(B>=C) {
				System.out.println(C);
			}else {
				System.out.println(B);
			}
		}
		
	
	}
	
}

/*	Scanner scanner = new Scanner(System.in);
int H = scanner.nextInt();
int M = scanner.nextInt();

if(45>M && M>=0) {
	if(H==0) {
		H=23;
		H++;
	}
	H--;
	M = 60+M-45;
	System.out.print(H);
	System.out.printf(" ");
	System.out.print(M);
}else if(M>45 && M<61){
	M = M-45;
	System.out.print(H);
	System.out.printf(" ");
	System.out.print(M);
}
*/