// package chapter.l20_11_23;

// import java.sql.*;

// public class HelloJDBC3 {
    
//     String url = "jdbc:oracle:thin:@localhost:1521:xe";
//     String user = "MADANG";
//     String password = "madang";
//     Connection conn = null; // 스코프 확장을 위해
//     Statement stmt = null; // 질의문을 실어 전달하는 클래스
//     ResultSet rs = null; // 질의결과를 담을 클래스
    
//     public void test() throws ClassNotFoundException, SQLException {
//         // 1단계
//         Class.forName("oracle.jdbc.driver.OracleDriver");
        
//     // 2단계
    
//     conn = DriverManager.getConnection(url, user, password);
    
// // 3단계
//     stmt = conn.createStatement();
//     String sql = "SELECT * FROM EMP";
//     rs = stmt.executeQuery(sql);
//     while (rs.next()) {
//         System.out.println(
//         rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
//     }

//         public static void main(String[] args) {
//             try {
//                 new HelloJDBC3().test();
                
//             } catch (Exception e) {
//                 
//             }
//         }
//         // 4단계
           
  
//   }
//   }