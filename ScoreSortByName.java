import java.util.Comparator;

public class ScoreSortByName implements Comparator<Score01>{

    @Override
    public int compare(Score01 o1, Score01 o2) {
        
        return o1.name.compareTo(o2.name); // 내림차순o2 o1
    }
    
}
