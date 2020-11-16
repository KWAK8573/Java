

public class Tv {
    static String maker;
    // 클래스 초기화 블럭은 객체생성없이 사용하는 클래스 변수의 초기값을 설정
    static{
        // 클래스 변수를 초기화 할때 많은 로직이 동원되는 경우
        int rndNum = (int)(Math.random()*45)+1; // 1~45정수 만드는 방법
        maker = "LG"+rndNum;
    }

    String snHead; // 시리얼번호 앞번호
    String serialNo;
    static int snTail= 0; //
    // 클래스 초기화 블럭 
    // 인스턴스 초기화 블럭
    {
        snHead = System.currentTimeMillis()+"_";
        snTail++;
        serialNo = snHead + snTail;
    }


    // Tv(){}
    public String toString() {
        return maker+ " S/N:"+serialNo;
        }
    }

