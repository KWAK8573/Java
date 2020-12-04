package chapter.l20_12_04;

import java.util.Arrays;

public class SR06FilterTest {

    public static void main(String[] args) {
        String[] names = new String[] {"둘리","마이콜","고길동","희동이","도우너","둘리","도우너","둘이","둘삼이"};

        // 중복제거 스트링
        System.out.println("중복제서스트림");
        Arrays.stream(names).distinct().forEach(System.out::println);

        // 성씨만 출력
        System.out.println("\n\'둘\'씨만출력");
        Arrays.stream(names).filter(n->n.startsWith("둘")).distinct().forEach(System.out::println);

        
    }
    
}
