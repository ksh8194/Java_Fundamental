package java_20190716;

import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		System.out.println("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		System.out.printf("당신의 점수는 %d 입니다\n",score);
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		System.out.printf("당신의 등급은 %c 입니다",grade);
	}

}