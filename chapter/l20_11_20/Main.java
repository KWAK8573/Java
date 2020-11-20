package chapter.l20_11_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Score> scorelist = new ArrayList<>();

        Score a = new Score();
        a.setName("고길동");
        a.setKor(89);
        a.setMath(90);
        a.setEng(90);
        
        Score b = new Score();
        b.setName("둘리");
        b.setKor(89);
        b.setMath(80);
        b.setEng(100);
        
        Score c = new Score();
        c.setName("도우너");
        c.setKor(45);
        c.setMath(66);
        c.setEng(77);
      
        scorelist.add(a);
        scorelist.add(b);
        scorelist.add(c);

        System.out.println("전: "+scorelist);
        Collections.sort(scorelist,new SortByScore());
        System.out.println("후"+scorelist);



    }
    
}
