import java.util.*;

public class ListEx02 {
    public static void main(String[] args) {
        // Wrapper class(포장클래스)
        // 자바에서 기본형은 객체가아니다.
        // 그런데  Collection 자료구조에는 개체만을 담을 수 있다.
        // 그래서 사용자 편이를 위해 자동포장 기능을 만들었다.(1.5버젼이후)
        List<Integer> list =  new ArrayList<>();
        for(int i=0;i<10_000;i++) { // _ 콤마대용
           // list.add(new Integer(i)); 예전사용법
           // 자동포장
           list.add(i);
        }
        System.out.println("list size:"+list.size());
        // 0~ 35대 까지 조상수를 계산하여 리스트에 담기
        List<Long> listParentNums = new ArrayList<>();
        long accum = 0;
        for(int i=1; i<=35;i++){
            accum += Math.pow(2,i);
            listParentNums.add(accum);
        }
        int cnt = 0;
        for(Long x: listParentNums){
            System.out.println(++cnt +"대까지 조상의 수:"+x);
        }

        
    }
}
