package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Dao(Data Access Object)
public class MemberDao {
	
	//1.singleton 코딩
	private static MemberDao single;
	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static MemberDao getInstance() {
		if(single == null) {
			single = new MemberDao();
		}
		return single;
	}
	//Dto : Data Transfer Object
	public boolean insert(MemberDto m){
	
		//외우기
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/kic",
					"kic12",
					"kic12");
			//바인딩 변수(?)는 반드시 컬럼 값에만 설정할 수 있다
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE MEMBER ");
			sql.append("SET NAME = ? , ADDR = ? ");
			sql.append("WHERE NUM = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, m.getNum());
			pstmt.setString(index++, m.getName());
			pstmt.setString(index++, m.getAddr());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		return isSuccess;
		
	}
	public boolean update(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();

			} catch (SQLException e2) {
				

			}
		}
		return isSuccess;
	}
	
	//외울것
	public boolean delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index, num);
			
			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();

			} catch (SQLException e2) {
				

			}
		}
		return isSuccess;
	}
	
	public ArrayList<MemberDto> select(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		int index = 1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num,name,addr ");
			sql.append("FROM member ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index);
				list.add(new MemberDto(num,name,addr));
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(con !=null) con.close();

			} catch (SQLException e2) {
				

			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
}
