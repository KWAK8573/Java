package chapter.l20_11_23.pk2;

import java.util.List;

import chapter.l20_11_23.HomeBook;

public class TestMain {
    public static void main(String[] args) {
        HomeBookDAO dao = new HomeBookDAO();
        List<HomeBook> data = dao.selectAll();
        for(HomeBook x:data){
            System.out.println(x);
        }
    }
    
}
