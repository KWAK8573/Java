package chapter.l20_11_26;
import java.sql.*;
import java.util.*;


public class BookSaleListService {



	public List<Long> getTermOederids(Timestamp a,Timestamp b){
		return null;
	}


	public List<Map<String,String>> getSaleList(Map<String, String> map) throws SQLException {
		List<Map<String,String>> mapData = new ArrayList<>();
				
		 String sql = "SELECT ORDERS.ORDERID,CUSTOMER.NAME,BOOK.PRICE,ORDERS.SALEPRICE, ORDERS.ORDERDATE,ORDERS.SALEPRICE -BOOK.PRICE 할인액 FROM ORDERS ,BOOK,CUSTOMER WHERE ORDERS.CUSTID = CUSTOMER.CUSTID  AND ORDERS.BOOKID = BOOK.BOOKID  ";
		 Connection conn = ConnectionFactory.create(); 
	     PreparedStatement pstmt = conn.prepareStatement(sql);
	     ResultSet rs = pstmt.executeQuery();
	     // Result Set의 메타정보를 담은 객체생성
	     ResultSetMetaData rsmd = rs.getMetaData();
	     while(rs.next()) {
	    	 for(int i=0;i<rsmd.getColumnCount();i++) {
	    		map.put(rsmd.getCatalogName(i+1),rs.getString(i+1));
//	    		 System.out.print(rsmd.getCatalogName(i+1)+"\t");
//	    		 System.out.print(rs.getString(i+1)+"\t");
	    	 }
	    	 mapData.add(map);
//	    	 System.out.println();
	     }
	     conn.close();
	     return mapData;
	     
	    }
		
	}