package chapter.l20_11_24;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

// import MyMemberDAO;
// import MyMember2;

public class TestMain {
    public void testOfselectAll() {
        try {
            MyMemberDAO dao = new MyMemberDAO();
            List<MyMember2> data = dao.selectAll();
            for(MyMember2 x:data){
                System.out.println(x);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void testOfDelete() {
        MyMemberDAO dao = new MyMemberDAO();
        try {
        int res = dao.delete(5L);
        if(res >=1) {
            System.out.println("데이터 삭제 성공!");
        }else {
            System.out.println("삭제할 데이터없음");
        }
    } catch (SQLException e) {

        e.printStackTrace();
    }  
}
    public void testOfInsert(){
        MyMemberDAO dao = new MyMemberDAO();
        MyMember2 vo = new MyMember2();
        vo.setId("Aba");
        vo.setDay(new Timestamp(System.currentTimeMillis()));
        vo.setPassword("1234");
        vo.setPhone("0100000004");
        vo.setIswithrew(0L);
        
        try {
            int res = dao.insert(vo);
            if(res>=1){
                System.out.println("입력성공");
            }else {
                System.out.println("입력실패");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        TestMain main = new TestMain();
        //main.testOfselectAll();
        //main.testOfDelete();
       main.testOfInsert();

    }
    
}