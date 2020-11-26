package chapter.l20_11_26;


import java.sql.*;
import java.util.*;

public class CustomerDAO implements IDao<CustomerVO, Long> {

    @Override
    public int insert(CustomerVO vo) throws SQLException {
            String sql = "INSERT INTO CUSTOMER (CUSTID,NAME,ADDRESS,PHONE) VALUES (?,?,?,?)";
            Connection conn = ConnectionFactory.create();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, vo.getCustid());
            pstmt.setString(2,vo.getName());
            pstmt.setString(3,vo.getAddress());
            pstmt.setString(4,vo.getPhone());
            int res = pstmt.executeUpdate();
            conn.close();
            return res;
        }

    @Override
    public int delete(Long key) throws SQLException {
        String sql = "DELETE CUSTOMER WHERE CUSTID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int update(CustomerVO vo) throws SQLException {
        String sql = "UPDATE CUSTOMER SET NAME=?,ADDRESS=?,PHONE=? WHERE CUSTID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,vo.getName());
        pstmt.setString(2,vo.getAddress());
        pstmt.setString(3,vo.getPhone());
        pstmt.setLong(4, vo.getCustid());
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public CustomerVO select(Long key) throws SQLException {
            String sql = "SELECT * FROM CUSTOMER WHERE CUSID=?";
            Connection conn = ConnectionFactory.create();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, key);
    
            ResultSet rs = pstmt.executeQuery();
            CustomerVO vo = new CustomerVO();
            while(rs.next()){
                vo.setCustid(rs.getLong("CUSTID"));
                vo.setName(rs.getString("NAME"));
                vo.setAddress(rs.getString("ADDRESS"));
                vo.setPhone(rs.getString("PHONE"));
            }
            // conn.close();
            return vo;
        }
    @Override
    public List<CustomerVO> selectAll() throws SQLException {
        String sql = "SELECT * FROM CUSTOMER";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<CustomerVO> data = new ArrayList<>();
            while(rs.next()) { 
            CustomerVO vo = new CustomerVO();
            vo.setCustid(rs.getLong("CUSTID"));
            vo.setName(rs.getString("NAME"));
            vo.setAddress(rs.getString("ADDRESS"));
            vo.setPhone(rs.getString("PHONE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public List<CustomerVO> selectByConditions(String conditions) throws SQLException {
        String sql = "SELECT * FROM CUSTOMER conditions";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<CustomerVO> data = new ArrayList<>();
            while(rs.next()) { 
            CustomerVO vo = new CustomerVO();
            vo.setCustid(rs.getLong("CUSTID"));
            vo.setName(rs.getString("NAME"));
            vo.setAddress(rs.getString("ADDRESS"));
            vo.setPhone(rs.getString("PHONE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public long getMaxNum() throws SQLException {
            String sql = "SELECT MAX(CUSTID) FROM CUSTOMER";
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
        String sql = "SELECT MIN(CUSTID) FROM CUSTOMER";
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
