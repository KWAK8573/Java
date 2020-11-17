package chapter.sec02;
import java.sql.Date;

public class MethodTest {

    // 반환값없고 매개변수도없는 타입
    public void run() {
        System.out.println("그저 달릴 뿐입니다.");
    }
    public Date getDate(){
        return new Date(System.currentTimeMillis());
    }
    public static void displaySijak(){
        System.out.println("asdsadad");
        System.out.println("=============");
    }
    public String getLetter(int n){
        String res = "";
        if(n>=10 ) {
           res = polyLetter(n);

        }else{
            String[] str = {"영","일","이","삼","사","오","육","칠","팔","구"};
            res = str[n];
        }
       
        return res;
    }
    // 
    public String polyLetter(int num) {
        String res2 = num+"";

        //String[] array = new.polyLetter(""); 

        //  for(int i=0;i<array.length;i++) {
        //     System.out.println(array[i]); 
        //     } 
        
        // 숫자 ==> 문자 : 숫자 +""
        // 문자열을 낱자로 쪼개는법 " 365" ==> "3", "6","5"
        // 문자열의 수만큼 배열을만들고 그배열에 "365".subString(0,1)
      
         
        
        return res2;
     
        
    }
        
    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        displaySijak();
        test.run();
       System.out.println(test.getDate());
       System.out.println(test.getLetter(11));
       
      

    }
    
}

