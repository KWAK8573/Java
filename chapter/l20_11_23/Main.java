package chapter.l20_11_23;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public void testOfInsert() {
        MyMemberDAO dao = new MyMemberDAO();
        MyMember vo = new MyMember();
        vo.setId("ygs");
        vo.setName("유관순");
        vo.setPassword("1234");
        vo.setRemark("삼월하늘 가만히");

        try {
            dao.insert(vo);
            System.out.println(vo+"를 데이타 베이스에 잘 입력했습니다.");
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
    }
    public void testOfDelete(){
        MyMemberDAO dao = new MyMemberDAO();

        try {
            int res = dao.delete("ygs");
            if (res ==1 ){
                System.out.println("ygs 자료를 잘삭제했습니다.");
            }else{
                System.out.println("지울 자료가 없습니다");
            }
        } catch (SQLException e) {
    
            e.printStackTrace();
        }
    }
    public void testOfSelect(){
        MyMemberDAO dao = new MyMemberDAO();
        try {
            MyMember vo = dao.select("Lks");
            System.out.println(vo);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void testOfSelectAll(){
        MyMemberDAO dao = new MyMemberDAO();
    try{
        List<MyMember> data = dao.selectAll();
        for(MyMember x:data){
            System.out.println(x);
        }
    }catch (SQLException e) {
      
        e.printStackTrace();
    }
}
    public static void main(String[] args) {
        Main testor = new Main();
        //testor.testOfInsert();
        //testor.testOfDelete();
        //testor.testOfSelect();
        testor.testOfSelectAll();
    }
}
