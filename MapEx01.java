import java.util.*;

public class MapEx01 {
//     Map commonMap;
//     //초기화 블럭
// {    
//     commonMap = new HashMap<>();
//     commonMap.put("홍길동", 89);
//     commonMap.put("윤미향", 45);
//     commonMap.put("홍길동", 89);
//     commonMap.put("윤미향", 45);
//     commonMap.put("홍길동", 89);
//     commonMap.put("윤미향", 45);
// }
    public static void main(String[] args) {
        new MapEx01().test();
    }
    public void test(){
        testOfput();
        // testOfSeek();
        // testOfRemove();
    }
    //  테스트 케이스
    public void testOfput(){
        Map<String,Integer> map = new HashMap<>();
        map.put("홍길동", 89);
        map.put("윤미향", 45);
        System.out.println(map); // 간이출력
        for(String key:map.keySet()) {
            System.out.printf("%s = %d\n",key,map.get(key));
        }
        // 키만출력 
        System.out.println(map.keySet()); 
        
        // 벨류만출력
        System.out.println(map.values()); 
         for(Integer val :map.values()) {
            System.out.printf("%d ",val);
    }
}
    // public void testOfSeek(){
    //     System.out.println(commonMap.containsKey("홍길동"));
    //     System.out.println(commonMap.containsValue(100));
        
    // }
    // public void testOfRemove(){
    //     commonMap.remove("홍길동");
    //     System.out.println("삭제후 맵사이즈:"+commonMap.size());
    //     System.out.println("홍길동 삭제후 남은자료:"+commonMap);
    //     commonMap.clear();
    //     System.out.println("삭제후 맵사이즈:"+commonMap.size());
        
    // }

}
