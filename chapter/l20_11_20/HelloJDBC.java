package chapter.l20_11_20;

import java.sql.*;

public class HelloJDBC {
  //JDBC = Java DataBase Connectivity (자바와 DB연결 기술)
    // JDBC 4단계
    // 1단계 - 드라이버점검(각 DBMS마다 틀림)단계, 로딩단계
    // 2단계 - 연결단계(Connection 객체 획득)
    // 직접생성 혹은 pool에있는 생성된 객체를 가져다가
    // 사용할 수 도 있음(url,user, password)
    // 3단계 - 활용단계(CRUD)
    // 4단계 - Coonection 객체등 할당된 자원을 반납(폐쇄)
  
    public static void main(String[] args) {
        // 1단계
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("오없.. ㅠㅠ");
            // e.printStackTrace();
            System.exit(0); // 시스템종료
        }
        // 2단계
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "MADANG";
        String password = "madang";
        Connection conn = null; // 스코프 확장을 위해
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("url,user,password 점검!");
            System.exit(0);
        }
        // 3단계
        Statement stmt = null; // 질의문을 실어 전달하는 클래스
        ResultSet rs = null; // 질의결과를 담을 클래스
  
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM EMP";
            rs = stmt.executeQuery(sql);
  
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
  
        } catch (SQLException e) {
  
            e.printStackTrace();
        }
        // 4단계
        try {
            conn.close();
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
  
  }
  }