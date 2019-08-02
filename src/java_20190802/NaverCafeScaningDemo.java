package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverCafeScaningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false");
		InputStream is = url.openStream();
		
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		fw = new FileWriter("c:\\dev\\test\\navercafe.html");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			pw.println(readLine);
		}
		//1. InputStream을 InputStreamReader로 바꾼다.
		//2. InputStreamReader를 BufferedReader로 바꾼다 (stream chaining)
		//3. BufferedReader로 읽은 정보를
		// c:\\dev\\test\\navercafe.html 파일 저장한다.
	}
	
	

}
