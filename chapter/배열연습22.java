package chapter;

import java.util.Arrays;

public class 배열연습22 {
    public static void main(String[] args) {
        if (args.length>0) {
            System.out.println(Arrays.toString(args));
            if(args[0].equals("1"))
                System.out.println("당신은 남자이군요.");
            else
                System.out.println("당신은 여자이군요.");

        }else{
            System.out.println("명령행 인수가 없습니다.");
        }
    }
    
}
