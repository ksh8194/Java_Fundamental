package java_20190813;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20190812.MemberDto;

import java.sql.Connection;



public class DeptDao {
	private static DeptDao single;

	private DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}

	public boolean insert(DeptDto d) {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append(" ");
			sql.append(" ");
			sql.append(" ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, d.getNo());
			pstmt.setString(index++, d.getName());
			pstmt.setString(index++, d.getLoc());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch(SQLException e2) {
				
			}
		}
		return isSuccess;

	}

	public boolean update(DeptDto d) {
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

			} catch (SQLException e) {
				
			}
		}
		return isSuccess;

	}

	public boolean delete(int no) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append(" ");
			sql.append(" ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index, no);
			
			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();

			} catch (SQLException e) {
			

			}
		}
				
		return isSuccess;

	}
	
	public ArrayList<DeptDto> select(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
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
				int no = rs.getInt(index++);
				String name = rs.getString(index++);
				String loc = rs.getString(index);
				
				list.add(new DeptDto(no,name,loc));
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
