package chapter.l20_12_02;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import chapter.l20_11_23.ConnectionFactory;
import chapter.l20_11_26.BookDAO;
import chapter.l20_11_26.BookVO;

public class BookBatchService {
    public int[] batchBookInsert(List<BookVO> data) throws SQLException{
        int[] res;
        Connection conn = ConnectionFactory.create();
        Statement stmt = conn.createStatement();
        // 향상된 for 문
        for(BookVO x:data){
            String insertsql = "INSERT INTO BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE)" + "VALUES(" +x.getBookid()+",\'"+x.getBookname(),x.getPublisher()+"\',\'"+x.getPrice()+")";
            stmt.addBatch(insertsql);
            
        }
        res = stmt.executeBatch();
        conn.close();
        return res;
    }
    public static void main(String[] args) {
        BookBatchService service = new BookBatchService();
        List<BookVO> data = new ArrayList<>();
        BookVO[] voes = new BookVO[]{
            new BookVO(12,"어플리케이션개발","비젼출판사",45000),
            new BookVO(13,"인공지능","비젼출판사",35000),
            new BookVO(14,"머신러닝","비젼출판사",55000),
            new BookVO(15,"하둡가이드","한빛미디어",55000),
            new BookVO(16,"오라클JDBC","주원출판사",37000)

        };
        // 배열정보 리스트로담음
        for(BookVO x:voes){
            data.add(x);
        }
        try{
        int[] res = service.batchBookInsert(data);
        System.out.println("배열처리결과:"+Arrays.toString(res));
        BookDAO dao = new BookDAO();
        List<BookVO> list = dao.selectAll();
        for(BookVO x: list){
            System.out.println(x);
        }

        }catch(SQLException e){

        }
        
    }
    
}
