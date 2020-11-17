public class 묘사Main {
    // 폴리모피즘 사용 예
    public static void enter(Parent x){
        if (! x.familyClan.equals("덕수이씨")) {
            System.out.println("입장물가!");
            return;
        }
        System.out.println("입장가능~~");
    }
    
    public static void main(String[] args) {
        Humann[] mans = new Humann[]{
                new Humann("이광수",78,"서울","덕수이씨"),
                new Humann("이성계",33,"부산","전주이씨"),
                new Humann("이상제",33,"예산","덕수이씨"),
                new Humann("나훈애",73,"대전","덕수이씨"),
                new Humann("이상제",33,"예산","덕수이씨"),
                new Humann("이순신",67,"천안","경주이씨"),
        };
        for(Humann x:mans){
            System.out.println(x+"가 입장 하려합니다.");
            enter(x);
        }
    }
}
