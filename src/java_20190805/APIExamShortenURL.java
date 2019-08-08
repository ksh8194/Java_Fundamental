package java_20190805;

import bonus.Utility;

public class APIExamShortenURL {
	 public static void main(String[] args) {
	       
	 String clientId = "yZk0oJ_JPXfAc0EnIV2f";//애플리케이션 클라이언트 아이디값";
     String clientSecret = "knl71NW86b";//애플리케이션 클라이언트 시크릿값";
     String oriUrl = "https://docs.google.com/spreadsheets/d/1AEbbhYgDMouucbzE4OOxLUXoYLMr2nNyWqE4wq3rTeU/edit#gid=1520357372";
     String url = Utility.getShortenURL(clientId, clientSecret, oriUrl);
    // System.out.println(url);
     if(Utility.isQRCode(url, 300,300)) {
    	 System.out.println("QR 코드 이미지 생성");
     }else {
    	 System.out.println("QR 코드 이미지 실패");
     }
	 }
}



