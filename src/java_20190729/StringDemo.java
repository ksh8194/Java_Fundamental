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
		
		// charat 6번째 있는 문자를 반환
		char c= ssn.charAt(6);
	    System.out.println(c);
	    
	    //문자열연결할때 씀
	    ssn = ssn.concat("abcd");
	    System.out.println(ssn);
	    
	    
	    //endsWith 
	    String fileName = "abd.def.asdf.ba.b.ef.q.ef.doc";
	    
	    //endsWith(String msg) msg문자열로 끝나면 true, 그렇지 않으면 false
	    
	    
	    if(fileName.endsWith("zip")) {               // 자주씀
	    	System.out.println("압축파일 입니다");
	    }else if(fileName.endsWith("doc")) {
	    	System.out.println("워드문서입니다.");
	    }else {
	    	System.out.println("파일 입니다.");
	    }
	    
	    //equalsIgnoreCases 대소문자를 구분하지않고 문자열을비교하여 같으면 true, or FALSE
	    
	    System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
	    
	    //indexOf(String msg) : msg문자열의 위치를 반환한다.
	    //msg 문자열을 찾을때 처음부터 시작 위치는0
	    
	    
	    //lastindexof : 문자열을 찾을때 끝에서부터 찾고 index는 처음부터 시작한다.
	    int index = ssn.indexOf("-");
	    System.out.println(index);
	    
	    System.out.println(fileName.indexOf("."));
	    System.out.println(fileName.lastIndexOf("."));
	    
	    //111111-1111111
	    //substring(int first , int second)
	    //first을 포함하고,second를 포함하지않고 문자열 출력
	    //substring(int first)
	    //first(포함)
	    
	    String first = ssn.substring(0,ssn.indexOf("-")); // - 를 기준으로 왼쪽 오른쪽 나눔 . 중요
	    String second = ssn.substring(ssn.indexOf("-")+1);
	    // String first = fileName.subString(0,filename.lastIndexOf("."));
	    // String second = fileName.subString(fileName.lastIndexOf(".")+1);
	    
	    //String first = ssn.substring(0,6);
	    //String second = ssn.substring(7);
	    System.out.println(first);
	    System.out.println(second);
	    
	    String html = "안녕하세요\n저는 김성현 입니다.\n잘 부탁드립니다.";
	    //frt 문자열을 string second 문자열로 대체샇한다.
	    html = html.replaceAll("\n", "<br>");
	    System.out.println(html);
	    
	    String url =  "http://www.naver.com";
	    
	    
	    
	    
	    String path = "/new";
	    
	    if(path.startsWith("/news")){
	    	System.out.println("뉴스 페이지 입니다.");
	    }else if(path.startsWith("/sports")) {
	    	System.out.println("스포츠 페이지 입니다.");
	    }else {
	    	System.out.println("페이지가 존재하지 않습니다.");
	    }
	    
	    String m1 = "hello";
	    String m2 = "hello ";
	    
	    m1 = m1.toUpperCase();
	    System.out.println(m1);
	    
	    //String.valueOf() : primitive data type을 문자열로 변환한다.
	    int a = 10;
	    String str = String.valueOf(a);
	    char[] c1 = {'a','b','c'};
	    String str1 = String.valueOf(c1,0,2);
	    System.out.println(str1);
	    
	    //ssn: 111111-1111111
	    //split(String delimiter)
	    //문자열을 구분자(delimiter)로 토큰(token)화 시키는 메서드
	    String[] strArray = ssn.split("-");
	    System.out.println(strArray[0]);
	    System.out.println(strArray[1]);
	    
	    
	    String str2 = String.format("%,.2f", 1234.13241);
	    
	    System.out.println(str2);
	}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	
	}


