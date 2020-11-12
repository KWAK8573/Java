package chapter;

public class while01 {
    public static void main(String aras[]){
        //while 루프문 내에서 사용할 증감변수가 있다면
        // 반드시 while루프문 밖에서 선언해야함
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++; // 같음 ++i;
        }
        System.out.println(+i);

        int x = 0;
        for(x=0;x<=10;x++){
            System.out.println(x);
        }
        System.out.println(+x);
    

}
}
