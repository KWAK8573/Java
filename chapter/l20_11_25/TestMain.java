package chapter.l20_11_25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import chapter.l20_11_24.ConnectionFactory;

public class TestMain {
    public static void main(String[] args) {
        try {
            Connection conn = ConnectionFactory.create();
            String sql = "SELECT NAME, SUM(ORDERS.SALEPRICE) FROM CUSTOMER, ORDERS WHERE CUSTOMER.CUSTID = ORDERS.CUSTID GROUP BY CUSTOMER.NAME ORDER BY CUSTOMER.NAME";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.printf("%s\t %d\t \n",rs.getString(1),rs.getInt(2));
            }
            
            conn.close();
            rs.close();
        } catch (SQLException e) {
           
            e.printStackTrace();
        }

    }
    
}
