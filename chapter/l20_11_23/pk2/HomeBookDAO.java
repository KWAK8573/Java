package chapter.l20_11_23.pk2;


import java.sql.*;
import java.util.*;

import chapter.l20_11_23.ConnectionFactory;
import chapter.l20_11_23.HomeBook;


public class HomeBookDAO implements IDao<HomeBook,Long>{

	@Override
	public int insert(HomeBook vo) throws SQLException {
		String sql = "insert into homebook (SERIALNO,DAY,SECTION,ACCOUNTTITLE,REMARK,REVENUE,EXPENSE)"
				+ " values(HomeBook_SEQ.NEXTVAL,?,?,?,?,?,?)";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setTimestamp(1,vo.getDay());
		pstmt.setString(2,vo.getSection());
		pstmt.setString(3,vo.getAccounttitle());
		pstmt.setString(4,vo.getRemark());
		pstmt.setLong(5,vo.getRevenue());
		pstmt.setLong(6,vo.getExpense());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
	}

	@Override
	public int delete(Long key) throws SQLException {
		String sql = "DELETE FROM HOMEBOOK " + " WHERE SERIALNO = ?";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, key);
		int res =  pstmt.executeUpdate();
		conn.close();

		return res;
	}

	@Override
	public int update(HomeBook vo) throws SQLException {
		// DAY,SECTION,ACCOUNTTITLE,REMARK,REVENUE,EXPENSE
		String sql = "UPDATE HomeBook SET " + "DAY=?, SECTION = ?, ACCOUNTTITLE =?, REMARK = ?, REVENUE = ?, EXPENSE = ?" + "WHERE SERIALNO = ?";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setTimestamp(1, vo.getDay());
		pstmt.setString(2,vo.getSection());
		pstmt.setString(3,vo.getAccounttitle());
		pstmt.setString(4,vo.getRemark());
		pstmt.setLong(5,vo.getRevenue());
		pstmt.setLong(6,vo.getExpense());
		pstmt.setLong(7,vo.getSerialno());
		int res = pstmt.executeUpdate();
		conn.close();
		return res;
		
	}

	@Override
	public HomeBookDAO select(Long key) throws SQLException {
		String sql = "SELECT * FROM HOMEBOOK WHERE SERIALNO = ?";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, key);
		ResultSet rs = pstmt.executeQuery();
		HomeBook vo = new HomeBook();
		while(rs.next()){
			vo.setSerialno(rs.getLong(1));
			vo.setDay(rs.getTimestamp(2));
			vo.setSection(rs.getString(3));
			vo.setAccounttitle(rs.getString(4));
			vo.setRemark(rs.getString(5));
			vo.setRevenue(rs.getLong(6));
			vo.setExpense(rs.getLong(7));

		}
		return vo;
	}

	@Override
	public List<HomeBook> selectAll() throws SQLException {
		String sql = "SELECT * FROM HOMEBOOK";
		Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<HomeBook> data = new ArrayList<>();
		while(rs.next()){
			HomeBook vo = new HomeBook();
			vo.setSerialno(rs.getLong(1));
			vo.setDay(rs.getTimestamp(2));
			vo.setSection(rs.getString(3));
			vo.setAccounttitle(rs.getString(4));
			vo.setRemark(rs.getString(5));
			vo.setRevenue(rs.getLong(6));
			vo.setExpense(rs.getLong(7));
			data.add(vo);
		return data;
	}
	}
}

