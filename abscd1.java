import java.util.Arrays;

public class abscd1 {
    public static void main(String[] args) {
        int[] oldValue = {1,2,3};
        int[] newValue = new int[5];
        for (int i=0;i<oldValue.length;i++){
            newValue[i] = oldValue[i];
        }
        // 향상된 for문
        for(int x:newValue) {
            System.out.println(x+"\t");
        }
        System.out.println(); //줄만바꿔준다
        // 주의할점 shallow copy
        String[] names = {"홍경래","홍길동","윤선도","정철","황진이"};
        String[] names2 = names; // 복사 x, 동일배열자료를 공유한다는 의미
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));
        names2[0] = "홍진사";
        System.out.println(Arrays.toString(names2));
        System.out.println(Arrays.toString(names)); // side effect
        // deep copy
        String[] names3 = new String[names.length];
        for(int i=0;i<names.length;i++){
            names3[i] = names[i];
        }
        System.out.println(Arrays.toString(names3));
    }

    
}
