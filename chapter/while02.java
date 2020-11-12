package chapter;

import java.io.IOException;

public class while02 {
    public static void main(String[] aras)throws IOException{
     
        int speed = 0;
        boolean run = true;
        int keyCode = 0;
       while(true){
            if(keyCode !=13 && keyCode !=10) {
           System.out.println("=================");
           System.out.println("1.증속 2.감속 3.중지");
           System.out.println("=================");
           System.out.println("선택: ");
            }
       
       keyCode = System.in.read(); // 키보드에서 한글자입력

       if (keyCode==49) {//1
            speed +=10;
            System.out.println("현재속도: "+ speed);
        }else if(keyCode==50){
            speed -=10;
            System.out.println("현재속도: "+ speed);
        }else if(keyCode==51){
            run = false;
        
        System.out.println("프로그램종료");
        }
    }
}
    }
