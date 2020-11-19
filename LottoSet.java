import java.util.Set;
import java.util.TreeSet;


public class LottoSet {
    public LottoSet(){
        Set<Integer> LottoSet = new TreeSet<>();
        while(true) {
            int num = (int)(Math.random()*45)+1; // 1~45 범위의 정수
            LottoSet.add(num); // 중복 염려 없음
            if(LottoSet.size()==6) break;
        }
        System.out.println(LottoSet);

    }
    public static void main(String[] args) {
        new LottoSet();
        
    }
    
}
