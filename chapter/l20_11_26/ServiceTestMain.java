package chapter.l20_11_26;


import java.sql.SQLException;
import java.util.*;

public class ServiceTestMain {
  public static void main(String[] args) throws SQLException {
      OrdersService service = new OrdersService();

	List<Map<String,String>> saleList = service.getSaleList();

	for(Map<String,String> x:saleList) {
		System.out.println(x);
    }	
	}
}
