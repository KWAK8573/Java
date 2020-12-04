package chapter.l20_12_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import chapter.l20_11_23.ConnectionFactory;

public class BatchTest {
    // Batch - 묶음처리(마감처리), 온라인(실시간)반대개념
    public static int createrTable() throws SQLException {
        String sql = "CREATE TABLE BATCHTEST(ID VARCHAR2(20) PRIMARY KEY PASSWORD VARCHAR2(20)";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int res = pstmt.executeUpdate();
        return res;
      
    }
    public static int[] batchTest() throws SQLException {
        int[] res;
        Connection conn = ConnectionFactory.create();
        Statement stmt = conn.createStatement();
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('HGD','1234')");
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('KSA','1235')");
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('BHD','1236')");
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('TRG','1237')");
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('RPG','1238')");
        res = stmt.executeBatch();
        conn.close();
        return res;
    }
    public static void selectAll() throws SQLException {
        String sql = "SELECT *FROM BATCHTEST";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println("ID:"+rs.getString(1)+"\t PWD:"+rs.getString(2));
        }
        conn.close();
    }
    public static void main(String[] args){
       
    //     try {
    //        int res = createrTable();       
    //         System.out.println("BATCHTEST 테이블을만듬");
    //     } catch (SQLException e) {
    //     System.out.println("BATCHTEST 테이블을 만들지않음");
    // }
    // try {
    //     int[] res2 = batchTest();
    //     System.out.println("배치처리하였습니다.");
    // } catch (SQLException e) {
    //     System.out.println("배치처리못함.");
    // }
    try {
        selectAll();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
