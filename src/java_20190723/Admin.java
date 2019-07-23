package java_20190723;

public class Admin {
	//인스턴스변수는 습관적으로 Private 붙여야됨 외부에서 접근금지하게
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//기본 생성자(default constructor) = > alt + shift + s 누르고 c 누르면 빠르게 생성가능
	//기본생성자에는 super가 숨겨져 있다. 부모의 default 생성자를 호출해주는것
	public Admin() {
		super(); // 부모클래스의 디폴트 생성자를 호출
		
	}
	
	
	
	//생성자(constructor)
	//생성자는 반환값이 없고, 이름은 클래스 이름과 동일하게
	//역할은 인스턴스 변수 초기화(값을 처음으로 할당)
	public Admin(String id ,String pwd ,String email, int Level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = Level;
		
		
	}
	
	//생성자 오버로딩
	public Admin(String id ,String pwd ,String email) {
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		this(id,pwd,email,0); //다른 생성자 호출 , 생성자에서만 사용가능
		//this 용법 2가지
		//1. 자기자신 객체 this.
		//2. 다른 생성자 호출 this();
		
		
	}
	
	//instance 변수의 setter , getter 생성 방법
	//private값을 다른 클래스에서 사용하게 하기 위해 메소드를 만듦.
	//alt+shift+s 누르고 r tab enter tab4 enter 
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	
	
	

}
