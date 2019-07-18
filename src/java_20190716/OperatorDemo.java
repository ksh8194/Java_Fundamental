//자동 들여쓰기 Ctrl + shift + f

package java_20190716;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a+b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		d = (double)b / (double)a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a+=b; // a = a + b;
		System.out.println(a);
		int sum=0; 
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		a++;
		b++;
		
		c = a++;
		System.out.println(c);
		c = ++b;
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		isSuccess = a == b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		// a && b => a가 false이면 b연산을 하지 않음(short circuit)
		// a || b => a가 true이면 b연산을 하지 않음(shirt Circuit)
		isSuccess = (a==b) && (++a == b++);
	}

}
