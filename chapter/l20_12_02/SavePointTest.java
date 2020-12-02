package chapter.l20_12_02;
// SavePoint - 저장점

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import chapter.l20_11_23.ConnectionFactory;

public class SavePointTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectionFactory.create();
        PreparedStatement sPstmt = null; // select 질의용
        PreparedStatement uPstmt = null; // update 질의용
        ResultSet rs = null;
        String sSql = null;
        String uSql = null;

    try{
        conn.setAutoCommit(false); // 트랜잭션기능 활용(롤백기점)
        sSql = "SELECT ID,TOTAL FROM SAVEPOINT WHERE TOTAL>?";
        uSql = "UPDATE SAVEPOINT SET TOTAL = ? WHERE ID = ?";
        sPstmt = conn.prepareStatement(sSql);
        uPstmt = conn.prepareStatement(uSql);
        sPstmt.setInt(1, 100);
        rs = sPstmt.executeQuery();


        // 제1 저장점 설정
        Savepoint point1 = conn.setSavepoint();
        while(rs.next()){
            String id = rs.getString("ID");
            int oldTotal = rs.getInt("TOTAL");
            int newTotal = oldTotal*2;
            uPstmt.setInt(1, newTotal);
            uPstmt.setString(2, id);
            uPstmt.executeUpdate(); // 실제 업데이트 안됨
            System.out.println("새 total");
            if(newTotal>=5000){
                conn.rollback(point1);
            }
        }
        System.out.println();
        conn.commit(); // 커밋이 일어난다.

        //---------------------------------------------
        String sql = "SELECT ID,TOTAL FROM SAVEPOINT";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while(rs.next()){
            String id = rs.getString("ID");
            int total = rs.getInt("TOTAL");
            System.out.printf("ID: %s total: %d \n",id,total);
        }
    } catch(SQLException e){
    }
    finally{
        rs.close();
        sPstmt.close();
        uPstmt.close();
        conn.close();
    }
    } 
}
