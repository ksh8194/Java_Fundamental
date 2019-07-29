package java_20190729;



public interface InterA extends InterB, InterC {
	//인터페이스의 변수 public static final이 생략되어 있음.
	//생략 public static final//
	double PI = 3.14;
	//인터페이스의 접근한정자를 붙이지 않으면 public이 생략되어 있음
	//public abstract 생략 가능하긴한데 다 씀
	public abstract void mA();

}
