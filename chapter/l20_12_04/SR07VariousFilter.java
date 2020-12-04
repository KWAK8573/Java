package chapter.l20_12_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SR07VariousFilter {

    public static void main(String[] args) {
        List<Apple> data = Arrays.asList(
            new Apple("아이패드", 480, 399000, "red"),
            new Apple("아이폰", 180, 18000000, "red"),
            new Apple("맥북", 990, 2000000, "gray"),
            new Apple("아이맥", 5500, 5000000, "silver")
        );
        // red 색상 출력
        data.stream().filter(x->x.getColor().equals("red")).forEach(System.out::println);
        // 10000000 이상인 사과출력
        data.stream().filter(x->x.getPrice()>=1000000).forEach(System.out::println);

        System.out.println();
        List<Integer> data2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //짝수만 출력하기
        data2.stream().filter(x->x%2==0).forEach(System.out::println);

        //
        System.out.println();
        List<Apple> apples = myfilter(data,x->x.getColor().equals("gray"));
        apples.stream().forEach(System.out::println);

        // 사용자 정의 필터 응용 
        System.out.println();
        data.stream().filter(x -> new MyPreadicate().test(x,500)).forEach(System.out::println);

    }
    
        public static <T> List<T> myfilter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t:list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }
    
}
