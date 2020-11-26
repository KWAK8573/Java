package chapter.l20_11_26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chapter.l20_11_23.ConnectionFactory;

public class BookDAO implements IDao<BookVO, Long> {
    @Override
    public int insert(BookVO vo) throws SQLException {
        String sql = "INSERT INTO book (bookid,bookname,PUBLISHER,PRICE) VALUES (?,?,?,?)";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, vo.getBookid());
        pstmt.setString(2,vo.getBookname());
        pstmt.setString(3,vo.getPublisher());
        pstmt.setLong(4,vo.getPrice());
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int delete(Long key) throws SQLException {
        String sql = "DELETE book WHERE BOOKID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int update(BookVO vo) throws SQLException {
        String sql = "UPDATE book SET BOOKNAME=?,PUBLISHER=?,PRICE=? WHERE BOOKID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,vo.getBookname());
        pstmt.setString(2,vo.getPublisher());
        pstmt.setLong(3,vo.getPrice());
        pstmt.setLong(4, vo.getBookid());
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public BookVO select(Long key) throws SQLException {
        String sql = "SELECT * FROM BOOK WHERE BOOKID=?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, key);

        ResultSet rs = pstmt.executeQuery();
        BookVO vo = new BookVO();
        while(rs.next()){
            vo.setBookid(rs.getLong("BOOKId"));
            vo.setBookname(rs.getString("BOOKNAME"));
            vo.setPublisher(rs.getString("PUBLISHER"));
            vo.setPrice(rs.getInt("PRICE"));
        }
        // conn.close();
        return vo;
    }

    @Override
    public List<BookVO> selectAll() throws SQLException {
        String sql = "SELECT * FROM BOOK";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<BookVO> data = new ArrayList<>();
            while(rs.next()) { 
            BookVO vo = new BookVO();
            vo.setBookid(rs.getLong("BOOKId"));
            vo.setBookname(rs.getString("BOOKNAME"));
            vo.setPublisher(rs.getString("PUBLISHER"));
            vo.setPrice(rs.getInt("PRICE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public List<BookVO> selectByConditions(String conditions) throws SQLException {
        String sql = "SELECT * FROM BOOK conditions";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<BookVO> data = new ArrayList<>();
            while(rs.next()) { 
            BookVO vo = new BookVO();
            vo.setBookid(rs.getLong("BOOKId"));
            vo.setBookname(rs.getString("BOOKNAME"));
            vo.setPublisher(rs.getString("PUBLISHER"));
            vo.setPrice(rs.getInt("PRICE"));
            data.add(vo);
        }
        // conn.close();
        return data;
    }

    @Override
    public long getMaxNum() throws SQLException {
        String sql = "SELECT MAX(BOOKID) FROM BOOK";
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
        String sql = "SELECT Min(BOOKID) FROM BOOK";
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
