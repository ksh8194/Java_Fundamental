package java_20190725;

public class ChildDemo {
	public static void main(String[] args) {
		System.out.println("Main");
		Child c = new Child(); // 객체 만들기전 static부터 메모리에 올리고 초기화 시작(부모부터)
		//메모리에 올라가 있어야 접근가능
		//static 메소드에서는 static인스턴스만 호출가능
		
	}

}
