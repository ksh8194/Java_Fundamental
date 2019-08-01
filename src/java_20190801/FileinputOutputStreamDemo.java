package java_20190801;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:\\dev\\test\\jdk.exe");
			File f1 = new File("c:\\dev\\test\\2019\\8\\1");
			boolean isExisted = f1.isDirectory();
			if(!isExisted) {
				f1.mkdirs();
			}
			//FileOutputStream(String path) 생성자에서 FileNotFoundException 에러의 의미는 경로가 없기 때문에 발생하는 것임.
			//따라서 FileOutputStream 객체를 생성할 때는 경로가 있는지 체크한 후에 객체를 생성해야 한다.
			fos = new FileOutputStream("c:\\dev\\test\\2019\\8\\1\\jdk.exe"); //해당 경로가 없으면 에러. 경로가 있고 최종경로에 파일이 없으면 에러는 안남
			int readByte = 0;
			//fis.read() 메서드는 한 바이트 읽어 변환한다.
			//만약 더 이상 읽을 바이트가 없으면 -1을 반환한다.
			while((readByte = fis.read())!=-1) { // -1 더이상 읽을게 없다
				fos.write(readByte);
			}
			
			
			System.out.println("성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
					
		}
		
		
		
	}

	
	
	

}
