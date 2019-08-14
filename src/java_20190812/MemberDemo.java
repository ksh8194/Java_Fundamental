package java_20190812;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = MemberDao.getInstance();
		/*MemberDto m1 = new MemberDto(20,"트럼프1","미국1");
		boolean isSuccess = mdao.insert(m1);
		if(isSuccess) {
			System.out.println("넣기 성공");
		}else {
			System.out.println("넣기 실패");
		}
		
		m1 = new MemberDto(21,"트럼프2","미국2");
		isSuccess = mdao.update(m1);
		if(isSuccess) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
		isSuccess = mdao.delete(20);
		if(isSuccess) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		} */
		
		ArrayList<MemberDto> list = mdao.select();
		
		for(MemberDto m : list) {
			System.out.printf("%d\t%s\t%s%n",m.getNum(),m.getName(),m.getAddr());
		}
	}
}
