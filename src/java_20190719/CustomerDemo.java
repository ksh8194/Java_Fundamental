package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		//Customer 객체 생성
		//Customer Object type
		//c1 => reference
		//new Customer() => Object
		Customer c1 = new Customer();
		c1.name = "김성현";
		c1.age = 30;
		c1.email="story3388@naver.com";
		c1.phone="010-0000-0000";
		c1.isReleased = false;
		c1.balance = 100000000;
		
		
		System.out.printf("%s,%d,%s,%s,%s,%f",c1.name,c1.age,c1.email,c1.phone,c1.isReleased,c1.balance);
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email = "jeson@softbank.com";
		c2.phone = "010-0000-0000";
		c2.isReleased = true;
		c2.balance = 45000000000.2;
				
		
			
		}
		
	}


