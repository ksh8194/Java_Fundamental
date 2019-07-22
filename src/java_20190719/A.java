package java_20190719;


//public은 파일이름과 동일한 클래스에만 쓸수있음.
public class A {
	String name;
	int age;
	
	public void m() {
		System.out.println("m() 메서드");
	}
	

	public static void main(String[] args) {
		A a = new A();
		a.name= "김성현";
		a.age=20;
		
		System.out.println(a.name);
		System.out.println(a.age);
		a.m();
}

class b{
	//main 메서드가 실행되기 위해서는 public이 추가된 클래스에서만 작동됨
	//main 메서드가 실행되기 위해서는 파일이름과 동일한 클래스에서 작동됨
	
	}
}
	
