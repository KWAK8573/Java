package chapter.l20_11_24;

import java.sql.*;
import java.util.*;

// import MyMember2;
// import ConnectionFactory;


public class MyMemberDAO implements IDao<MyMember2, Long> {

    @Override
    public int insert(MyMember2 vo) throws SQLException {
       String sql = "insert IGNORE into mymember2 (MYNO,ID,DAY,PASSWORD,PHONE,ISWITHREW)" + " values(MYMEMBER2_SEQ.NEXTVAL,?,?,?,?,?)";
       Connection conn = ConnectionFactory.create();
       PreparedStatement psmt = conn.prepareStatement(sql);
       psmt.setString(1, vo.getId());
       psmt.setTimestamp(2, vo.getDay());
       psmt.setString(3, vo.getPassword());
       psmt.setString(4, vo.getPhone());
       psmt.setLong(5, vo.getIswithrew());
       int x = psmt.executeUpdate();
       conn.close();
        return x;
    }

    @Override
    public int delete(Long key) throws SQLException {
        String sql = "DELETE FROM MYMEMBER2 " + "WHERE MYNO =?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setLong(1, key);
        int y = psmt.executeUpdate();
        conn.close();
        return y;
    }

    @Override
    public int update(MyMember2 vo) throws SQLException {
        String sql = "UPDATE MYMEMBER2 SET" + "ID=?, DAY=?, PASSWORD=?, PHONE=?, ISWITHREW=? " + " WHERE MYNO = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getId());
        pstmt.setTimestamp(2, vo.getDay());
        pstmt.setString(3, vo.getPassword());
        pstmt.setString(4, vo.getPhone());
        pstmt.setLong(5, vo.getIswithrew());
        pstmt.setLong(6, vo.getMyno());
        int z = pstmt.executeUpdate();
        conn.close();
        return z;
    }

    @Override
    public MyMember2 select(Long key) throws SQLException {
        String sql = "SELRCT * FROM MYMEMBER WHERE MYNO =? ";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);
        ResultSet rs = pstmt.executeQuery();
        MyMember2 vo = new MyMember2();
        while(rs.next()){
            vo.setMyno(rs.getLong(1));
            vo.setId(rs.getString(2));
            vo.setDay(rs.getTimestamp(3));
            vo.setPassword(rs.getString(4));
            vo.setPhone(rs.getString(5));
            vo.setIswithrew(rs.getLong(6));
        }
        return vo;
    }

    @Override
    public List<MyMember2> selectAll() throws SQLException {
        String sql = "SELECT * FROM MYMEMBER2";
        Connection conn = ConnectionFactory.create();
		PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<MyMember2> data = new ArrayList<>();
        while(rs.next()){
            MyMember2 vo = new MyMember2();
            vo.setMyno(rs.getLong(1));
            vo.setId(rs.getString(2));
            vo.setDay(rs.getTimestamp(3));
            vo.setPassword(rs.getString(4));
            vo.setPhone(rs.getString(5));
            vo.setIswithrew(rs.getLong(6));
            data.add(vo);
        }
        return data;
    }
}
