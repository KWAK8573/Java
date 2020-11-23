package chapter.l20_11_23;
// 1~2단계를 거쳐 만들어지는 커넥션 객체를

// 리턴시켜주는 커넥션 공장

import java.sql.*;

public class ConnectionFactory {
    // 외부에서 접근 못하고, 한개만 만든다.
    private static Connection conn = null;
    // synchronized - 쓰레드가 다중 동시 접근시 순서 세우기 작업 (동기화)
    public synchronized static Connection create() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "MADANG";
        String password = "madang";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
       
            e.printStackTrace();
        }
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public synchronized static void close() {
        try {
            // 닫을 수 있는 조건 - conn객체가 있어야 하고 닫겨있지 않아야 한다
            if(conn != null && !conn.isClosed())
            conn.close();
        } catch (SQLException e) {
 
            e.printStackTrace();
        }
    }
}
