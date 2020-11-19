import java.util.*;
// 리프클래스를 다른 리스트로 바꾸어도 10개의 공통 메소드 활용에는
// 변함없다 . (Array List , Vector , LinkedList)


public class ListEx {
    // Generics Type이 Strng 이다.
    // <> : 다이야 몬드 연산자 
    List<String> list = new LinkedList<>(); // Array List , Vector , LinkedList 결과값은전부같음

    private ListEx()  {
        // 객체추가 3가지 메소드 add(),add(),set()
        list.add("홍길동");list.add("혁거세");list.add("알지");
        list.add(1,"양만춘");// 자동으로 력거세와 알지는 밀림
        System.out.println(list);
        list.set(3, "김알지"); // update
        System.out.println(list);
        // 객체검색 contains(),get(),isEmpty(),size()
        System.out.println("자료에 \'양만춘\' 있는가?"+list.contains("양만춘"));
        // 1번 인덱스자리의 객체를 알고 싶다.
        System.out.println(list.get(1));
        // list 담긴 자료가 없는지를 확인 
        System.out.println(list.isEmpty());
        //담김 자료수 
        System.out.println(list.size());
        // 객체삭제 clear(), remove(), remove()
        // 인덱스로 제거
        System.out.println(list.remove(1)); // 제거됨과 동시에 제거된 객체가 리턴된
        // 객체로 제거
        System.out.println(list.remove("김알지")); // 제거되었는지를 boolean으로 리턴
        System.out.println(list.remove("김알지")); // false
        System.out.println("현재까지 남은 자료: "+list);
        list.clear(); // 반환이없고 전체를 깨끗이 지움 
        System.out.println(list);


    }
    // private void test() {

    // }
    public static void main(String[] args) {
        new ListEx();
        //new ListEx().test();

        
    }
    
}
