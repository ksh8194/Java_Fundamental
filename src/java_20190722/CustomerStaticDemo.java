package java_20190722;

import java_20190719.Customer;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		//static 변수는 클래스 이름으로 접근한다.
		Customer.interestRate = 3.7;
				
		Customer c1 = new Customer();
		c1.name ="홍길동";
		c1.age = 40;
		c1.email = "kdhong@test.com";
		c1.phone = "010-8080-0987";
		c1.balance = 190000.43;
		c1.isReleased = false;
		
		// final 변수는 재할당 할 수 없음
		//Customer.BANKNAME = "국민은행";
		//static 변수는 클래스 이름으로 접근하는 것이 관례이지만 reference로도 접근가능(권장하지않음)
		//c1.interestRate = 3.5;
		
		
		Customer c2 = new Customer();
		c2.name ="아무개";
		c2.age = 50;
		c2.email = "noname@test.com";
		c2.phone = "010-2345-9876";
		c2.balance = 350000.45;
		c2.isReleased = false;
		
		
		System.out.println(Customer.interestRate);
		
		Customer c3 = new Customer();
		c3.name ="배조스";
		c3.age = 62;
		c3.email = "jaws@amazon.com";
		c3.phone = "010-1111-1111";
		c3.balance = 1200.45;
		c3.isReleased = false;
				
	}

}
