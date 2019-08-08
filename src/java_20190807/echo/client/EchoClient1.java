package java_20190807.echo.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient1 {
	//ip,port번호가 필요함
	
	public String ip;
	public int port;
	
	EchoClient1(String ip , int port){
		this.ip = ip;
		this.port = port;
	}
	
	public void run() {
		Socket socket = null;
		try {
			socket = new Socket(ip,port);
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("Hi");
			bw.newLine();
			bw.flush();
		}catch(UnknownHostException e){
			System.out.println("잘못된 값을 입력하였습니다.");
			
		}catch(IOException e) {
			System.out.println("프로그램이 실행되지 않았습니다.");
		}
	}
	
	public static void main(String[] args) {
		new EchoClient1("192.168.0.41",3000).run();;
	}

}
