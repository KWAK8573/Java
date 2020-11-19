import java.util.*;
public class MapEx02 {
    public static void main(String[] args) {
        Map<String,String> ehDic = new TreeMap<>();
        String[] words = {"boy","girl","girl_generation","zoo","give_up"};
        String[] means = {"소년","소녀","소녀시대","동물원","포기하다"};
        for(int i=0;i<words.length;i++){
            ehDic.put(words[i], means[i]);
        }
        for (String key:ehDic.keySet()){
            System.out.printf("%s = %s\n",key,ehDic.get(key));
        }
        ehDic.put("money", "돈");
        // 키만 추출하기
        Set<String> keys = ehDic.keySet();
        // 값만 추출하기
        Collection<String> valus = ehDic.values();
     
        

        System.out.println(keys);
        System.err.println(valus);






    }
}
