package chapter.l20_12_02;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import chapter.l20_11_23.ConnectionFactory;

public class TransactionTest {
    // Transaction - insert와 주로 관련
    // 여러개의 작업단위가 (예, 여러개의 테이블에 데이타를 동시처리하는경우)
    // commit, rollback 하는 하나의 db 거래 단위
    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectionFactory.create();
        Statement stmt = conn.createStatement();
        boolean ok = false;
        int[] res = null;

        try{
        conn.setAutoCommit(false); // 트랜잭션의 롤백 기점
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('PHGS,'1212')");
        stmt.addBatch("INSERT INTO BATCHTEST VALUES('PHGS,'1212'"); //문제발생
        res = stmt.executeBatch();
        ok = true;
        } catch(SQLException e){

        } finally{
            if(ok){
                conn.commit();
                System.out.println("커밋되었습니다.");
            }else{
                conn.rollback();
                System.out.println("롤백되었습니다.");
            }
            conn.close();
        }
    }
}
