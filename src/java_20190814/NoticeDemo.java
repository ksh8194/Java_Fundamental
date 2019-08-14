package java_20190814;

import java.util.ArrayList;


public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		
		boolean isSuccess = dao.insert(
				new NoticeDto(0,"작성자20","제목20","내용20",""));
		if(isSuccess) {
			System.out.println("공지사항이 추가 되었습니다.");
		}else {
			System.out.println("추가 오류");
		}
		
		isSuccess = dao.update(new NoticeDto(19,"작성자20-1","제목20-1","내용20-1",""));
		if(isSuccess) {
			System.out.println("공지사항이 수정 되었습니다.");
		}else {
			System.out.println("수정 오류");
		}
		
		ArrayList<NoticeDto> list = dao.select();
		
		for(NoticeDto n : list) {
			int num = n.getNum();
			String writer = n.getWriter();
			String title = n.getTitle();
			String content = n.getContent();
			String regdate = n.getRegdate();
			System.out.printf("%d , %s , %s , %s , %s%n", num, writer, title,content,regdate);
		
		}
		
		 isSuccess = dao.delete(19);
		if(isSuccess) {
			System.out.println("공지사항이 삭제 되었습니다.");
		}else {
			System.out.println("삭제 오류");
		}
	}
}
