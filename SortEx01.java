import java.util.*;


public class SortEx01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add("홍길동");
        list1.add("윤시네");
        list1.add("강마루");
        list1.add("마루마루");
        System.out.println("정렬전:"+list1);
        Collections.sort(list1);// 오름차순
        System.out.println("정렬후:"+list1);
        Collections.reverse(list1);; // 내림차순 - 위오름차순먼저수행후
        System.out.println(list1);

        list2.add(57);
        list2.add(89);
        list2.add(23);
        list2.add(111);
        System.out.println("정렬전:"+list2);
        Collections.sort(list2);
        System.out.println("정렬후:"+list2);
        

        


    }
    
}
