package java_20190725;

public class Child extends Parent {
	static {
		staticChild = 200;
		System.out.println("Child static 초기화");
	}
	static int staticChild;
	String phone;
	
	{System.out.println("Child instance block");
	
	}
	public Child() {
		//super();
		System.out.println("Child 생성자");
	}

}

////순서 : 인스턴스할당 ---> 생성자