package chapter.l20_11_20;

import java.util.*;

public class SortByScore implements Comparator<Score>{

    @Override
    public int compare(Score o1, Score o2) {
        o1.setTotal();
        o1.setAvg();
        o2.setAvg();
        o2.setTotal();
       if(o1.getTotal()==o2.getTotal()){
           // 내림차순
            return o1.getMath()-o2.getMath();
       }
        return o2.getTotal()-o1.getTotal();
    }
    
    
}
