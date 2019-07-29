package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String ssn = "111111-1111111";
		char c= ssn.charAt(6);
	    System.out.println(c);
	    
	    ssn = ssn.concat("abcd");
	    System.out.println(ssn);
	    
	    String fileName = "abd.def.asdf.ba.b.ef.q.ef.doc";
	    if(fileName.endsWith("zip")) {               // 자주씀
	    	System.out.println("압축파일 입니다");
	    }else if(fileName.endsWith("doc")) {
	    	System.out.println("워드문서입니다.");
	    }else {
	    	System.out.println("파일 입니다.");
	    }
	    
	    System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
	    
	    
	    
	    int index = ssn.indexOf("-");
	    System.out.println(index);
	    
	    System.out.println(fileName.indexOf("."));
	    System.out.println(fileName.lastIndexOf("."));
	    
	    //111111-1111111
	    
	    String first = ssn.substring(0,ssn.indexOf("-")); // - 를 기준으로 왼쪽 오른쪽 나눔 . 중요
	    String second = ssn.substring(ssn.indexOf("-")+1);
	    // String first = fileName.subString(0,filename.lastIndexOf("."));
	    // String second = fileName.subString(fileName.lastIndexOf(".")+1);
	    
	    //String first = ssn.substring(0,6);
	    //String second = ssn.substring(7);
	    System.out.println(first);
	    System.out.println(second);
	    
	}

}
