import java.util.*;

// 객체의 정렬

public class SortEx02 {
    public static void main(String[] args) {
        List<Score01> Score01List = new ArrayList<>();
        Score01List.add(new Score01("홍길동",67,89));
        Score01List.add(new Score01("김충도",99,77));
        Score01List.add(new Score01("나경원",57,54));
        Score01List.add(new Score01("다람쥐",48,14));
        Score01List.add(new Score01("사다리",0,9));
        System.out.println("전: "+Score01List);
        Collections.sort(Score01List);
        System.err.println("후: "+Score01List);    
        Collections.shuffle(Score01List);
        System.out.println("섞섞: "+Score01List);
        Collections.sort(Score01List,new MyScoreSort());
        System.out.println("토탈:"+Score01List);
        Collections.sort(Score01List,new ScoreSortByName());
        System.out.println("이름"+ Score01List);
    }
    
}
