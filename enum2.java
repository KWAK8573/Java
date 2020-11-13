
public class enum2{
public static void main(String[] args) {
    TraficSignal now = TraficSignal.GREEN;
    int nextNum = now.ordinal()+1;
    if(nextNum>2)nextNum =0;
    TraficSignal next = TraficSignal.values()[nextNum];
    System.out.println("다음신호는"+next.name()+"d입니다.");

}

}