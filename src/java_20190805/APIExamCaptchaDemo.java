package java_20190805;

import java.util.Calendar;
import java.util.Scanner;

import bonus.Utility;




public class APIExamCaptchaDemo {
	public static String console(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
public static void main(String args[]) {
	String id = "3oApolm_Kr1gOHN1vnaB";
	String secret = "T252MYtVmk";
	String key = Utility.getCaptchaKey(id, secret);
	boolean isSuccess = Utility.isCaptchaImage(id,secret,key);
			
	if(isSuccess){
		String value = console("이미지결과값을 입력하세요");
		String result = Utility.getCaptchaResult(id, secret, key,value);
		
	
		
	}else{
		System.out.println("다시 확인");
	} 
	

}
}


