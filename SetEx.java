import java.util.*;

// Set 순서없는 중복되지않는 자료구조
// HashSet, TreeSet, LinkeHashSet
public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 7가지의 공통 메소드
        // 객체추가 boolean add(E e) 
        set.add("강감찬");
        set.add("김유신");
        set.add("강감찬");
        System.out.println(set);
        // 객체검색 boolean conrains(Object obj)
        //  boolean isEmpty()
        
        //  Iterator<E> iterator() - 객체를 하나씩 끄집어낼수있다.
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        // 향상된 for문으로는 사용가능 (옛날 for문 사용불가)
        for(String x:set){
            System.out.println(x);
        }
        
        //  int size()
        // 객체 삭제 void clear()
        //          boolean remove(Object obj)
        //////////////////////////////////////////////
    }
    
}
