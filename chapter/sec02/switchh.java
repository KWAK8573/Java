package chapter.sec02;

public class switchh {
    public static void main(String args[]){
        int gen = 3;
        switch(gen){
            case 1:
                System.out.println("남자");
                break;
            case 2:
                System.out.println("여자");
                break; 
            case 3: //경우에따라 break를 일부러 없앨경우도 있음
                System.out.println("men");
                 break;
            case 4:
                System.out.println("women");
                break;
            default:
            System.out.println("????");
        }
    }
}
