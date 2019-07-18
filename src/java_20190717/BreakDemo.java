package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {

		/*
		  for(int i=1;i<=5;i++) { for(int j=1;j<=6-i;j++) { System.out.printf("*"); }
		  System.out.println(); }
		 */

		/*
		  for(int i=9;i>=2;i--) { for(int j=1;j<=9;j++) {
		  System.out.printf("%d * %d = %d\n",i,j,i*j); } System.out.println(); }
		 */

		
		  int sum = 0; 
		  for(int i =1;i<=10;i++) { 
			  if(i==6) { 
				  break;
			  }
			  sum=sum+i;
			
			  }
		  
		   System.out.printf("1부터 100까지의 합: %d", sum);
	}
}



