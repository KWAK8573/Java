
public class enum1 {
    public static void main(String[] args) {
        TraficSignal signal = TraficSignal.GREEN;
        TraficSignal nextSignal = null ;
        switch(signal) {
            case GREEN:
                nextSignal = TraficSignal.RED;
                break;
            case RED:
                nextSignal = TraficSignal.YELLOW;
                break;
            case YELLOW:
                nextSignal = TraficSignal.GREEN;
                break;
        }
        System.out.println("다음 신호는"+nextSignal.name()+" 입니다.");
    }
    
}
