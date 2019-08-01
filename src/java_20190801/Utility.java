package java_20190801;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	//pattern => "yyyy-MM월-dd-일 a hh:mm:ss E요일"
	//yyyy : 년도 , MM : 월 , dd 일 , a : 오전or오후,
	//hh : 시, mm : 분, ss : 초 , E : 요일
	public static String getDate(Calendar c, String pattern) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	//Utility.getXXX("yyyy",c);
	public static boolean mkdirs(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		boolean isExisted = file.isDirectory();
		if(!isExisted) {
			isSuccess = file.mkdirs();
		}
		return isSuccess;
	}
	public String getComma(long name) {
		return String.format("%,d", name);
	}
	public String getComma(double name,int precision) {
		return String.format("%,."+precision+"f", name);
	}

	public boolean changeFile(String path) {
		boolean isSuccess = false;
		File oldFile = new File(path);
		//f1.getPath() => 전체경로 + 파일이름
		String fileName = oldFile.getName(); // 전체 경로중에 파일이름만 반환
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extensionWithDot = fileName.substring(fileName.lastIndexOf("."));
		//마음에 안들면 아래부분을 수정하세요..
		name = String.valueOf(System.currentTimeMillis());
		fileName = name+extensionWithDot;
		
		//f1의 다른 디렉토리를 반환 => c:\dev\test
		String parent = oldFile.getParent();
		File newFile = new File(parent, fileName);
		isSuccess = oldFile.renameTo(newFile);
		
		return isSuccess;
	}

}
