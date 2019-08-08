package java_20190808.file.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	private int port;
	public FileServer(int port) {
		this.port = port;
	}
	
	public void run() {
		ServerSocket serversocket = null;
		try {
		serversocket = new ServerSocket(port);
		
		}catch(IOException e) {
		e.printStackTrace();
		}
		
		FileServerThread fst = null;
		while(true) {
			System.out.println("클라이언트 접속을 기다리고 있습니다.");
			try {
			Socket socket = serversocket.accept();
			String ip = socket.getInetAddress().getHostAddress();
			System.out.println("클라이언트 접속 [ip : "+ip+"]");
			
			fst = new FileServerThread(socket);
			Thread t = new Thread(fst);
			t.start();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) {
		new FileServer(4000).run();
	}
}
