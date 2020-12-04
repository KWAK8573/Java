package chapter.l20_12_04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

// Iterator와 Stream 의 비교
public class SR01IteratorNStream {
    public static void main(String[] args) {
        //list.add("홍길동");
        //list.add("성주원");
        //list.add("돌삼");
        List<String> list = Arrays.asList("홍길동","선주원","돌아가는삼각지");
        // 순차적접근방법 1
        // for(String:list){
        //     System.out.println(x);
        // }
        // 순차적접근방법 2
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 순차적접근방법 3
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); // 소비, 최종적으로 자료가없어짐
        }
        
        // 스트림 람다 방식 처리(1.8이후부터가능)
        Stream<String> stream = list.stream();
        stream.forEach(x->System.out.println(x));




    }
}
