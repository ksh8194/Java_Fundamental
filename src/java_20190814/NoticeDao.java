package java_20190814;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDao {
	//1.singlton
	//1-1 static 변수로 self 자료형 변수를 선언하고 접근 한정자는 private으로
	private static  NoticeDao single;
	//1-2 디폴트 생성자의 접근한정자는 private으로 선언
	//외부에서 객체 생성을 못하게 하기 위해서
	private NoticeDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//1-3 객체생성할 수 있는 getInstance() 메서드를 static 메서드로 선언한다.
	//이때 single 변수의 null 체크를 하여 null인 경우에만 객체를 생성한다.
	//이렇게 함으로써 다중 클라이언트가 접근하더라도 한개의 객체를 공유해서 사용할 수 있다
	public static NoticeDao getInstance() {
		if(single == null) {
			//객체를 생성할 수 있는 이유는 생성자의 접근 한정자가 private이기때문에
			//클래스내에서만 객체를 생성할 수 있다.
			single = new NoticeDao();
		}
		return single;
	}
	
	public boolean insert(NoticeDto n) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic2", "kic13", "kic13");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO notice(writer, title,content,regdate)");
			sql.append("VALUES(?,?,?,NOW())");

			pstmt = con.prepareStatement(sql.toString());
			//바인딩 변수가 있으면 아래에 코딩
			pstmt.setString(index++,n.getWriter());
			pstmt.setString(index++,n.getTitle());
			pstmt.setString(index++,n.getContent());

			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	public boolean update(NoticeDto n) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic2", "kic13", "kic13");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE notice ");
			sql.append("SET writer = ?, title=?, content = ?, regdate = NOW() ");
			sql.append("WHERE num = ?");

			pstmt = con.prepareStatement(sql.toString());
			//바인딩 변수가 있으면 아래에 코딩
			pstmt.setString(index++, n.getWriter());
			pstmt.setString(index++, n.getTitle());
			pstmt.setString(index++, n.getContent());
			pstmt.setInt(index++,n.getNum());

			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	public boolean delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic2", "kic13", "kic13");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM notice ");
			sql.append("WHERE num = ?");

			pstmt = con.prepareStatement(sql.toString());
			//바인딩 변수가 있으면 아래에 코딩
			pstmt.setInt(index++,num);

			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	public ArrayList<NoticeDto> select(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<NoticeDto> list = new ArrayList<NoticeDto>();
		int index = 1;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic2", "kic13", "kic13");

			StringBuffer sql = new StringBuffer();
			sql.append("select num,writer,title,content,date_format(regdate,'%Y-%m-%d') ");
			sql.append("from notice ");
			sql.append("ORDER BY regdate DESC");

			pstmt = con.prepareStatement(sql.toString());
			//바인딩 변수가 있다면 코딩
			//pstmt.setString(index++,);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String writer = rs.getString(index++);
				String title = rs.getString(index++);
				String content = rs.getString(index++);
				String regdate = rs.getString(index);
				list.add(new NoticeDto(num, writer, title, content, regdate));
			}

		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

		return list;
	}
	
	
	
	
	
	
	
	
	
	
}