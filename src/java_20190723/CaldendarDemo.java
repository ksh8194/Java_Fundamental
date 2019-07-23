package java_20190723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaldendarDemo {
	public static String console() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		Calendar c = new Calendar();
		
		while(true) {
		System.out.print("날짜를 입력하세요> ");
		String readLine = console();
		if(readLine.contentEquals("exit")) break;
		
		//split 메서드는 공백으로 문자열을 분리시켜 배열로 반환한다.
		String[] data = readLine.split(" ");
		int dataLength = data.length;
		if(dataLength==1) {
			//String syear = data[0];
			//문자열을 int로 변환하는 메서드;
			int year = Integer.parseInt(data[0]);
			//System.out.printf("입력한 값 : %d\n",year);
			c.print(year);
		}else if(dataLength ==2) {
			//String syear = data[0];
			int year = Integer.parseInt(data[0]);
			//String smonth = data[1];
			int month = Integer.parseInt(data[1]);
			c.print(year,month);
		}else if(dataLength == 3) {
			//String syear = data[0];
			int year = Integer.parseInt(data[0]);
			//String smonth = data[1];
			int month = Integer.parseInt(data[1]);		
			//String sday = data[2];
			int day = Integer.parseInt(data[2]);
			//System.out.printf("입력한 값 : %d %d %d \n",year,month,day);
			c.print(year,month,day);
		}else {
			
		}
		//System.out.printf("입력한값 : %s%n", readLine);
	}
}

}
