package java_20190807.echo.server;

import java.io.IOException;
import java.net.ServerSocket;

public class EchoServer1 {
	//port번호
	
	private int port;
	
	EchoServer1(int port){
		this.port = port;
	}
	
	public void run() {
	
		try {
			ServerSocket serversocket = new ServerSocket(port);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
		}
		
	}
	

	
	
	
}
