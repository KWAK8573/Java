import java.util.Comparator;

public class MyScoreSort implements Comparator<Score01>{

    @Override
    public int compare(Score01 o1, Score01 o2) {
        int a = o1.kor+o1.eng;
        int b = o2.kor+o2.eng;
        return a-b; // b-a
    }
    
}
