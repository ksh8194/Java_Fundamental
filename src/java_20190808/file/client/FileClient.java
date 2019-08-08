package java_20190808.file.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	private String ip;
	private int port;

	public FileClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw =null;
		InputStream in = null;
				FileOutputStream fos = null;
		try {
			//ip와 port로 서버와 접속을 시도한다.
			//3. 소켓을 생성한다.
			//4. 서버와 연결을 한다.
			socket = new Socket(ip, port);
			
			//6. 소켓을 출력스트림을 생성한 후에 서버에게 메시지를 보낸다
			out = socket.getOutputStream();
		 osw = new OutputStreamWriter(out);
			 bw = new BufferedWriter(osw);
			bw.write("mariadb.pdf");
			bw.newLine();   //줄바꿈
			bw.flush();
			
			in = socket.getInputStream();
			File f = new File("c:\\dev\\test\\network");
			f.mkdirs();
			f = new File(f,"mariadb.pdf");
			fos = new FileOutputStream(f);
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			while((readByteCount = in.read(readBytes))!= -1) {
				fos.write(readBytes,0,readByteCount);
			}
			
			
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못됐습니다.");
			
		} catch (IOException e) {
			System.out.println("서버가 죽어있어....");

		}finally {
			try {
				if(out!=null) out.close();
				if(osw != null) osw.close();
				if(bw != null) bw.close();
				if(in != null) in.close();
				if(socket!=null) socket.close();
			}catch (IOException e2) {
				
			}
		}

	}

	public static void main(String[] args) {
		new FileClient("192.168.0.47", 4000).run();;
	}

}
