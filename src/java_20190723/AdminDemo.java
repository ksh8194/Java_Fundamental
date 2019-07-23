package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("ksh8194","1234","story3388@naver.com",1);
		
		
		
		
		/*a.setId("ksh8194");
		a.setPwd("1234");
		a.setEmail("story3388@naver.com");
		a.setLevel(1); */
		
		//private 값 가져오기위해 getter 메소드 이용
		System.out.printf("%s %s %d %s",a.getId(),a.getEmail(),a.getLevel(),a.getPwd());
	}

}
