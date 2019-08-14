package java_20190814;

import java.util.ArrayList;



public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		
		boolean isSuccess = dao.insert(new NoticeDto(0,"Deve","강남역","ㅋㅇㄹ"," "));
		if(isSuccess) {
			System.out.println("부서가 추가 되었습니다.");
		}else {
			System.out.println("오류");
		}
		
		/*isSuccess = dao.update(new NoticeDto(0,"개발부","서초역","ㅁㄴㅇㄹ","ㅁㄴㅇㄹ"));
		if(isSuccess) {
			System.out.println("부서가 수정 되었습니다.");
		}else {
			System.out.println("수정오류");
		}
		*/
		ArrayList<NoticeDto> list = dao.select();
		
		for(NoticeDto n : list) {
			int num = n.getNum();
			String writer =n.getWriter();
			String title = n.getTitle();
			String content = n.getContent();
			String regdate = n.getRegdate();
			System.out.printf("%d, %s,%s,%s,%s%n ",num,writer,title,content,regdate);
		}
		
		/*isSuccess = dao.delete(50);
		if(isSuccess) {
			System.out.println("부서가 삭제되었습니다.");
		}else {
			System.out.println("삭제 오류");
		} */
	}

}
