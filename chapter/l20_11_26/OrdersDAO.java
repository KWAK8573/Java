package chapter.l20_11_26;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;
public class OrdersDAO implements IDao<OrdersVO, Long> {

    @Override
    public int insert(OrdersVO vo) throws SQLException {
        String sql = "INSERT INTO ORDERS (ORDERID,CUSTID,BOOKID,SALEPRICE,ORDERDATE) VALUES (?,?,?,?,?)";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, vo.getOrderid());
        pstmt.setLong(2,vo.getCustid());
        pstmt.setLong(3,vo.getBookid());
        pstmt.setLong(4,vo.getSaleprice());
        pstmt.setTimestamp(5,vo.getOrderdate());
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int delete(Long key) throws SQLException {
        String sql = "DELETE ORDERS WHERE ORDERID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int update(OrdersVO vo) throws SQLException {
       String sql = "UPDATE ORDERS SET CUSTID=?,BOOKID=?,SALEPRICE=?,ORDERDATE=? WHERE ORDERID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);     
        pstmt.setLong(1,vo.getCustid());
        pstmt.setLong(2,vo.getBookid());
        pstmt.setLong(3,vo.getSaleprice());
        pstmt.setTimestamp(4,vo.getOrderdate());
        pstmt.setLong(5, vo.getOrderid());
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public OrdersVO select(Long key) throws SQLException {
        String sql = "SELECT * FROM ORDERS WHERE ORDERID=?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);

        ResultSet rs = pstmt.executeQuery();
        OrdersVO vo = new OrdersVO();
        while(rs.next()){
            vo.setOrderid(rs.getLong("ORDERID"));
            vo.setCustid(rs.getLong("CUSTID"));
            vo.setBookid(rs.getLong("BOOKID"));
            vo.setSaleprice(rs.getLong("SALEPRICE"));
            vo.setOrderdate(rs.getTimestamp("ORDERDATE"));
        }
        // conn.close();
        return vo;
    }

    @Override
    public List<OrdersVO> selectAll() throws SQLException {
        String sql = "SELECT * FROM ORDERS";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<OrdersVO> data = new ArrayList<>();
            while(rs.next()) { 
            OrdersVO vo = new OrdersVO();
            vo.setOrderid(rs.getLong("ORDERID"));
            vo.setCustid(rs.getLong("CUSTID"));
            vo.setBookid(rs.getLong("BOOKID"));
            vo.setSaleprice(rs.getLong("SALEPRICE"));
            vo.setOrderdate(rs.getTimestamp("ORDERDATE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public List<OrdersVO> selectByConditions(String conditions) throws SQLException {
        String sql = "SELECT * FROM ORDERS conditions";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<OrdersVO> data = new ArrayList<>();
            while(rs.next()) { 
            OrdersVO vo = new OrdersVO();
            vo.setOrderid(rs.getLong("ORDERID"));
            vo.setCustid(rs.getLong("CUSTID"));
            vo.setBookid(rs.getLong("BOOKID"));
            vo.setSaleprice(rs.getLong("SALEPRICE"));
            vo.setOrderdate(rs.getTimestamp("ORDERDATE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public long getMaxNum() throws SQLException {
        String sql = "SELECT MAX(ORDERID) FROM ORDERS";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        long max = 0;
        while(rs.next()){
            max = rs.getLong(1);
            
        }
        return max;
    }

    @Override
    public long getMinNum() throws SQLException {
        String sql = "SELECT Min(ORDERID) FROM ORDERS";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        long min = 0;
        while(rs.next()){
            min = rs.getLong(1);
            
        }
        return min;
       
    }
    
}
