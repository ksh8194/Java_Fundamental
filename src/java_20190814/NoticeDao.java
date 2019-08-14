package java_20190814;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDao {
	private static NoticeDao single;
	
	private NoticeDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static NoticeDao getInstance() {
		if(single==null) {
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
		con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
		StringBuffer sql = new StringBuffer();
		sql.append("insert into notice(writer,title,content,regdate) ");
		sql.append("values(?,?,?,now()) ");
		
		
		pstmt = con.prepareStatement(sql.toString());
		
		//pstmt.setInt(index++,n.getNum());
		pstmt.setString(index++, n.getWriter());
		pstmt.setString(index++, n.getTitle());
		pstmt.setString(index++, n.getContent());
		//pstmt.setString(index++, n.getRegdate());
		
		pstmt.executeUpdate();
		isSuccess = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e2) {
				
			}
		}
		
		return isSuccess;
	}
	
	public boolean update(NoticeDto n) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("update member ");
			sql.append("set addr = ? , name = ? ");
			sql.append("where num = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//pstmt.setInt(index++,n.getNum());
			pstmt.setString(index++, n.getWriter());
			pstmt.setString(index++, n.getTitle());
			pstmt.setString(index++, n.getContent());
			//pstmt.setString(index++, n.getRegdate());
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				
			}
		}
		return isSuccess;
	}
	
	public boolean delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		boolean isSuccess = false;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append(" ");
			sql.append(" ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index, num);
			
			pstmt.executeUpdate();
			isSuccess = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				
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
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append("from notice ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String writer = rs.getString(index++);
				String title = rs.getString(index++);
				String content = rs.getString(index++);
				String regdate = rs.getString(index);
				
				list.add(new NoticeDto(num,writer,title,content,regdate));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt !=null)pstmt.close();
				if(con!=null)con.close();
			}catch(SQLException e2) {
				
			}
		}
		return list;
	}
		
	}
