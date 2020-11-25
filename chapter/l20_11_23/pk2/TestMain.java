package chapter.l20_11_23.pk2;

import java.util.List;

import chapter.l20_11_23.HomeBook;
import java.sql.SQLException;
import java.sql.Timestamp;




public class TestMain {
	public void testOfInsert() {
		HomeBookDAO dao = new HomeBookDAO();
		HomeBook vo = new HomeBook();
		vo.setDay(new Timestamp(System.currentTimeMillis()));
		vo.setSection("지출");
		vo.setAccounttitle("소모품비");
		vo.setRemark("a4 용지 1박스구매");
		vo.setRevenue(0L);
		vo.setExpense(45_000L);
		
		try {
			int res = dao.insert(vo);
    if(res>=1) {
    System.out.println("자료입력성공");
    }else {
    System.out.println("자료입력실패!");
    
    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testOfDelete() {
		HomeBookDAO dao = new HomeBookDAO();
		try {
			int res = dao.delete(5L);
			if(res >=1) {
				System.out.println("데이터 삭제 성공!");
			}else {
				System.out.println("삭제할 데이터없음!");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	public void testOfUpdate() {
		HomeBookDAO dao = new HomeBookDAO();
		HomeBook vo = new HomeBook();
		vo.setSerialno(1L);
		vo.setDay(new Timestamp(2020,10,1,10,10,47,00));
		vo.setSection("수입");
		vo.setAccounttitle("급료");
		vo.setRemark("10월분 급료");
		vo.setRevenue(1_800_000L);
		vo.setExpense(0L);
		try {
			int res = dao.update(vo);
			if (res>=1) {
				System.out.println("자료를 잘 수정 ma하였습니다.");
			}else {
				System.out.println("수정불가");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testOfSelect() {
		try {
			HomeBookDAO dao = new HomeBookDAO();
			HomeBook vo = dao.select(11L);
			System.out.println(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testOfSelectAll() {
		try {
			HomeBookDAO dao = new HomeBookDAO();
			List<HomeBook> data = dao.selectAll();
			for(HomeBook x:data) {
				System.out.println(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
    public static void main(String[] args) throws SQLException {
		TestMain main = new TestMain();    
		//main.testOfInsert();
		//main.testOfDelete();
		//main.testOfUpdate();
        //main.testOfSelect();
        main.testOfSelectAll();
        }
    }


    